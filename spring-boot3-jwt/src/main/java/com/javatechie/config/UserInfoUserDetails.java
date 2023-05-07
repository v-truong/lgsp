package com.javatechie.config;

import com.javatechie.entity.UserInfo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import org.apache.logging.log4j.ThreadContext;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoUserDetails implements UserDetails {


    private String name;
    private String password;
    private List<GrantedAuthority> authorities;
    private int id;
    private String email;

    public UserInfoUserDetails(UserInfo userInfo) {
        name=userInfo.getName();
        password=userInfo.getPassword();
        authorities= Arrays.stream(userInfo.getRoles().split(","))
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
                ThreadContext.put("email",userInfo.getEmail());
        id=userInfo.getId();
        String id=String.valueOf(userInfo.getId());
        email=userInfo.getEmail();
        ThreadContext.put("id",id);
                System.out.println(authorities);
                System.out.println(userInfo.getEmail());
                System.out.println(userInfo.getId());

    }
    

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }
   
    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return name;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    public String getEmail() {
        return email;
    }
    public int getId() {
        return id;
    }
}
