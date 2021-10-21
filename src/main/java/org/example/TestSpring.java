package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

//        Comp comp = context.getBean("comp", Comp.class);
//        System.out.println(comp);

        context.close();

//        Music music = context.getBean("rockMusic", Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//
//        musicPlayer.playMusic();
//
//        Music music2 = context.getBean("classicalMusic", Music.class);
//
//        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
//
//        musicPlayer2.playMusic();

//        context.close();

        //-----------------------------------------------------------------

//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//
//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//
//        System.out.println(musicPlayer1==musicPlayer2);
//
//        System.out.println(musicPlayer1);
//        System.out.println(musicPlayer2);
//
//        musicPlayer1.setVolume(10);
//        System.out.println(musicPlayer1.getVolume());
//        System.out.println(musicPlayer2.getVolume());
////        musicPlayer.playMusic();
//
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//        System.out.println(1);
//        context.close();
//        System.out.println(2);
    }
}
