package de.kattendick.tf.service;

import de.kattendick.tf.persistence.ArticleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ArticleService {

    private ArticleRepository articleRepository;

}
