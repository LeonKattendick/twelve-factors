package de.kattendick.tf.persistence.model.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class SizeRequest {

    @NotNull
    private String name;

}
