package com.mphasis.talentswot.testcasesfordaoimpl;

import static org.junit.Assert.*;

import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mphasis.talentswot.daos.AdminDao;
import com.mphasis.talentswot.entities.Admin;

public class TestAdminDaoImpl {

	@Autowired
	AdminDao adminDao;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected=NullPointerException.class)
	public void test() {
		
		Admin admin=adminDao.login("ss", "345");
		assertEquals(admin.getA_id(), "ss");
		
		Admin admin1=adminDao.login("ssa", "123");
		assertEquals(admin1.getA_id(), "ssa");
	}

}
