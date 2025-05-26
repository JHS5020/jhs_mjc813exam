package com.hs.hs_library;

public class Calculator {
//    <dependency>
//    <groupId>com.hs</groupId>
//    <artifactId>hs_library</artifactId>
//    <version>1.0-SNAPSHOT</version>
//    </dependency>
    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
    public int mul(int a, int b) {
        return a * b;
    }
    public int div(int a, int b) {
        return a / b;
    }
    public int mod(int a, int b) {
        return a % b;
    }
    public double pow(int a, int b) {
        return Math.pow(a,b);
    }
    public int addb(int[] a){
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum += a[i];
        }
        return sum;
    }
}
