package org.example.Question5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Marks {
    @Autowired
    private Subjects s ;
    Marks(Subjects obj){
        this.s = obj ;
    }

    void show(){
        s.showMarks();
    }
}
