package com.mphasis.talentswot.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.talentswot.daos.HRInterviewDao;
import com.mphasis.talentswot.entities.HRInterview;

@Repository
public class HRInterviewDaoImpl implements HRInterviewDao {
	
	@Autowired
	SessionFactory sessionFactory;
		
		public void setSessionFactory(SessionFactory sessionFactory)
		{
			this.sessionFactory=sessionFactory;
		}

	public void scheduleHRInterview(HRInterview h) {
		Session session=sessionFactory.openSession();
		   Transaction tr=session.beginTransaction();		
		   session.save(h);
		   tr.commit();
	}

	public HRInterview getHRInterviewById(int hr_i_id) {
		Session session=sessionFactory.openSession();
		   Transaction tr=session.beginTransaction();
		   HRInterview hr=(HRInterview)session.get(HRInterview.class,hr_i_id);
		   tr.commit();
		return hr;
	}
	
	public List<HRInterview> getAllCandidates() {
		Session session=sessionFactory.openSession(); 
		Transaction tr=session.beginTransaction();
		
		   List<HRInterview> hrc=session.createCriteria(HRInterview.class).list();
		   tr.commit();
		   return hrc;
	}

}
