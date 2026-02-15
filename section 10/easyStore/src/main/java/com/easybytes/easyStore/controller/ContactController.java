package com.easybytes.easyStore.controller;

import com.easybytes.easyStore.dto.ContactDto;
import com.easybytes.easyStore.dto.ProductDto;
import com.easybytes.easyStore.service.IContactService;
import com.easybytes.easyStore.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/contacts")
@CrossOrigin(origins = "http://localhost:5173")

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
    public String saveContacts(@RequestBody ContactDto contactDto) {
        // Thread.sleep(1000);
        boolean isSaved = iContactService.saveContact(contactDto);

        if(isSaved){
            return " Request Processed Successfully.";
        }
        else{
            return "An Error occurred, Please try again or contact Support Team";
        }
    }

}
