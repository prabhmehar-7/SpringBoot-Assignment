package org.example.LooselyCoupled;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MarksLoosely {

    private Subjects s ;
    MarksLoosely(Subjects obj){
        this.s = obj ;
    }

    void show(){
        s.showMarks();
    }

    public static void main(String args[]){
        MarksLoosely ml1 = new MarksLoosely(new MathsMarks()) ;
        ml1.show();
        MarksLoosely ml2 = new MarksLoosely(new EnglishMarks()) ;
        ml2.show();
        MarksLoosely ml3 = new MarksLoosely(new ScienceMarks()) ;
        ml3.show();
    }
}
