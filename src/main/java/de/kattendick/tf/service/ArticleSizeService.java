package de.kattendick.tf.service;

import de.kattendick.tf.persistence.ArticleSizeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ArticleSizeService {

    private ArticleSizeRepository articleSizeRepository;

}
