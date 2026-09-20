package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {
	private StudentService studentService;
	//private final StudentRepository studentRepository;


	public StudentController(StudentService studentService)
	{
		this.studentService = studentService;
		
	}
	
	@PostMapping
	public Student addStudent(@RequestBody Student student)
	{
		return studentService.addStudent(student);
	}
	
	@GetMapping
	public List<Student> getAllStudents()
	{
		return studentService.getAllStudents();
	}
	
	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable Long id) {
	    return studentService.getStudentById(id);
	}
	
	@PutMapping("/{id}")
	public Student updatStudent(@PathVariable Long id,@RequestBody Student student){
		{
			return studentService.updateStudent(id, student);
		}
	}
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable Long id)
	{
		studentService.deleteStudent(id);
		return "Student deleted successfully.";
	}
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<String> handleRuntimeException(RuntimeException exception)
	{
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
		
	}
}
