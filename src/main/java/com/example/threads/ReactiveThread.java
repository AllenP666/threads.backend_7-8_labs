package com.example.threads;
import reactor.core.publisher.Mono;

public class ReactiveThread {
    public static Mono<Integer> calculateNumber(int number) {
        return toMono(number)
                .map(ReactiveThread::squareNumber)
                .map(ReactiveThread::calculateSumOfDigits);

    }

    public static int squareNumber(int number) {
        return number * number;
    }

    public static int calculateSumOfDigits(int number) {
        int sum = 0;
        int buf = number;
        while (buf != 0) {
            sum += buf % 10;
            buf /= 10;
        }
        number = number - sum;
        return number;
    }

    public static <T> Mono<T> toMono(T value) {
        return Mono.justOrEmpty(value);
    }
}
