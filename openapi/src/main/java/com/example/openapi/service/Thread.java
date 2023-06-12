package com.example.openapi.service;

import org.apache.logging.log4j.ThreadContext;
import org.springframework.stereotype.Service;

import com.example.common.config.Constants;

@Service
public class Thread {

    public void tttt(){
        if(ThreadContext.containsKey(Constants.Role));
    }
}
