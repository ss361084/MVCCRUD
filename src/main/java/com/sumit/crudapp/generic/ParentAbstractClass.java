package com.sumit.crudapp.generic;

import java.lang.reflect.ParameterizedType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class ParentAbstractClass<T> {

	private Class<T> parentClass;
	
	@Autowired
	private SessionFactory sessionFactory;

	public Class<T> getParentClass() {
		return parentClass;
	}

	public void setParentClass(Class<T> parentClass) {
		this.parentClass = parentClass;
	}
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public ParentAbstractClass() {
		this.parentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public void saveEntity(T obj) {
		getCurrentSession().persist(obj);
	}
	
	public void deleteEntity(T obj) {
		getCurrentSession().delete(obj);
	}
}
