package de.kattendick.tf.persistence.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleResponse {

    private long id;

    private String name;

    private String manufacturer;

    private List<ArticleSizeResponse> articleSizes;

}
