package com.example.threads;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Mono;

import static com.example.threads.ATM.getMoney;
import static com.example.threads.ReactiveThread.calculateNumber;

@SpringBootApplication
public class ThreadsApplication {
	static int money = 200;
	static int number = 23;

	public static void main(String[] args) {
		SpringApplication.run(ThreadsApplication.class, args);

							//	7 лаба

		new Thread(() -> getMoney(100, "Tom")).start();
		new Thread(() -> getMoney(100, "Jerry")).start();
		new Thread(() -> getMoney(100, "Robert")).start();

							// 8 лаба

//		Mono<Integer> num = calculateNumber(number);
//		num.subscribe(System.out::println);
	}
}