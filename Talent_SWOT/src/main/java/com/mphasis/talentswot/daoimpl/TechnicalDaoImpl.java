package com.mphasis.talentswot.daoimpl;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.talentswot.daos.TechnicalDao;
import com.mphasis.talentswot.entities.Technical;

@Repository
@Transactional
public class TechnicalDaoImpl implements TechnicalDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Technical login(String email, String password) {
		
		Session session = sessionFactory.openSession();
		Query query=session.createQuery("from Technical where email=:email and pass=:pass");
		query.setParameter("email", email);
		query.setParameter("pass", password);
		Technical tech = (Technical) query.uniqueResult();
		return tech;
		
	}

}
