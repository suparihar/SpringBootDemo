package com.tivo.example;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

//@Component
//@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RequestMetaInfo123 {

    private String var1;

    @PostConstruct
    private void init() {
        System.out.println("######## RequestMetaInfo init");
        var1 = "test123-" + System.currentTimeMillis();
    }

    public String getVar1() {
        return var1;
    }

    public void printVar() {
        System.out.println("output -- #### -->" + var1);
    }
}
