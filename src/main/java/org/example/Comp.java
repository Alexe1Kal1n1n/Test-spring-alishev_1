package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Comp {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Comp(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Comp " + id + " " + musicPlayer.playMusic();
    }
}
