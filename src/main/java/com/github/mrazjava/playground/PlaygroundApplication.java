package com.github.mrazjava.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlaygroundApplication {

	public static void main(String[] args) {

		Utils.drawProgressBar(10, 500, '=');
		SpringApplication.run(PlaygroundApplication.class, args);
	}

}
