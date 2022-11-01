package de.kattendick.tf.service;

import de.kattendick.tf.persistence.ArticleSizeRepository;
import de.kattendick.tf.persistence.model.ArticleSizeEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ArticleSizeService {

    private ArticleSizeRepository articleSizeRepository;

    public ArticleSizeEntity createArticleSize(ArticleSizeEntity articleSizeEntity) {
        return articleSizeRepository.save(articleSizeEntity);
    }
}
