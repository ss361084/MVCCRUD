package com.sumit.crudapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumit.crudapp.dao.StudentDao;
import com.sumit.crudapp.model.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDao studentDao;
	
	public void saveStudent(Student student) {
		studentDao.saveStudent(student);
	}
	
	public void deleteStudent(Student student) {
		studentDao.deleteStudent(student);
	}
	
	public List<Student> getAllStudent(){
		return studentDao.getAllStudent();
	}
}
