package de.kattendick.tf.persistence.model.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class ArticleSizeRequest {

    @NotNull
    private long articleId;

    @NotNull
    private long sizeId;

    @NotNull
    private int amount;

}
