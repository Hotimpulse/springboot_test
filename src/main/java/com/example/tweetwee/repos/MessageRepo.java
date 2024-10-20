package com.example.tweetwee.repos;
import com.example.tweetwee.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Long> {
}
