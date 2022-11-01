package de.kattendick.tf.service;

import de.kattendick.tf.persistence.ArticleRepository;
import de.kattendick.tf.persistence.model.ArticleEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ArticleService {

    private ArticleRepository articleRepository;

    public ArticleEntity createArticle(ArticleEntity articleEntity) {
        return articleRepository.save(articleEntity);
    }

    public Optional<ArticleEntity> getArticleById(long id) {
        return articleRepository.findById(id);
    }
}
