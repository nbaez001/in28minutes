package com.in28minutes.spring.learn.game;

import com.in28minutes.spring.learn.interf.GamingConsole;
import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {

    public void up() {
        System.out.println("jump");
    }

    public void down() {
        System.out.println("down into a hole");
    }

    public void left() {
        System.out.println("stop");
    }

    public void right() {
        System.out.println("accelerate");
    }
}
