package com.SpringOrmCrud;

import java.util.Properties;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.SpringOrm.Entities.Employee;
import com.SpringOrm.Entities.User;
import com.SpringOrm.Views.EmployeeFrame;
import com.SpringOrm.Views.LoginFrame;
import com.SpringOrmCrud.Dao.UserDaoImpl;

@Configuration
@ComponentScan(basePackages = {"com.SpringOrmCrud.Entities , com.SpringOrmCrud.Dao"})
@EnableTransactionManagement

public class JavaConfig {
	
	
	
	@Bean(name = "dataSource")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUsername("root");
		dataSource.setPassword("Om/525325..??");
		dataSource.setUrl("jdbc:mysql://localhost:3306/springHibernate");
		
		return dataSource;
	}
	
	@Bean(name = "localSF")
	public LocalSessionFactoryBean getSessionFactory() {
		
		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
		
		Properties  properties = new Properties();
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL55Dialect");
		//hibernate.hbm2ddl.auto=update

		sessionFactoryBean.setDataSource(getDataSource());
		sessionFactoryBean.setHibernateProperties(properties);
		sessionFactoryBean.setAnnotatedClasses(User.class , Employee.class);
		
		return sessionFactoryBean;
		
	}
	
	@Bean("hibernateTemplate")
	public HibernateTemplate getHibernateTemplate() {
		HibernateTemplate template = new HibernateTemplate();
		template.setSessionFactory(getSessionFactory().getObject());
		return template;
	}
	@Bean("transactionManager")
	public HibernateTransactionManager gethibernateTransactionManager() {
		
		HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager();
		hibernateTransactionManager.setSessionFactory(getSessionFactory().getObject());

		return hibernateTransactionManager;
	}
        
        
        @Bean(name = "loginFrame")
        public LoginFrame getLoginFrame(){
        
        LoginFrame loginframe = new LoginFrame();
        return loginframe;
        }
	
        @Bean(name  = "empFrame")
        public EmployeeFrame getEmployeeFrame(){
            EmployeeFrame empFrame = new EmployeeFrame();
            
            return empFrame;
        }

}
