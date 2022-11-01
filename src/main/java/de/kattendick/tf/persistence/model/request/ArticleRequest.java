package de.kattendick.tf.persistence.model.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class ArticleRequest {

    @NotNull
    private String name;

    @NotNull
    private String manufacturer;

}
