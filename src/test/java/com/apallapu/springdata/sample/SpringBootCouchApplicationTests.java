package com.apallapu.springdata.sample;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.apallapu.springdata.sample.repositories.CompanyRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootCouchApplicationTests {

	@Autowired
	protected CompanyRepository businessUnityRepository;

	@Before
	public void deleteAll(){
		businessUnityRepository.deleteAll();
	}

	@Test
	public void contextLoads() {
	}

}
