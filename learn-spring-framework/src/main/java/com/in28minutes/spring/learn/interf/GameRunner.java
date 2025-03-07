package com.in28minutes.spring.learn.interf;

import com.in28minutes.spring.learn.interf.GamingConsole;

public class GameRunner {
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
