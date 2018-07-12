package org.cargoo.ocs.repository;

import javax.transaction.Transactional;

import org.cargoo.epmocs.sql.entity.RoomInfo;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface RoomInfoRepository extends CrudRepository<RoomInfo, Long> {

}
