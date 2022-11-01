package de.kattendick.tf.mapper;

import de.kattendick.tf.persistence.model.ArticleSizeEntity;
import de.kattendick.tf.persistence.model.StoreEntity;
import de.kattendick.tf.persistence.model.request.StoreRequest;
import de.kattendick.tf.persistence.model.response.ArticleSizeResponse;
import de.kattendick.tf.persistence.model.response.StoreResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {SizeMapper.class})
public interface StoreMapper {

    StoreResponse entityToResponse(StoreEntity storeEntity);

}
