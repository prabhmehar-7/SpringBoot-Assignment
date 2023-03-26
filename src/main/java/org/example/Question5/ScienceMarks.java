package org.example.Question5;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ScienceMarks implements Subjects {
    public void showMarks() {
        System.out.println("Science Marks = 90");
    }
}
