package com.example.Client.repository;

import com.example.Client.entity.CustomerMasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMasterRepository extends JpaRepository<CustomerMasterEntity,Long> {
}
