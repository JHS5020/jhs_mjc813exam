package com.mjc813.food_web.member.dto;

import lombok.Generated;

public interface IMember {
    Long getId();
    void setId(final Long Id);

    String getUserId();
    void setUserId(final String userId);

    String getPasswd();
    void setPasswd(final String passwd);

    String getName();
    void setName(final String name);

    String getNickName();
    String getPhoneNumber();
    String getEmail();
    String getRole();

    void setNickName(final String nickName);
    void setPhoneNumber(final String phoneNumber);
    void setEmail(final String email);
    void setRole(final String role);

    default void copyMembers(IMember isrc) {
        if ( isrc == null ) {
            return;
        }
        this.setId(isrc.getId());
        this.setUserId(isrc.getUserId());
        this.setPasswd(isrc.getPasswd());
        this.setName(isrc.getName());
        this.setNickName(isrc.getNickName());
        this.setPhoneNumber(isrc.getPhoneNumber());
        this.setEmail(isrc.getEmail());
        this.setRole(isrc.getRole());
    }

    default void copyMembersNotNull(IMember isrc) {
        if ( isrc == null ) {
            return;
        }
        if (isrc.getId() != null) {
            this.setId(isrc.getId());
        }
        if (isrc.getUserId() != null) {
            this.setUserId(isrc.getUserId());
        }
        if (isrc.getPasswd() != null) {
            this.setPasswd(isrc.getPasswd());
        }
        if (isrc.getName() != null) {
            this.setName(isrc.getName());
        }
        if (isrc.getNickName() != null) {
            this.setNickName(isrc.getNickName());
        }
        if (isrc.getPhoneNumber() != null) {
            this.setPhoneNumber(isrc.getPhoneNumber());
        }
        if (isrc.getEmail() != null) {
            this.setEmail(isrc.getEmail());
        }
        if (isrc.getRole() != null) {
            this.setRole(isrc.getRole());
        }
    }
}
