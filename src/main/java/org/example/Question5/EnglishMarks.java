package org.example.Question5;

import org.springframework.stereotype.Component;

@Component
public class EnglishMarks implements Subjects {
    public void showMarks() {
        System.out.println("English Marks = 90");
    }
}
