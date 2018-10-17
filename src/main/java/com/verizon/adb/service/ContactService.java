package com.verizon.adb.service;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.verizon.adb.model.Contact;

@Repository
public interface ContactService {
	
	Contact getContactById(long contactId);
	List<Contact> getAllContacts();
	Contact addContact(Contact contact);
	Contact updateContact(Contact contact);
	boolean deleteContact(long contactId);
	boolean existsByMbno(String mbno);
	boolean existsByEmail(String email);
	Contact findByMbno(String mbno);
	Contact findByEmail(String email);
	List<Contact> findAllByLname(String lname);
	
}