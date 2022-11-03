package de.kattendick.tf.service;

import de.kattendick.tf.persistence.StoreRepository;
import de.kattendick.tf.persistence.model.SizeEntity;
import de.kattendick.tf.persistence.model.StoreEntity;
import de.kattendick.tf.persistence.model.request.StoreRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StoreService {

    private StoreRepository storeRepository;

    private SizeService sizeService;

    public StoreEntity createStore(StoreRequest storeRequest) {

        Optional<SizeEntity> sizeEntityOptional = sizeService.getSizeById(storeRequest.getSizeId());
        if (!sizeEntityOptional.isPresent()) return null;

        StoreEntity articleEntity = StoreEntity.builder()
                .name(storeRequest.getName())
                .address(storeRequest.getAddress())
                .size(sizeEntityOptional.get())
                .build();

        return storeRepository.save(articleEntity);
    }

    public List<StoreEntity> getAllStores() {
        return storeRepository.findAll();
    }
}
