package de.kattendick.tf.mapper;

import de.kattendick.tf.persistence.model.SizeEntity;
import de.kattendick.tf.persistence.model.response.SizeResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SizeMapper {

    SizeResponse entityToResponse(SizeEntity sizeEntity);

}
