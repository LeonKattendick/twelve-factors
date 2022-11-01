package de.kattendick.tf.controller;

import de.kattendick.tf.persistence.model.ArticleEntity;
import de.kattendick.tf.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/article")
@AllArgsConstructor
public class ArticleController {

    private ArticleService articleService;

    @PostMapping
    public ResponseEntity<ArticleEntity> createArticle(@RequestBody ArticleEntity articleEntity) {
        return ResponseEntity.ok(articleService.createArticle(articleEntity));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ArticleEntity> getArticleById(@PathVariable long id) {
        return ResponseEntity.ok(articleService.getArticleById(id).orElse(null));
    }
}
