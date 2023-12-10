package com.mongo.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.crud.Repository.StudentRepository;
import com.mongo.crud.model.StudentModel;

@RestController
@RequestMapping("/curd/")
public class StudentController {

	@Autowired
	StudentRepository studentRepository;
	
	@PostMapping
	public String insertData(@RequestBody StudentModel studentModel) {
		try {
			studentRepository.save(studentModel);
			return "Student Data has ben added to the data base ";
		}catch (Exception e) {
			return "Student data has not added to the data base";
		}
	}
	
	@GetMapping 
	public List<StudentModel> getStudentDetails(){
		return studentRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getStudentDetailsById(@PathVariable int id){
		try {
			return ResponseEntity.ok(studentRepository.findById(id));
		}catch (Exception e) {
			return ResponseEntity.ok("Student data is not in the database for the given id = "+id);
		}
	}
	
	@PutMapping("/{id}")
	public String updateStudentData(@PathVariable int id, @RequestBody StudentModel studentModel) {
		try {
			studentRepository.save(studentModel);
			return "Student data as been updated for the given id = "+id;	
		}catch (Exception e) {
			return "Student dta as not updated for the given id = "+id;
		}
	}
	
	@DeleteMapping("/{id}")
	public String deleteStudentDataById(@PathVariable int id) {
		try {
			studentRepository.deleteById(id);
			return "Student data as been removed from the database for the given id = "+id;
		}catch (Exception e) {
			return "Student data as not removed from the database for the given id = "+id;

		}
	}
	
	@DeleteMapping
	public String deleteAllStudentData() {
		studentRepository.deleteAll();
		return "All Student data as been removed from thr database";
	}
}
