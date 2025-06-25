package com.mjc.studyjava.network.Chating;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.net.Socket;

@Getter
@Setter
@AllArgsConstructor
public class ClientSocketBuffer extends Thread{
    private Socket socket;
    private BufferedReader br;
    private BufferedWriter bw;
    private IWrite iWrite;

    // 클라이언트 식별용 이름 반환 (IP 주소나 닉네임 등)
    public String getClientName() {
        return socket.getInetAddress().toString(); // 또는 사용자가 입력한 닉네임
    }

    // 서버가 메시지를 보낼 때 사용하는 메서드
    public void sendMessage(String message) {
        out.println(message); // 또는 BufferedWriter 사용 시 bw.write(...)
    }
}
