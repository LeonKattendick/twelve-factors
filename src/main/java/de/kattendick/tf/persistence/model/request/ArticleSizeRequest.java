package de.kattendick.tf.persistence.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class ArticleSizeRequest {

    @NotNull
    @JsonProperty("article_id")
    private long articleId;

    @NotNull
    @JsonProperty("size_id")
    private long sizeId;

    @NotNull
    private int amount;

}
