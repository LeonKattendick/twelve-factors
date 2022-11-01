package de.kattendick.tf.persistence.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class SizeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String name;

    @OneToMany(mappedBy = "size")
    private List<ArticleSizeEntity> articleSizes;

}
