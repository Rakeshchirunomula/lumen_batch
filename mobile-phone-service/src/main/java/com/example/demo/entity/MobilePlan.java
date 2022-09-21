package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)
@Entity
@Table(name="lumen_mobile_plan")

public class MobilePlan {
	
	@Id
	@Column(name="plan_id")
	private int planId;
	@Column(name="plan_Name")
	private String planName;
	private double cost;  //If the identifier contains two diff words then we must mention @coulmn and we should give coulmn name
	private String validity;
}
