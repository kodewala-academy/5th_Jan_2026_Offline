package com.irctc.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.irctc.booking.entity.BookingEntity;

@Repository
public interface BookingRepository extends JpaRepository<BookingEntity, Long>
{

}
