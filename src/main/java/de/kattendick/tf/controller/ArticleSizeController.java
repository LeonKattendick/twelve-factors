package de.kattendick.tf.controller;

import de.kattendick.tf.service.ArticleSizeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article-size")
@AllArgsConstructor
public class ArticleSizeController {

    private ArticleSizeService articleSizeService;

}
