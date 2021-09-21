package com.js.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.js.beans.CustomerDetails;
@Repository
public interface CustomerRepositryImpl extends CrudRepository<CustomerDetails, String> {

}
