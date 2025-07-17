//package com.mjc.studyjava.network.Chating;
//
//
//
//import java.io.*;
//import java.net.InetSocketAddress;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Scanner;
//
//public class ServerApp extends Thread{
//    public static final String exitCommand = "ei@939()#*~@)(>.x93)";
//    public static final String exitWord = "@exit";
//
//    private final Map<String, ChatData> chatRooms = new HashMap<>();
//    private List<ClientSocketBuffer> clients = new LinkedList<>();
//    private ServerSocket serverSocket;
//
//    public void init(int port) throws IOException {
//        this.serverSocket = new ServerSocket();
//        this.serverSocket.bind(new InetSocketAddress(port));
//    }
//
//    public void accept() throws IOException {
//        Socket socket = this.serverSocket.accept();
//        System.out.printf("accept Client : %s\n", socket);
//        BufferedReader br = new BufferedReader(
//                new InputStreamReader(socket.getInputStream())
//        );
//        BufferedWriter bw = new BufferedWriter(
//                new OutputStreamWriter(socket.getOutputStream())
//        );
//        ClientSocketBuffer csb = new ClientSocketBuffer(socket
//                , br, bw, this);
//        csb.start();
//        synchronized (this.clients) {
//            this.clients.add(csb);
//        }
//    }
//
//    public void sendAllTargets(String str) {
//        for ( com.mjc.studyjava.network.Q.ClientSocketBuffer csb : clients) {
//            try {
//                csb.write(str);
//            } catch (IOException ex) {
//                System.out.printf("해당 클라이언트[%s] 접속 끊겼음", csb.getSocket().getRemoteSocketAddress());
//            }
//        }
//    }
//
//    @Override
//    public void deleteTarget(com.mjc.studyjava.network.Q.ClientSocketBuffer deletObject) {
//        synchronized (this.clients) {
//            this.clients.remove(deletObject);
//        }
//    }
//    public void close() throws IOException {
//        this.serverSocket.close();
//    }
//
//    public void write(String str) throws IOException {
//        if(exitWord.equals(str)) {
//            str = exitCommand;
//        }
//        this.sendAllTargets(str);
//    }
//
//
//    public static void main(String[] args) throws IOException {
//        System.out.println("ServerJavaPgm start");
//
//        ServerApp sjp = new ServerApp();
//        try {
//            sjp.init(59999);;
//            sjp.start();
//
//            Scanner scan = new Scanner(System.in);
//            while( true ) {
//                String str = scan.nextLine();   // 키보드 입력 대기, 블로킹상태
//                sjp.write(str);
//                if( exitWord.equals(str) ) {
//                    break;
//                }
//            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        } finally {
//            System.exit(0);
//        }
//    }
//    @Override
//    public void run() {
//        try {
//            while(true) {
//                int i = 0;
//                int j = 0;
//                int k = 0;
//                this.accept();
//                int l = 0;
//                int m = 0;
//                int n = 0;
//            }
//        } catch (Exception ex) {
//            System.out.println("서버 종료");
//        } finally {
//            try {
//                this.close();
//            } catch (IOException e) {
//            }
//        }
//    }
//}
