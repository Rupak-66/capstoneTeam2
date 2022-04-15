package com.wipro.Capstone.repository;

import com.wipro.Capstone.dto.response.OrderResponse;
import com.wipro.Capstone.entity.Cart;
import com.wipro.Capstone.repository.CustomRepository.CustomCartRepository;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends MongoRepository<Cart, String>, CustomCartRepository {

    @Aggregation(pipeline = {
          "{$unwind: '$lineItems'}",
          "{$lookup:{from:'lineItem',localField:'lineItems.$id',foreignField:'_id',as:'orderItems'}}",
          "{$match:{'orderItems._id': ObjectId(?0)}}",
          "{$project:{'orderItems':1, '_id':0}}"
    })
    OrderResponse findByLineItem(String lineid);
}
