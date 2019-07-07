package com.ghazela.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ghazela.model.CustomerType;
@Repository
public interface CustomerTypeRepository extends JpaRepository<CustomerType, Long> {

}
