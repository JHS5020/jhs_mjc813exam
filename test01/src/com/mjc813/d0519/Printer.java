package com.mjc813.d0519;

public class Printer {
    public static void main(String[] args) {
        //16번
//        Printer printer = new Printer();
//        printer.println(10);
//        printer.println(true);
//        printer.println(5.7);
//        printer.println("홍길동");
        //17번
        Printer.printerln(10);
        Printer.printerln(true);
        Printer.printerln(5.7);
        Printer.printerln("홍길동");
    }


    //16번
//    public void println(int x){
//        System.out.println(x);
//    }
//    public void println(boolean x){
//        System.out.println(x);
//    }
//    public void println(double x){
//        System.out.println(x);
//    }
//    public void println(String x){
//        System.out.println(x);
//    }
    //17번
    private static Printer printerln = new Printer();

    private Printer() {}
    public void println(int x){
        System.out.println(x);
    }
    public static Printer getPrinter() {
        return printerln;
    }
    public static void printerln(int n) {
        System.out.println(n);
    }
    public static void printerln(boolean n) {
        System.out.println(n);
    }
    public static void printerln(double n) {
        System.out.println(n);
    }
    public static void printerln(String n) {
        System.out.println(n);
    }
}
