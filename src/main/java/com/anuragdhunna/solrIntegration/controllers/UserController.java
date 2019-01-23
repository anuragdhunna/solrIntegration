package com.anuragdhunna.solrIntegration.controllers;

import com.anuragdhunna.solrIntegration.documents.UserDoc;
import com.anuragdhunna.solrIntegration.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author anuragdhunna
 */
@RestController
@RequestMapping(value = "/api/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="indexUsers", method = RequestMethod.POST)
    @ResponseBody
    public void indexProduct() {
        UserDoc userDoc = null;
        userService.storeUser(userDoc);
    }

    @RequestMapping(value ="getUsers", method = RequestMethod.GET)
    @ResponseBody
    public List<UserDoc> getUsers() {
        return userService.getUsers();
    }

    @RequestMapping(value ="deleteUser", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteUser(@RequestParam String id) {
        userService.deleteUser(id);
    }
}
