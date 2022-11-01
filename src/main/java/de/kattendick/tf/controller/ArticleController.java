package de.kattendick.tf.controller;

import de.kattendick.tf.mapper.ArticleMapper;
import de.kattendick.tf.persistence.model.ArticleEntity;
import de.kattendick.tf.persistence.model.request.ArticleRequest;
import de.kattendick.tf.persistence.model.response.ArticleResponse;
import de.kattendick.tf.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/article")
@AllArgsConstructor
public class ArticleController {

    private ArticleService articleService;

    private ArticleMapper articleMapper;

    @PostMapping
    public ResponseEntity<ArticleResponse> createArticle(@RequestBody @Validated ArticleRequest articleRequest) {

        ArticleEntity articleEntity = articleService.createArticle(articleRequest);

        return ResponseEntity.ok(articleMapper.entityToResponse(articleEntity));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ArticleResponse> getArticleById(@PathVariable long id) {

        ArticleEntity articleEntity = articleService.getArticleById(id).orElse(null);

        return ResponseEntity.ok(articleMapper.entityToResponse(articleEntity));
    }
}
