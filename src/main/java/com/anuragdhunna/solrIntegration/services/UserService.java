package com.anuragdhunna.solrIntegration.services;

import com.anuragdhunna.solrIntegration.documents.UserDoc;

import java.util.List;

/**
 * @author anuragdhunna
 */
public interface UserService {

    void storeUser(UserDoc doc);
    List<UserDoc> getUsers();
    void deleteUser(String id);
}
