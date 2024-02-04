package com.SpringOrmCrud;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.SpringOrm.Entities.Employee;
import com.SpringOrm.Entities.User;
import com.SpringOrm.Views.LoginFrame;
import com.SpringOrmCrud.Dao.EmployeeDao;
import com.SpringOrmCrud.Dao.UserDao;
import com.SpringOrmCrud.Dao.UserDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
       
    	LoginFrame loginFrame = context.getBean("loginFrame",LoginFrame.class);
    	
    	System.out.println("Done");
    	loginFrame.setVisible(true);

        
    }
}
