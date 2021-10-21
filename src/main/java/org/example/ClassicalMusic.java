package org.example;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music {



    @Override
    public String getSong() {
        return "Moonlight sonata";
    }

    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialisation");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }



}
//    private ClassicalMusic(){   XML
//    }

//    public static ClassicalMusic getClassicalMusic(){
//        return new ClassicalMusic();
//    }
//
//
//    public void doMyInit(){
//        System.out.println("Doing my initialisation");
//    }
//
//    public void doMyDestroy(){
//        System.out.println("Doing my destruction");
//    }