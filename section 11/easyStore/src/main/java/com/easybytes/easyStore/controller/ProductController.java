package com.easybytes.easyStore.controller;

import com.easybytes.easyStore.Repository.ProductRepo;
import com.easybytes.easyStore.dto.ProductDto;
import com.easybytes.easyStore.entity.Product;
import com.easybytes.easyStore.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {

    private  final IProductService iProductService;
    @Autowired
    public ProductController(IProductService iProductService) {
        this.iProductService = iProductService;
    }


    //    public ProductController(ProductRepo productRepo) {
//        this.productRepo = productRepo;
//    }
    @GetMapping
    public ResponseEntity<List<ProductDto>> getProducts() throws InterruptedException {
        // Thread.sleep(1000);
        List<ProductDto> productList = iProductService.getProducts();
        System.out.println("Testing code changes 1");
        return ResponseEntity.status(HttpStatus.OK).body(productList) ;
    }

}
