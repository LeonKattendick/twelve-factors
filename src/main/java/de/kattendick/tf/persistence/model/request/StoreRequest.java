package de.kattendick.tf.persistence.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class StoreRequest {

    @NotNull
    private String name;

    @NotNull
    private String address;

    @NotNull
    @JsonProperty("size_id")
    private long sizeId;

}
