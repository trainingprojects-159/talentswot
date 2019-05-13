package com.mphasis.talentswot.daoimpl;


import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.talentswot.daos.AdminDao;
import com.mphasis.talentswot.entities.Admin;
import com.mphasis.talentswot.exceptions.BuissnessException;

@Repository

public class AdminDaoImpl implements AdminDao {
	
	@Autowired
	SessionFactory sessionFactory;
	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}

	public Admin login(String a_id, String pass) throws BuissnessException {
		Session session=sessionFactory.openSession();
		TypedQuery<Admin> query=session.createQuery("from Admin where a_id=:a_id and pass=:pass");
		query.setParameter("a_id", a_id);
		query.setParameter("pass", pass);
		Admin admin=query.getSingleResult();
		return admin;
}
}
