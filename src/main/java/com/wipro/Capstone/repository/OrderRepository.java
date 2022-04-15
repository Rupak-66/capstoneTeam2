package com.wipro.Capstone.repository;

import com.wipro.Capstone.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderRepository extends MongoRepository<Order, String> {
    @Query(value = "{'orderId' : '?0'}", delete = true)
    void findByIdAndDelete(String orderId);
}
