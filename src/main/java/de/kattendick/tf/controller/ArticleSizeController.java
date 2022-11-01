package de.kattendick.tf.controller;

import de.kattendick.tf.mapper.ArticleSizeMapper;
import de.kattendick.tf.persistence.model.ArticleSizeEntity;
import de.kattendick.tf.persistence.model.request.ArticleSizeRequest;
import de.kattendick.tf.persistence.model.response.ArticleSizeResponse;
import de.kattendick.tf.service.ArticleSizeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article-size")
@AllArgsConstructor
public class ArticleSizeController {

    private ArticleSizeService articleSizeService;

    private ArticleSizeMapper articleSizeMapper;

    @PostMapping
    public ResponseEntity<ArticleSizeResponse> createArticleSize(@RequestBody @Validated ArticleSizeRequest articleSizeRequest) {

        ArticleSizeEntity articleSizeEntity = articleSizeService.createArticleSize(articleSizeRequest);

        return ResponseEntity.ok(articleSizeMapper.entityToResponse(articleSizeEntity));
    }
}
