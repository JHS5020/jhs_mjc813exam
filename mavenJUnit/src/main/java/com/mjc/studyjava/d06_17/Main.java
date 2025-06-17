package com.mjc.studyjava.d06_17;

import java.util.*;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        Computer c1 = new Computer("c1","Gen9_i3","4GB","SSD 500 GB","RTX2060");
        c1.booting();
        c1.myComputer();
        c1.shutdown();
        Computer c2 = new Computer("c2","Gen9_i5","8GB","HDD 500 GB","RTX2070");
        c2.booting();
        c2.myComputer();
        c2.shutdown();
        Computer c3 = new Computer("c3","Gen9_i7","16GB","SSD 1000 GB","RTX3060");
        c3.booting();
        c3.myComputer();
        c3.shutdown();
        Computer c4 = new Computer("c4","Gen9_i9","32GB","HDD 1000 GB","RTX3070");
        c4.booting();
        c4.myComputer();
        c4.shutdown();
        Computer c5 = new Computer("c5","Gen9_i11","64GB","SSD 2000 GB","RTX4060");
        c5.booting();
        c5.myComputer();
        c5.shutdown();


        //05_16
        Computer c6 = new Computer("c6","Gen9_i11","64GB");
        c6.booting();
        c6.myComputer();
        c6.clickMouseLeftButton(500,1000);
        c6.clickMouseRightButton(20,50);
        c6.shutdown();

        Set<Computer> set = new HashSet<Computer>();
        set.add(c1);
        set.add(c2);
        set.add(c3);
        set.add(c4);
        set.add(c2);
        Iterator<Computer> iter = set.iterator();
        while (iter.hasNext()) {
            Computer computer = iter.next();
            System.out.println();
        }
        for (Computer computer : set) {
            System.out.println(computer);
        }

        int size = set.size();

        System.out.println(size);

        StreamExample();
        Computer.computerStreamExample();




    }
    public static void StreamExample() {
        List<Product> list = new ArrayList<>();
        for( int i = 0; i < 10; i++ ) {
            Product p = new Product(i+1, "상품"+i, "회사", (int)(100000 * Math.random()));
            list.add(p);
        }
        list.stream().forEach(
                p -> System.out.println(p.toString())
        );

        int sum = list.stream().mapToInt(p -> p.getPrice()).sum();
        System.out.println(sum);
        double avg = list.stream().mapToInt(p -> p.getPrice()).average().getAsDouble();
        System.out.println(avg);

        // 상품 가격의 총합을 구해보세요 stream().map(Product) -> price 를 합계
        // 상품 가격의 평균을 구해보세요 stream().map(Product) -> price 를 평균
    }
}
