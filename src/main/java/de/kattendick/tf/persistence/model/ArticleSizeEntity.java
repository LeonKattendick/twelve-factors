package de.kattendick.tf.persistence.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class ArticleSizeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "article_id", referencedColumnName = "id")
    private ArticleEntity article;

    @ManyToOne
    @JoinColumn(name = "size_id", referencedColumnName = "id")
    private SizeEntity size;

    private int amount;
}
