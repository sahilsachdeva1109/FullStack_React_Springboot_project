package com.easybytes.easyStore.service.impl;

import com.easybytes.easyStore.Repository.ProductRepo;
import com.easybytes.easyStore.dto.ProductDto;
import com.easybytes.easyStore.entity.Product;
import com.easybytes.easyStore.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private  ProductRepo productRepo;


    @Override
    public List<ProductDto> getProducts() {
        return productRepo.findAll().stream().map(this::transformToDTo).collect(Collectors.toList());
    }

    private ProductDto transformToDTo(Product product){
        ProductDto productDto = new ProductDto();
        //  productDto.setProductId(product.getProductId());
        BeanUtils.copyProperties(product,productDto);

        return productDto;
    }
}
