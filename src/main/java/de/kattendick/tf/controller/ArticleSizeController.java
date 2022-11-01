package de.kattendick.tf.controller;

import de.kattendick.tf.persistence.model.ArticleSizeEntity;
import de.kattendick.tf.service.ArticleSizeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article-size")
@AllArgsConstructor
public class ArticleSizeController {

    private ArticleSizeService articleSizeService;

    @PostMapping
    public ResponseEntity<ArticleSizeEntity> createArticleSize(@RequestBody ArticleSizeEntity articleSizeEntity) {
        return ResponseEntity.ok(articleSizeService.createArticleSize(articleSizeEntity));
    }
}
