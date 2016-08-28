package com.fatih;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("personId")
public class Person {
	
	@Value("#{injectId.name}")
	private String name;
	
	@Value("#{injectId.surname}")
	private String surname;
	
	@Value("#{injectId.gender}")
	private char gender;
	
	@Value("#{injectId.birthYear}")
	private int birthYear;
	
	
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
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person[name: "+name+" surname: "+surname+" gender: "+gender+" birthYear: "+birthYear+"]";
	}
	

}
