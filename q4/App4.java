package org.example1.q4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("org.example1.q4")
public class App4 {


        public static void main(String[] args)
        {
            ApplicationContext context=new AnnotationConfigApplicationContext(App4.class);

            Employee bean=context.getBean(Employee.class);

            System.out.println("Bean toString(): " + bean);


            System.out.println("Individual properties:");
            System.out.println("Name: " + bean.getName());
            System.out.println("Competency: " + bean.getCompetency());
            System.out.println("Age: " + bean.getAge());
            System.out.println("Salary: "+bean.getSalary());
        }
}
