package de.kattendick.tf.service;

import de.kattendick.tf.persistence.StoreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StoreService {

    private StoreRepository storeRepository;

}
