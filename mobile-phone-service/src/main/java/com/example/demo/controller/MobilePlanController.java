package com.example.demo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.MobilePlan;
import com.example.demo.services.MobilePlanService;

import lombok.AllArgsConstructor;
import lombok.Data;

@RestController
@RequestMapping(path="/api/v1/mobileplans")
@AllArgsConstructor
@Data

public class MobilePlanController {
	
	private MobilePlanService service;
	
	@GetMapping
	public List<MobilePlan> getAll(){
		return this.service.findAll();
	}
	
	@GetMapping("/srch/{id}")
	public MobilePlan findById(@PathVariable("id") int id) {
		return this.service.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<MobilePlan> add(@RequestBody MobilePlan entity){
		
		MobilePlan addedobj=this.service.add(entity);
		
		URI location=ServletUriComponentsBuilder
								.fromCurrentRequest()
										.path("/{id}")
											.buildAndExpand(entity.getPlanId())
												.toUri();
		
			return ResponseEntity.created(location).body(addedobj);
	}
	
	@PutMapping
    public ResponseEntity<MobilePlan> update(@RequestBody MobilePlan entity){
        this.service.update(entity);
        return ResponseEntity.ok().body(null);
    }
    
    @DeleteMapping(path="/{id}")
    public ResponseEntity<MobilePlan> remove(@PathVariable("id") int id){
        MobilePlan deletedElement=this.service.remove(id);
        return ResponseEntity.status(HttpStatus.OK).body(deletedElement);
    }
    
    @GetMapping(path = "findbyplan/{name}")
    public List<MobilePlan> findByPlanName(@PathVariable("name") String planName){
        return this.service.findByPlanName(planName);
    }
    
    @GetMapping(path = "findgreater/{cost}")
    public List<MobilePlan> findPlansGreaterThan(@PathVariable("cost") double cost){
        return this.service.findPlansGreaterThan(cost);
    }
    
    @PatchMapping("/{planName}/{updatedValue}")
    public ResponseEntity<String> updateValidity(@PathVariable("updatedValue") String updatedValue,@PathVariable("planName") String planName){
        int rowsUpdated=this.service.updateValidity(updatedValue, planName);
        return ResponseEntity.ok().body(rowsUpdated+"Rows Updated");
    }
}
