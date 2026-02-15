package com.easybytes.easyStore.scopes;

import com.easybytes.easyStore.controller.LoggingController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.SessionScope;

@Component
@ApplicationScope
public class ApplicationScopeBean {
    private static final Logger log = LoggerFactory.getLogger(LoggingController.class);

    public int getVisitorCount() {
        return visitorCount;
    }

    public void setVisitorCount(int visitorCount) {
        this.visitorCount = visitorCount;
    }

    private int visitorCount;

    public void increamentVisitorCount(){
        visitorCount++;
    }

    public ApplicationScopeBean(){
        log.info("ApplicationScopedBean initiallized");
    }


}
