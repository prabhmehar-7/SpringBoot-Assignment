package org.example.Question5;

import org.springframework.stereotype.Component;

@Component
public class MathsMarks implements Subjects {
    public void showMarks(){
        System.out.println("Maths marks = 90");
    }
}
