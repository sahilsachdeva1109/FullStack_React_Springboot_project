package com.easybytes.easyStore.scopes;

import com.easybytes.easyStore.controller.LoggingController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class RequestScopeBean {
    private static final Logger log = LoggerFactory.getLogger(LoggingController.class);

    private String userName;

    public RequestScopeBean(){
        log.info("RequestScopedBean initiallized");
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
