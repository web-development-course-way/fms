package com.teamc.fms.repository;


import com.teamc.fms.entity.TimeSlotEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeSlotRepository extends JpaRepository<TimeSlotEntity, Integer> {
}