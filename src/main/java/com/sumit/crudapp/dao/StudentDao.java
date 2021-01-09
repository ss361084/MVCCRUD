package com.sumit.crudapp.dao;

import com.sumit.crudapp.model.Student;

public interface StudentDao {

	public void saveStudent(Student student);
	
	public void deleteStudent(Student student);
}
