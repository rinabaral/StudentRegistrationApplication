package com.register;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class StudentService {
	
	//get students using list
	private static List<Student> list = new ArrayList<>();
	static {
		list.add(new Student("101","John Daniel","john@gmail.com","Science","9848779797"));
		list.add(new Student("104","Paul Smith","paul@gmail.com","Science","9848779797"));
	}
	
	public List<Student> getStudents(){
		return list;
	}
	
	public Student getStudent(String id) {
		return list.stream().filter(student -> student.getId().equals(id)).findFirst().get();
	}
	public void addStudent(Student student){
		list.add(student);
	}
	public void updateStudent(Student student, String id) {
		int index = 0;
		for (Student student1: list) {
			if (student1.getId().equals(id)) {
				list.set(index, student);
			}
			index++;
		}
	}
	
	public void deleteStudent(String id) {
		list.removeIf(student -> student.getId().equals(id));
	}
	
}
