package org.cargoo.ocs.repository;

import java.util.List;

import org.cargoo.epmocs.sql.entity.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Long> {
	List<Contact> findByName(String name);
}
