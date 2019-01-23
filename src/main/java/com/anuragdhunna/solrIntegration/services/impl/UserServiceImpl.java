package com.anuragdhunna.solrIntegration.services.impl;

import com.anuragdhunna.solrIntegration.documents.UserDoc;
import com.anuragdhunna.solrIntegration.services.UserService;
import com.anuragdhunna.solrIntegration.solrRepositories.UserSolrRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author anuragdhunna
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserSolrRepo userSolrRepo;

    @Override
    public void storeUser(UserDoc doc) {

        if (doc == null) {
            doc = new UserDoc();
            doc.setId("111");
            doc.setUsername("Anurag Dhunna");
            doc.setEmail("anurag.dhunna@gmail.com");
            doc.setPhoneNumber("9876543210");
        }
        userSolrRepo.save(doc);
    }

    @Override
    public List<UserDoc> getUsers() {
        return userSolrRepo.getUsers();
    }

    @Override
    public void deleteUser(String id) {
        userSolrRepo.deleteById(id);
    }
}
