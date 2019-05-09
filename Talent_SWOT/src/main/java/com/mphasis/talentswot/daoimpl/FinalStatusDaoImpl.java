package com.mphasis.talentswot.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.talentswot.daos.FinalStatusDao;
import com.mphasis.talentswot.entities.FinalStatus;
import com.mphasis.talentswot.entities.HRInterview;

@Repository
public class FinalStatusDaoImpl implements FinalStatusDao{

	
	@Autowired
	SessionFactory sessionFactory;
		
		public void setSessionFactory(SessionFactory sessionFactory)
		{
			this.sessionFactory=sessionFactory;
		}
		

		public List<FinalStatus> getAll() {
			Session session=sessionFactory.openSession();
			Transaction tr=session.beginTransaction();
			List<FinalStatus> fs=session.createCriteria(FinalStatus.class).list();
			tr.commit();
			return fs;
		}

}
