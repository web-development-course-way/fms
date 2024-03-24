package com.teamc.fms.repo;

import com.teamc.fms.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    @Query("SELECT c FROM Country c ORDER BY c.code ASC")
    List<Country> findAllOrderByCodeAsc();

}