package com.teamc.fms.controller;

import com.teamc.fms.entity.Facility;
import com.teamc.fms.service.FacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/facilities")
public class FacilityController {

    @Autowired
    private FacilityService facilityService;

    @GetMapping("/")
    public List<Facility> getFacilities(){
        return facilityService.getFacilities();
    }

    @PostMapping("/")
    public String addFacility(@RequestBody Facility facility){

        facilityService.addFacility(facility);
        return "successfully added facility";
    }
    @DeleteMapping("/")
    public String deleteFacility(@RequestParam String id){

        facilityService.deleteFacility(id);
        return "successfully deleted";
    }

    @PutMapping("/")
    public String updateFacility(@RequestBody Facility facility){

         facilityService.updateFacility(facility);

        return "successfully updated";

    }

}
