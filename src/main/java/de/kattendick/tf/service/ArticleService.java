package de.kattendick.tf.service;

import de.kattendick.tf.persistence.ArticleRepository;
import de.kattendick.tf.persistence.model.ArticleEntity;
import de.kattendick.tf.persistence.model.request.ArticleRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ArticleService {

    private ArticleRepository articleRepository;

    public ArticleEntity createArticle(ArticleRequest articleRequest) {

        ArticleEntity articleEntity = ArticleEntity.builder()
                .name(articleRequest.getName())
                .manufacturer(articleRequest.getManufacturer())
                .articleSizes(Collections.emptyList())
                .build();

        return articleRepository.save(articleEntity);
    }

    public Optional<ArticleEntity> getArticleById(long id) {
        return articleRepository.findById(id);
    }
}
