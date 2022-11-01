package de.kattendick.tf.mapper;

import de.kattendick.tf.persistence.model.ArticleSizeEntity;
import de.kattendick.tf.persistence.model.response.ArticleSizeResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {SizeMapper.class})
public interface ArticleSizeMapper {

    ArticleSizeResponse entityToResponse(ArticleSizeEntity articleSizeEntity);

}
