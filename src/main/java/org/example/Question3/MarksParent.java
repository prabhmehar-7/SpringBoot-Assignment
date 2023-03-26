package org.example.Question3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MarksParent {

    public static void main(String args[]){
        ApplicationContext applicationContext = SpringApplication.run(MarksParent.class,args);
        Marks marks = applicationContext.getBean(Marks.class);
        marks.show();
    }

}
