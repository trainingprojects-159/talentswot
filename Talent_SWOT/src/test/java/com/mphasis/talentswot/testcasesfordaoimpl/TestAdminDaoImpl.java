package com.mphasis.talentswot.testcasesfordaoimpl;

import static org.junit.Assert.*;

import javax.transaction.Transactional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.mphasis.talentswot.configurations.AppConfig;
import com.mphasis.talentswot.daos.AdminDao;
import com.mphasis.talentswot.entities.Admin;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AppConfig.class)
@WebAppConfiguration
@Transactional
public class TestAdminDaoImpl {

	@Autowired
	AdminDao adminDao;

	@Test()
	public void test() {
		
		Admin admin=adminDao.login("ADMIN", "12345");
		assertEquals(admin.getA_id(), "ss");
		
//		Admin admin1=adminDao.login("ssa", "123");
//		assertEquals(admin1.getA_id(), "ssa");
	}

}
