package com.sumit.crudapp.daoImpl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sumit.crudapp.dao.StudentDao;
import com.sumit.crudapp.generic.ParentAbstractClass;
import com.sumit.crudapp.model.Student;

@Repository @Transactional
public class StudentDaoImpl extends ParentAbstractClass<Student> implements StudentDao {

	@Override
	public void saveStudent(Student student) {
		super.saveEntity(student);
	}

	@Override
	public void deleteStudent(Student student) {
		super.deleteEntity(student);
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> listStudent = super.getAllEntity();
		return listStudent.isEmpty() ? null : listStudent;
	}

}
