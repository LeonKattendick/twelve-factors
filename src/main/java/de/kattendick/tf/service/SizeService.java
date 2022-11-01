package de.kattendick.tf.service;

import de.kattendick.tf.persistence.SizeRepository;
import de.kattendick.tf.persistence.model.SizeEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SizeService {

    private SizeRepository sizeRepository;

    public SizeEntity createSize(SizeEntity sizeEntity) {
        return sizeRepository.save(sizeEntity);
    }
}
