package com.jione.SpringPractice;

import org.springframework.stereotype.Component;

//@Component
public class Subject {
		
	public String sub;

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public Subject(String sub) {
		super();
		this.sub = sub;
	}

	@Override
	public String toString() {
		return "Subject [sub=" + sub + "]";
	}
}
