package de.kattendick.tf.persistence;

import de.kattendick.tf.persistence.model.StoreEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoreRepository extends CrudRepository<StoreEntity, Long> {

    List<StoreEntity> findAll();

}
