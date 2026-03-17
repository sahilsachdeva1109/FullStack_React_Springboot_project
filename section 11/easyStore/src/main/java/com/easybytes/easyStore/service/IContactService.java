package com.easybytes.easyStore.service;

import com.easybytes.easyStore.dto.ContactDto;
import com.easybytes.easyStore.dto.ProductDto;

import java.util.List;

public interface IContactService {
    boolean saveContact(ContactDto contactDto);
}
