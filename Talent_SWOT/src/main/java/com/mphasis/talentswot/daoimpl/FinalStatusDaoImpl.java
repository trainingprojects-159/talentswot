package com.mphasis.talentswot.daoimpl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mphasis.talentswot.daos.FinalStatusDao;
import com.mphasis.talentswot.entities.FinalStatus;



@Repository
public class FinalStatusDaoImpl implements FinalStatusDao{

	
	@Autowired
	SessionFactory sessionFactory;
		
		public void setSessionFactory(SessionFactory sessionFactory)
		{
			this.sessionFactory=sessionFactory;
		}

		@Override
		public void addFinalStatus(FinalStatus fs) {
			Session session=sessionFactory.openSession();
			Transaction tr=session.beginTransaction();
			session.save(fs);
			tr.commit();
			
		}

		@Override
		public List<FinalStatus> getFinalStatusBystatus(String Status) {
			
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			List<FinalStatus> finalStatus = session.createQuery("from FinalStatus",FinalStatus.class).list();
			transaction.commit();
			return finalStatus;
			
		}

		@Override
		public List<FinalStatus> getAllFinalStatus() {
			Session session=sessionFactory.openSession();
			Transaction tr=session.beginTransaction();
			List<FinalStatus> fs = session.createQuery("from FinalStatus",FinalStatus.class).list();
			tr.commit();
			return fs;
		}
		

		

}
