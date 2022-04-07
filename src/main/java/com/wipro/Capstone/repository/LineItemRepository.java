package com.wipro.Capstone.repository;

import com.wipro.Capstone.entity.LineItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LineItemRepository extends MongoRepository<LineItem, String> {

}
