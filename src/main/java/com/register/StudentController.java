package com.register;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentservice;
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		return this.studentservice.getStudents();
	}
	
	@GetMapping("/students/{id}")
		public Student getStudent(@PathVariable("id") String id) {
			return studentservice.getStudent(id);
		}
	@PostMapping("/students")
	public void addStudent(@RequestBody Student student) {
		studentservice.addStudent(student);
	}
	@PutMapping("/students/{id}")
	public void updateStudent(@RequestBody Student student, @PathVariable("id") String id) {
		studentservice.updateStudent(student, id);
	}
	@DeleteMapping("/students/{id}")
	public void deleteStudent(@PathVariable("id") String id) {
		studentservice.deleteStudent(id);
	}
	
	
}
