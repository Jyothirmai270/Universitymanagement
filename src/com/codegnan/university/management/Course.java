package com.codegnan.university.management;

public class Course {
	// Represents a course in the university
	private String title; // Title of the course
	// Constructor to initialize the course with a title
	public Course(String title) {
		this.title = title; // Set the course title
		}
	   // Getter method to retrieve the course title
	   public String getTitle() {
	       return title; // Return the course title
	       }
	   // Override toString method to provide a string representation of the course
	   @Override
	   public String toString() {
	       return title; // Return the course title as the string representation
	   }

}
