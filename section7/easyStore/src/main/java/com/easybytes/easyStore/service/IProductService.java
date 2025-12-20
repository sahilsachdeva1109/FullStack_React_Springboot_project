package com.easybytes.easyStore.service;

import com.easybytes.easyStore.dto.ProductDto;
import com.easybytes.easyStore.entity.Product;

import java.util.List;

public interface IProductService {
    List<ProductDto> getProducts();
}
