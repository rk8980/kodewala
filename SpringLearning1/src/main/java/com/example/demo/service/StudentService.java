package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }
    
    public List<Student> getAllStudents()
    {
    	return studentRepository.findAll();
    }
    
    public Student getStudentById(Long id)
    {
    	return studentRepository.findById(id).orElseThrow(
    			() -> new RuntimeException("Student not found with id :" + id));
    }
    
    public Student updateStudent(Long id, Student student)
    {
    	Student existingStudent = studentRepository.findById(id).orElse(null);
    	
    	if (existingStudent != null)
    	{
    		existingStudent.setName(student.getName());
    		existingStudent.setEmail(student.getEmail());
    		existingStudent.setCourse(student.getCourse());
    		existingStudent.setAge(student.getAge());
    		
    		return studentRepository.save(existingStudent);
    	}
		return null;
    }
    
    public void deleteStudent(Long id)
    {
    	studentRepository.deleteById(id);
    	
    }
}