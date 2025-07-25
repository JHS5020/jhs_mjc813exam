package com.mjc813.studyjava;

import java.util.HashSet;
import java.util.Set;

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
        int size = set.size();
        System.out.println(size);

    }
}
