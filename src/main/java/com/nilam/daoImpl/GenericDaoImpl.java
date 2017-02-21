package com.nilam.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.nilam.dao.GenericDao;
import com.nilam.util.HibernateUtil;

@SuppressWarnings("unchecked")
public abstract class GenericDaoImpl<T> implements GenericDao<T> {
	
	private Session session = HibernateUtil.getSessionFactory().openSession();
    
	protected Class<T> daoType;

	public void setDaoType(Class<T> type) {
			daoType = type;
	}
	
	@Override
	public void create(T entity) {
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
	}
	
	@Override
	public void update(T entity) {
		session.update(entity);
	}
	
	@Override
	public void delete(T entity) {
		session.delete(entity);
	}
	
	@Override
	public T findById(long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		return (T) session.get(daoType, id);
	}
	
	@Override
	public List<T> findAll() {
		session.beginTransaction();
		Criteria crit = session.createCriteria(daoType);
		session.getTransaction().commit();
		return crit.list();
	}

}
