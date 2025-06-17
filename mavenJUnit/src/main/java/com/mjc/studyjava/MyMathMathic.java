package com.mjc.studyjava;

import lombok.NonNull;

import java.math.BigDecimal;
import java.util.Random;

public class MyMathMathic {
    //산술연산 메소드 5개
    public int add(int a,int b){
        return a + b;
    }
    public int sub(int a,int b){
        return a - b;
    }
    public long mul(long a,long b){
        return a * b;
    }
    public int divM(int a,int b){
        return a / b;
    }
    public int divN(int a,int b){
        return a % b;
    }
    //비교연산 메소드 5개
    public boolean same(int a,int b){
        return a == b;
    }
    public boolean same(String a,String b){
        if(a == null || b == null){
            return false;
        }
        return a.equals(b);
    }
    public boolean notSame(int a,int b){
        return a != b;
    }
    public boolean big(int a,int b){
        return a > b;
    }
    public boolean small(int a,int b){
        return a < b;
    }
    //기타연산 하는 멤버메소드
    public int shiftLeft(int a, byte b){
        return a << b;
    }
    public int shiftRight(int a, byte b){
        return a >> b;
    }
    public int shiftRight0(int a, byte b){
        return a >>> b;
    }
    public long square(int a, byte b){
        long result = 1;
        for(int i = 0; i < b; i++){
            result *= a;
        }
        return result;
    }
    public int absolute(int a){
        if( a < 0 ){
            a = -a;
        }
        return a;
    }
    public String toHex(int a){
        return Integer.toHexString(a);
    }
    public String toBin(int a){
        return Integer.toBinaryString(a);
    }
    public String toOct(int a){
        return Integer.toOctalString(a);
    }
    public int toDec(String a){
        if(a == null){
            return 0;
        }
        return Integer.parseInt(a);
    }

    //05.09 계산기 클래스 업그레이드
    public int avg(int [] array){
        int average = 0;
        int sum = 0;
        if(array == null){
            return 0;
        }
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        average = sum / array.length;
        return average;
    }
    public int sum(int [] array){
        if(array == null){
            return 0;
        }
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
    public int sumOfNumber(int [] array, int number){
        int sum = 0;
        if(array == null){
            return 0;
        }
        for(int i = 0; i < array.length; i++){
            if(array[i] % number == 0) {
                sum += array[i];
            }
        }
        return sum;
    }
    public int sumOfLoop(int a, int b){
        int sum = 0;
        for(int i = a; i <= b; i++){
            sum += i;
        }
        return sum;
    }
    public int sumOfFav(int a, int b){
        int sum = 0;
        if(a >= b){
            sum += a;
            return sum;
        }
        return sum += b + sumOfFav(a, b - 1);
    }
    public BigDecimal getBigDecimal(int n, int s){
        BigDecimal a = new BigDecimal(n);
        BigDecimal b = new BigDecimal(s);
        BigDecimal c = new BigDecimal(-1);
        String sstr = String.valueOf(s);
        int length = sstr.length();
        BigDecimal result = b.movePointLeft(length);
        if(n < 0){
           c = c.multiply(result);
           return a.add(c);
        }
        return a.add(result);
    }
    public Integer[] getIntegerArray(int[] array){
        if(array == null){
            return null;
        }
        Integer[] boxed = new Integer[array.length];
        for(int i = 0; i < array.length; i++){
            boxed[i] = array[i];
        }
        return boxed;
    }
    public int[] makeRandomIntArray(int n){
        int[] randomArray = new int[n];
        for(int i = 0; i < n; i++){
            Random rand = new Random();
            randomArray[i] = rand.nextInt(100);;
        }
        return randomArray;
    }
    public String makeEncryptString(String text, int n){ // 더 해야함
        if(text == null){
            return "";
        }
        int k = 0;
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for(int i = 0; i < 2 + text.length() * (n-1); i++){ // = 25
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        for(int i = 1; i < sb.length(); i++){
            if(i % n == 0){
                sb.insert(i,text.charAt(k));
                k++;
            }
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
    public String makeDecryptString(String code, int n){
        if(code == null){
            return "";
        }
        String a = "";
        for(int i = 1; i < code.length(); i++){
            if(i % n == 0){
                a += code.charAt(i);
            }
        }


        return a;
    }
}