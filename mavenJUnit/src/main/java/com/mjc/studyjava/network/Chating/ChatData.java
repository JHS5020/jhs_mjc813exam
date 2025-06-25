package com.mjc.studyjava.network.Chating;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
public class ChatData {
    private final String roomName; // 방 이름
    private final Set<ClientSocketBuffer> participants = new HashSet<>();

    /**
     * 방에 클라이언트를 추가하고, 입장 알림을 전체에게 보냄
     */
    public synchronized void addClient(ClientSocketBuffer client) {
        participants.add(client);
        broadcast("[알림] " + client.getClientName() + " 님이 입장했습니다.", client);
    }

    /**
     * 방에서 클라이언트를 제거하고, 퇴장 알림을 전체에게 보냄
     */
    public synchronized void removeClient(ClientSocketBuffer client) {
        participants.remove(client);
        broadcast("[알림] " + client.getClientName() + " 님이 퇴장했습니다.", client);
    }

    /**
     * 현재 방에 참여 중인 모든 클라이언트에게 메시지 전달
     */
    public synchronized void broadcast(String message, ClientSocketBuffer sender) {
        for (ClientSocketBuffer client : participants) {
            if (client != sender) {
                client.sendMessage("[" + sender.getClientName() + "] " + message);
            }
        }
    }

    /**
     * 서버에서 방이 비었는지 확인할 때 사용
     */
    public synchronized boolean isEmpty() {
        return participants.isEmpty();
    }

    /**
     * 디버깅용: 현재 참가자 수 반환
     */
    public synchronized int getClientCount() {
        return participants.size();
    }
}
