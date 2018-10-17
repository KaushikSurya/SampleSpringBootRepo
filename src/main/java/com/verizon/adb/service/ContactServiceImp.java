package com.verizon.adb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.adb.dao.ContactDao;
import com.verizon.adb.model.Contact;

@Service
public class ContactServiceImp implements ContactService {
	
	@Autowired
	private ContactDao contactDao;
	
	@Override
	public Contact getContactById(long contactId) {
		Contact contact = null;
		//if(contactDao.existsById(contactId))
		//	contact = contactDao.findById(contactId).get();
		Optional<Contact> optContact = contactDao.findById(contactId);
		if(optContact.isPresent())
			contact = optContact.get();
		return contact;
	}

	@Override
	public List<Contact> getAllContacts() {
		return contactDao.findAll();
	}

	@Override
	public Contact addContact(Contact contact) {
		return contactDao.save(contact);
	}

	@Override
	public Contact updateContact(Contact contact) {
		return contactDao.save(contact);
	}

	@Override
	public boolean deleteContact(long contactId) {
		boolean isDeleted = false;
		if(contactDao.existsById(contactId)) {
			contactDao.deleteById(contactId);
			isDeleted = true;
		}
		return isDeleted;
	}
	

	@Override
	public boolean existsByMbno(String mbno) {
		return contactDao.existsByMbno(mbno);
	}


	@Override
	public boolean existsByEmail(String email) {
		return contactDao.existsByEmail(email);
	}


	@Override
	public Contact findByMbno(String mbno) {
		return contactDao.findByMbno(mbno);
	}


	@Override
	public Contact findByEmail(String email) {
		return contactDao.findByEmail(email);
	}


	@Override
	public List<Contact> findAllByLname(String lname) {
		return contactDao.findAllByLname(lname);
	}

}
