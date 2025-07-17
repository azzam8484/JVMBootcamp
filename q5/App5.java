package org.example1.q5;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("org.example1.q5")
public class App5
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(App5.class);

        BinarySearch2 search = context.getBean(BinarySearch2.class);

        int index=search.binarySearch(new int[] {4,2,6,2,76,2},5);
        System.out.println("Index: " + index);
    }
}
