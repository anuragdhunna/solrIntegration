package com.anuragdhunna.solrIntegration.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

/**
 * @author anuragdhunna
 */

@SolrDocument(solrCoreName = "user_core")
public class UserDoc {

    @Id
    @Indexed
    private String id;

    @Indexed(name = "username", type = "string")
    private String username;

    @Indexed(name = "email", type = "string")
    private String email;

    @Indexed(name = "phone_number", type = "string")
    private String phoneNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
