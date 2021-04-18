package com.fluex404.springbootmultipledatabase;

import com.fluex404.springbootmultipledatabase.repo.db1.UserRepo;
import com.fluex404.springbootmultipledatabase.repo.db2.ProductRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;


@SpringBootTest
class SpringBootMultipleDatabaseApplicationTests {

	@Autowired
	UserRepo userRepo;
	@Autowired
	ProductRepo productRepo;

	@Test
	void contextLoads() {

		this.printDB1();
		this.printDB2();

	}

	@Transactional("db1TransactionManager")
	void printDB1(){
		System.out.println("user="+userRepo.findAll().size());
	}
	@Transactional("db2TransactionManager")
	void printDB2(){
		System.out.println("product="+productRepo.findAll().size());
	}

}
