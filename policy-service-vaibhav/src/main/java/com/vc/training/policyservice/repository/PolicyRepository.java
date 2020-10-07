package com.vc.training.policyservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.vc.training.policyservice.model.Policy;


public interface PolicyRepository extends MongoRepository<Policy, String> {

}
