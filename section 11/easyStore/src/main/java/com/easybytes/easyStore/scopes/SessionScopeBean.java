package com.easybytes.easyStore.scopes;

import com.easybytes.easyStore.controller.LoggingController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class SessionScopeBean {
    private static final Logger log = LoggerFactory.getLogger(LoggingController.class);

    private String userName;

    public SessionScopeBean(){
        log.info("SessionScopedBean initiallized");
    }

  

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
