package com.cmc.nthieu6.SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	public void use() {
		System.out.println("Riding bike");
	}
}
