package de.kattendick.tf.service;

import de.kattendick.tf.persistence.ArticleSizeRepository;
import de.kattendick.tf.persistence.model.ArticleEntity;
import de.kattendick.tf.persistence.model.ArticleSizeEntity;
import de.kattendick.tf.persistence.model.SizeEntity;
import de.kattendick.tf.persistence.model.request.ArticleSizeRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ArticleSizeService {

    private ArticleSizeRepository articleSizeRepository;

    private ArticleService articleService;

    private SizeService sizeService;

    public ArticleSizeEntity createArticleSize(ArticleSizeRequest articleSizeRequest) {

        Optional<ArticleEntity> articleEntityOptional = articleService.getArticleById(articleSizeRequest.getArticleId());
        if (!articleEntityOptional.isPresent()) return null;

        Optional<SizeEntity> sizeEntityOptional = sizeService.getSizeById(articleSizeRequest.getSizeId());
        if (!sizeEntityOptional.isPresent()) return null;

        ArticleSizeEntity articleSizeEntity = ArticleSizeEntity.builder()
                .article(articleEntityOptional.get())
                .size(sizeEntityOptional.get())
                .amount(articleSizeRequest.getAmount())
                .build();

        return articleSizeRepository.save(articleSizeEntity);
    }
}
