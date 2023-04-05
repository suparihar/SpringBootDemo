package com.example.springbootdemo;

import com.tivo.tws.inception.util.RequestMetaInfo;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
@Primary
public class FeRequestMetaInfo extends RequestMetaInfo {

    private String var2;

    @PostConstruct
    private void initFe() {
        System.out.println("######### FeRequestMetaInfo init");
        var2 = super.getAdditionalAttributeMap().hashCode() + "-456-" + System.currentTimeMillis();
        System.out.println("##### var2: " + var2);
    }

    @Override
    public String getCurrentRequestId() {
        System.out.println(" output ---#### -->" + var2);
        return var2;
    }

}
