package de.kattendick.tf.persistence;

import de.kattendick.tf.persistence.model.ArticleSizeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleSizeRepository extends CrudRepository<ArticleSizeEntity, Long> {
}
