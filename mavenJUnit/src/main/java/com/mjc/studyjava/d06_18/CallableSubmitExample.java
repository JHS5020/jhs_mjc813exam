package com.mjc.studyjava.d06_18;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class CallableSubmitExample {
    public static void main(String[] args) {
        Long ms = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for ( int i = 1; i <= 1000000; i++){
            final long idx = i;
            executorService.execute(new SumLoop(idx));
        }
        executorService.shutdown();
        ms = System.currentTimeMillis() - ms;
        System.out.printf("totalMills = %d\n", ms);
    }
}