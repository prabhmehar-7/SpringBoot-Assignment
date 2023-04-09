package com.springboot.assignment2.RestApiAssignment2.question1;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class Question1 {

    private MessageSource messageSource ;

    public Question1(MessageSource messageSource){
        this.messageSource = messageSource ;
    }

    //Question1
    //locale provides us the locale sent in the request else it would take the default locale
    //we can get message stored in messages.properties by using MessageSource
    @GetMapping("hello")
    public String helloInternationalization(){
        Locale locale = LocaleContextHolder.getLocale() ;
        return messageSource.getMessage("hello.message",null,"Error",locale);
    }
}
