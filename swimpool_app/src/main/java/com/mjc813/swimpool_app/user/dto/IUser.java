package com.mjc813.swimpool_app.user.dto;

import org.springframework.security.core.userdetails.UserDetails;

public interface IUser {
    Long getId();
    void setId(Long id);

    Integer getMaxLock();
    void setMaxLock(Integer maxLock);

    String getName();
    void setName(String name);

    String getPassword();
    void setPassword(String password);

    String getEmail();
    void setEmail(String email);

    String getPhoneNumber();
    void setPhoneNumber(String phoneNumber);

    String getRole();
    void setRole(String role);

    default void copyUsers(IUser i) {
        if ( i == null ) {
            return;
        }
        this.setId( i.getId() );
        this.setMaxLock( i.getMaxLock() );
        this.setName( i.getName() );
        this.setPassword( i.getPassword() );
        this.setEmail( i.getEmail() );
        this.setPhoneNumber( i.getPhoneNumber() );
        this.setRole( i.getRole() );

    }
}
