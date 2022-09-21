package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MobilePlan;
import com.example.demo.repo.PlanRepository;

@Service

public class MobilePlanService {
	
	private PlanRepository repo;

	@Autowired
	public MobilePlanService(PlanRepository repo) {
		super();
		this.repo = repo;
	}
	
	public List<MobilePlan> findAll(){
		return this.repo.findAll();
	}
	
	public MobilePlan add(MobilePlan entity) {
		return this.repo.save(entity);
	}
	
	public MobilePlan findById(int id) {
		
		String message=new StringBuilder("Element With Given Id").append(id).append("Not Found").toString();
		return this.repo.findById(id).orElseThrow(()-> new RuntimeException(message));

	}
	
	public MobilePlan update(MobilePlan entity) {
		return this.repo.save(entity);
	}
	
	public MobilePlan remove(int id) {
		MobilePlan element=this.findById(id);
		this.repo.deleteById(id);
		return  element;
	}
	
	public List<MobilePlan> findByPlanName(String PlanName) {
		return this.repo.findByPlanName(PlanName);
	}
	
	public List<MobilePlan> findPlansGreaterThan(double amount){
        return this.repo.getCostGrtThan(amount);
    }
    
    public int updateValidity(String updatedValue,String planName) {
        return this.repo.updateValidity(updatedValue, planName);
    }
}
