package de.kattendick.tf.persistence;

import de.kattendick.tf.persistence.model.SizeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SizeRepository extends CrudRepository<SizeEntity, Long> {
}
