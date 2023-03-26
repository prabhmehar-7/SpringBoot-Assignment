package org.example.Question3;

import org.springframework.stereotype.Component;

@Component
public class ScienceMarks implements Subjects {
    public void showMarks() {
        System.out.println("Science Marks = 90");
    }
}
