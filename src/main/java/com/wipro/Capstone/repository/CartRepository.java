package com.wipro.Capstone.repository;

import com.wipro.Capstone.entity.Cart;
import com.wipro.Capstone.repository.CustomRepository.CustomCartRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends MongoRepository<Cart, String>, CustomCartRepository {

}
