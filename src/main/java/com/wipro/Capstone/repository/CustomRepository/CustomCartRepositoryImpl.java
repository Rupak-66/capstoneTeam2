package com.wipro.Capstone.repository.CustomRepository;

import com.wipro.Capstone.dto.requests.DeleteLineItemDto;
import com.wipro.Capstone.entity.Cart;
import com.wipro.Capstone.entity.LineItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

@Repository
public class CustomCartRepositoryImpl implements CustomCartRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void updateLineItem(LineItem lineItem) {
        Query query = new Query().addCriteria(Criteria.where("_id").is(lineItem.getCartId()));
        Update update = new Update().push("lineItems", lineItem);
        mongoTemplate.updateFirst(query, update, Cart.class);
    }

    @Override
    public void deleteLineItem(DeleteLineItemDto deleteLineItemDto) {
        Query query = new Query().addCriteria(Criteria.where("_id").is(deleteLineItemDto.getCartId()));
        Update update = new Update().pull("lineItems", deleteLineItemDto.getLineItemId());
        mongoTemplate.updateFirst(query, update, Cart.class);
    }

}
