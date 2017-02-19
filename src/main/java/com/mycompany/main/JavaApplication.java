/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main;

import com.mycompany.model.Employee;
import java.io.IOException;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author tehreem.nisa
 */
public class JavaApplication {
       public static void main(String[] args) throws IOException{  
          
         //Loading bean property file
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Instantiating a Manager
         Employee manager=(Employee) ctx.getBean("Manager");
        //Instantiating a Employee
         Employee worker=(Employee) ctx.getBean("Worker");
         
        manager.show();
         worker.show();
          
    }  
}
