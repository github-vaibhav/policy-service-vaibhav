package com.vc.training.policyservice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vc.training.policyservice.model.Customer;
import com.vc.training.policyservice.model.Policy;
import com.vc.training.policyservice.repository.PolicyRepository;

@Service
public class PolicyService {
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	PolicyRepository policyRepository;
	
	public Policy createPolicy(Policy policy) {
		Customer customer;
		customer = customerService.getCustomerDetails(policy.getCustomerDetails().getCustomerId());
		policy.setCustomerDetails(customer);
		return policyRepository.save(policy);
	}

	public List<Policy> getPolicies() {
		return policyRepository.findAll();
	}
	
	public Policy createExchangePolicy(Policy policy) {
		Customer customer;
		customer = customerService.getExchangeCustomerDetails(policy.getCustomerDetails().getCustomerId());
		policy.setCustomerDetails(customer);
		return policyRepository.save(policy);
	}
	
	public Policy createObjectPolicy(Policy policy) {
		Customer customer;
		customer = customerService.getObjectCustomerDetails(policy.getCustomerDetails().getCustomerId());
		policy.setCustomerDetails(customer);
		return policyRepository.save(policy);
	}

}