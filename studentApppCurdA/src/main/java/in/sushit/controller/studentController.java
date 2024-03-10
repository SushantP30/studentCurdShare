package in.sushit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.sushit.entity.studentData;
import in.sushit.repo.studentRepo;

@RestController
public class studentController {
	@Autowired
	private studentRepo repository;
//get all the students
	@GetMapping("/students")
	public List<studentData> getAllStudents(){
		List<studentData> students=repository.findAll();
		return students;
		
	}
	@PostMapping("/student")  
	public String createUser(@RequestBody studentData student)  
	{  
	studentData sevedStudent=repository.save(student);
	return "student Created!!";    
	} 
	
	@GetMapping("/student/{id}")
	public studentData getStudent(@PathVariable int id) {
		studentData student=repository.findById(id).get();
		return student;
		
	}
	
	@GetMapping("/student/update/{id}")
	public studentData updateStudent(@PathVariable int id) {
		studentData student=repository.findById(id).get();
		student.setName("Ganesh");
		student.setPercentage(67.00f);
		student.setBranch("civil");
		repository.save(student);
		return student;
		
	}
	@DeleteMapping("/student/{id}")  
	private String  deleteBook(@PathVariable("id") int id)   
	{  
	repository.deleteById(id);
	return "deleted Successfully!!";  
	}  
	
	
}
