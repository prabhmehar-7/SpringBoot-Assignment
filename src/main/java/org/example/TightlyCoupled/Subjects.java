package org.example.TightlyCoupled;

public class Subjects {

    private EnglishMarks eng ;
    Subjects(){
        eng = new EnglishMarks() ;
    }

    public void showMarks(){
        System.out.println(eng.englishMarks()) ;
    }

}
