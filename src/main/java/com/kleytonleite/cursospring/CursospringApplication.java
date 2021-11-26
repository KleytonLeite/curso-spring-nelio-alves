package com.kleytonleite.cursospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursospringApplication {
	
	public static void mensagem() {
		System.out.println("Ola mundo");
	}

	public static void main(String[] args) {
		SpringApplication.run(CursospringApplication.class, args);
		mensagem();
	}

}
