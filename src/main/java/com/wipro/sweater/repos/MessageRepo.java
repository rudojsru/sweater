package com.wipro.sweater.repos;

import com.wipro.sweater.domain.Message;
import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Long> {

}
