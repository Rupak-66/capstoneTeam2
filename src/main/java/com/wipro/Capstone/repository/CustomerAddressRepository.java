package com.wipro.Capstone.repository;

import com.wipro.Capstone.entity.CustomerAddress;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerAddressRepository extends MongoRepository<CustomerAddress, String> {
}
