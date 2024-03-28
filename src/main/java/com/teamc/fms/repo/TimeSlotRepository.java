package com.teamc.fms.repo;

import com.teamc.fms.entity.Country;
import com.teamc.fms.entity.TimeSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TimeSlotRepository extends JpaRepository<TimeSlot, String> {



//    @Query("SELECT c FROM Country c ORDER BY c.code ASC")

}