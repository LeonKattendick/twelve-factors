package de.kattendick.tf.persistence;

import de.kattendick.tf.persistence.model.StoreEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends CrudRepository<StoreEntity, Long> {
}
