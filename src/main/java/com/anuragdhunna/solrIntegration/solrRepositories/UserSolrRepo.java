package com.anuragdhunna.solrIntegration.solrRepositories;

import com.anuragdhunna.solrIntegration.documents.UserDoc;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author anuragdhunna
 */

@Repository
@Qualifier("userSolrRepo")
public interface UserSolrRepo extends SolrCrudRepository<UserDoc, String> {

    @Query(value = "*:*")
    List<UserDoc> getUsers();

}
