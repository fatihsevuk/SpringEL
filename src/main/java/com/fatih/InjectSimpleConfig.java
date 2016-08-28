package com.fatih;

import org.springframework.stereotype.Service;

@Service("injectId")
public class InjectSimpleConfig {
	private String name="Fatih";
	private String surname="Sevük";
	private char gender='M';
	private int birthYear=1991;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	
	
	
}
