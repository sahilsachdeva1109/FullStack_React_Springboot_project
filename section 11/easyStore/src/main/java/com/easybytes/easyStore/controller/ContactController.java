package com.easybytes.easyStore.controller;

import com.easybytes.easyStore.dto.ContactDto;
import com.easybytes.easyStore.dto.ProductDto;
import com.easybytes.easyStore.service.IContactService;
import com.easybytes.easyStore.service.IProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/contacts")

public class ContactController {

    private  final IContactService iContactService;
    @Autowired
    public ContactController(IProductService iProductService, IContactService iContactService) {
        this.iContactService = iContactService;
    }


    //    public ProductController(ProductRepo productRepo) {
//        this.productRepo = productRepo;
//    }

    // @RequestBody is used for returning only the body as a result
    @PostMapping
    public ResponseEntity<String> saveContacts( @Valid @RequestBody ContactDto contactDto) {
        // Thread.sleep(1000);
       iContactService.saveContact(contactDto);
            return ResponseEntity.status(HttpStatus.CREATED).body(" Request Processed Successfully.") ;
    }
}


