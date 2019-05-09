package com.mphasis.talentswot.daoimpl;




import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.talentswot.daos.HRDao;
import com.mphasis.talentswot.entities.HR;

@Repository
@Transactional
public class HRDaoImpl implements HRDao {
	@Autowired
	SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		
		this.sessionFactory = sessionFactory;
	}

	public HR login(String hr_id, String pass) {
		Session session=sessionFactory.getCurrentSession();
		  
		   Query query=session.createQuery("from HR where hr_id=:hr_id and pass=:pass");
		   query.setParameter("hr_id",hr_id);
		   query.setParameter("pass", pass);
		   HR hr=(HR) query.uniqueResult();
		  
		return hr;

	}

}
