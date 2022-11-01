package de.kattendick.tf.persistence.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleSizeResponse {

    private long id;

    private int amount;

    private SizeResponse size;

}
