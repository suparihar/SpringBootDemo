package com.example.springbootdemo;

import com.tivo.tws.inception.util.RequestMetaInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private RequestMetaInfo requestMetaInfo;

    public void test() {
        requestMetaInfo.getCurrentRequestId();
    }


}
