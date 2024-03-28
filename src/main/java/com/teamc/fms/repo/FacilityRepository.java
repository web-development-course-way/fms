package com.teamc.fms.repo;

import com.teamc.fms.entity.Facility;
import com.teamc.fms.entity.TimeSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacilityRepository extends JpaRepository<Facility, String> {



//    @Query("SELECT c FROM Country c ORDER BY c.code ASC")

}