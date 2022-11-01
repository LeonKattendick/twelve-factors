package de.kattendick.tf.persistence.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StoreResponse {

    private long id;

    private String name;

    private String address;

    private SizeResponse size;

}
