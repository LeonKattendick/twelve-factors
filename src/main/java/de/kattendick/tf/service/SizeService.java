package de.kattendick.tf.service;

import de.kattendick.tf.persistence.SizeRepository;
import de.kattendick.tf.persistence.model.ArticleEntity;
import de.kattendick.tf.persistence.model.SizeEntity;
import de.kattendick.tf.persistence.model.request.SizeRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SizeService {

    private SizeRepository sizeRepository;

    public SizeEntity createSize(SizeRequest sizeRequest) {

        SizeEntity sizeEntity = SizeEntity.builder()
                .name(sizeRequest.getName())
                .articleSizes(Collections.emptyList())
                .build();

        return sizeRepository.save(sizeEntity);
    }

    public Optional<SizeEntity> getSizeById(long id) {
        return sizeRepository.findById(id);
    }
}
