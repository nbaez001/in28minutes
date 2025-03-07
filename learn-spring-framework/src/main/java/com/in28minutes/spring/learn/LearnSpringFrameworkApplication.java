package com.in28minutes.spring.learn;

import com.in28minutes.spring.learn.game.PacmanGame;
import com.in28minutes.spring.learn.game.SuperContraGame;
import com.in28minutes.spring.learn.interf.GameRunner;
import com.in28minutes.spring.learn.game.MarioGame;
import com.in28minutes.spring.learn.interf.GamingConsole;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		GamingConsole game = new PacmanGame();
		GameRunner runner = new GameRunner(game);
		runner.run();
	}


}
