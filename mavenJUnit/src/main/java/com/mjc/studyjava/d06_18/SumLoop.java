package com.mjc.studyjava.d06_18;



public class SumLoop implements Runnable, ISumLoop {
    private long idx;
    public SumLoop(long idx){
        this.idx = idx;
    }

    @Override
    public void print(Long num){
        System.out.println(num);
    }

    @Override
    public void run() {
        long sum = 0L;
        for ( int i = 1; i <= idx; i++){
            sum += i;
        }
        this.print(sum);
    }
}
