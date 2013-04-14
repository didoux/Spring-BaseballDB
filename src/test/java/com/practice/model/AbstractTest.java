package com.practice.model;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.apache.naming.java.javaURLContextFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public abstract class AbstractTest  {

	@BeforeClass
	public static void setUpClass() throws Exception {
		System.setProperty(Context.INITIAL_CONTEXT_FACTORY,
				javaURLContextFactory.class.getName());
		System.setProperty(Context.URL_PKG_PREFIXES, "org.apache.naming");
		InitialContext ic = new InitialContext();

		ic.createSubcontext("java:");
		ic.createSubcontext("java:comp");
		ic.createSubcontext("java:comp/env");
		ic.createSubcontext("java:comp/env/jdbc");

		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setURL("jdbc:mysql://localhost:3306/lahman");
		dataSource.setUser("root");
		dataSource.setPassword("mysql");
		ic.bind("java:comp/env/jdbc/baseballDS", dataSource);
	}

	@AfterClass
	public static void tearDownClass() throws Exception {

		InitialContext ic = new InitialContext();

		ic.unbind("java:comp/env/jdbc/baseballDS");
	}
}
