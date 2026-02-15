package com.easybytes.easyStore.Repository;

import com.easybytes.easyStore.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<Contact, Long> {
}
