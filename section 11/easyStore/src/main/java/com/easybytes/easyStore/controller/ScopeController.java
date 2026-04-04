package com.easybytes.easyStore.controller;

import com.easybytes.easyStore.scopes.ApplicationScopeBean;
import com.easybytes.easyStore.scopes.RequestScopeBean;
import com.easybytes.easyStore.scopes.SessionScopeBean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/scope")
public class ScopeController {
    private final RequestScopeBean requestScopeBean;
    private final SessionScopeBean sessionScopeBean;
    private final ApplicationScopeBean applicationScopeBean;

    public ScopeController(RequestScopeBean requestScopeBean, SessionScopeBean sessionScopeBean, ApplicationScopeBean applicationScopeBean) {
        this.requestScopeBean = requestScopeBean;
        this.sessionScopeBean = sessionScopeBean;
        this.applicationScopeBean = applicationScopeBean;
    }

    @GetMapping("/request")
    public ResponseEntity<String> testRequestScope(){
        requestScopeBean.setUserName("John Doe");
        return ResponseEntity.ok().body(requestScopeBean.getUserName());
    }

    @GetMapping("/session")
    public ResponseEntity<String> testSessionScope(){
        sessionScopeBean.setUserName("John Doe");
        return ResponseEntity.ok().body(sessionScopeBean.getUserName());
    }
    @GetMapping("/application")
    public ResponseEntity<Integer> testApplicationScope(){
        applicationScopeBean.increamentVisitorCount();
        return ResponseEntity.ok().body(applicationScopeBean.getVisitorCount());
    }

    @GetMapping("/test")
    public ResponseEntity<Integer> testScope(){
        return ResponseEntity.ok().body(applicationScopeBean.getVisitorCount());
    }

}
