package com.SpringOrmCrud;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.SpringOrm.Entities.User;
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
        System.out.println( "Hello World!" );
        User user = new User();
        
        user.setUserId(1);
        user.setUsername("om sadawarti");
        user.setPassword("2222");
        user.setStatus(1);
        
        UserDao userDao = context.getBean(UserDao.class);
        
        System.out.println("Record Inserted Succesfully!!");
        
    }
}
