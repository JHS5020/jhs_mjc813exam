package com.mjc813.d0519;

//13,14,15
public class Member {
    public static void main(String[] args) {
        Member a131415 = new Member("hong","12345");
        boolean result = a131415.login("hong","12345");
        if(result){
            System.out.println("로그인 되었습니다.");
            a131415.logout("hong");
        } else{
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
    }
    private String name;
    private String id;
    private String password;
    private int age;

//    public Member(String name, String id){
//        this.name = name;
//        this.id = id;
//    }
    public Member(String id, String password){
        this.id = id;
        this.password = password;
    }
    public boolean login(String id,String password){
        return this.id.equals(id) && this.password.equals(password);
    }
    public void logout(String id){
        System.out.println(this.id + " 님이 로그아웃 되었습니다.");
    }
}
