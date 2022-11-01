package de.kattendick.tf.persistence.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class StoreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String address;

    @OneToOne
    @JoinColumn(name = "size_id", referencedColumnName = "id")
    private SizeEntity size;

}
