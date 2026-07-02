package com.amazon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amazon.entity.OTPEntity;

@Repository
public interface OTPRepository extends JpaRepository<OTPEntity, Integer>
{

}
