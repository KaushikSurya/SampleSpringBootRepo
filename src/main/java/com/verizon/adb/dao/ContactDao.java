package com.verizon.adb.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verizon.adb.model.Contact;

@Repository
public interface ContactDao extends JpaRepository<Contact, Long> {
	
	boolean existsByMbno(String mbno);
	boolean existsByEmail(String email);
	
	Contact findByMbno(String mbno);
	Contact findByEmail(String email);
	
	List<Contact> findAllByLname(String lname);
	
}
