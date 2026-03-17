package com.easybytes.easyStore.service.impl;

import com.easybytes.easyStore.Repository.ContactRepo;
import com.easybytes.easyStore.Repository.ProductRepo;
import com.easybytes.easyStore.dto.ContactDto;
import com.easybytes.easyStore.dto.ProductDto;
import com.easybytes.easyStore.entity.Contact;
import com.easybytes.easyStore.entity.Product;
import com.easybytes.easyStore.service.IContactService;
import com.easybytes.easyStore.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements IContactService {

    private final ContactRepo contactRepo;

    public ContactServiceImpl(ContactRepo contactRepo) {
        this.contactRepo = contactRepo;
    }

    private Contact transformToEntity(ContactDto contactDto){

            Contact contact  = new Contact();
            //  productDto.setProductId(product.getProductId());
            BeanUtils.copyProperties(contactDto ,contact);

        return contact;

    }

    @Override
    public boolean saveContact(ContactDto contactDto) {
            Contact contact = transformToEntity(contactDto);
//            contact.setCreatedAt(Instant.now());
//            contact.setCreatedBy(contactDto.getName());
            contactRepo.save(contact);
            return true;
     }

}

