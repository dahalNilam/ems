package com.nilam.dao;

import java.util.List;

public interface GenericDao<T> {
	
	void create(T entity);
	void update(T entity);
	void delete(T entity);
	T findById(long id);
	List<T> findAll();

}
