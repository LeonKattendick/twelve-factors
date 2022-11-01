package de.kattendick.tf.persistence.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class ArticleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String manufacturer;

    @OneToMany(mappedBy = "article")
    private List<ArticleSizeEntity> articleSizes;

}
