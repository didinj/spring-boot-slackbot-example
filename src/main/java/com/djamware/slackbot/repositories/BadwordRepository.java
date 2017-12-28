package com.djamware.slackbot.repositories;

import com.djamware.slackbot.models.BadWord;
import org.springframework.data.repository.CrudRepository;

public interface BadwordRepository extends CrudRepository<BadWord, String> {

    Integer countByUser(String userId);
}
