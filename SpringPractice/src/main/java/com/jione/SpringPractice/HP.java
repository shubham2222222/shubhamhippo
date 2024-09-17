package com.jione.SpringPractice;

import org.springframework.stereotype.Component;

@Component
public class HP implements Laptop1{
	public void disp() {
		System.out.println("Laptop is HP.....");
	}
}
