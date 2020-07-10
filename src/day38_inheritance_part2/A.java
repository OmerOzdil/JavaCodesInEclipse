package day38_inheritance_part2;

public class A {
	
	public String model; //  default within the same package no problem but different package  is not allowed.
	 				// public can be accessed even from different package by importing the package.
	
	public void display() {
		System.out.println("A mode: "+ model);
	}

}
