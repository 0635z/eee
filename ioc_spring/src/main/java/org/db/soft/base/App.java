package org.db.soft.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appliction.xml");
        Person person = (Person) applicationContext.getBean("p");
        person.sayHello();
    }
}
