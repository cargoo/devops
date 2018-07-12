package org.cargoo.ocs.repository;

import javax.transaction.Transactional;

import org.cargoo.epmocs.sql.entity.Address;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface AddressRepository extends CrudRepository<Address, String> {

}
