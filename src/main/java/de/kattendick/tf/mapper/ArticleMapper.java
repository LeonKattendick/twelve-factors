package de.kattendick.tf.mapper;

import de.kattendick.tf.persistence.model.ArticleEntity;
import de.kattendick.tf.persistence.model.response.ArticleResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ArticleSizeMapper.class})
public interface ArticleMapper {

    ArticleResponse entityToResponse(ArticleEntity articleEntity);

}
