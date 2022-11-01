package de.kattendick.tf.controller;

import de.kattendick.tf.mapper.StoreMapper;
import de.kattendick.tf.persistence.model.StoreEntity;
import de.kattendick.tf.persistence.model.request.StoreRequest;
import de.kattendick.tf.persistence.model.response.StoreResponse;
import de.kattendick.tf.service.StoreService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store")
@AllArgsConstructor
public class StoreController {

    private StoreService storeService;

    private StoreMapper storeMapper;

    @PostMapping
    public ResponseEntity<StoreResponse> createSize(@RequestBody @Validated StoreRequest storeRequest) {

        StoreEntity storeEntity = storeService.createStore(storeRequest);

        return ResponseEntity.ok(storeMapper.entityToResponse(storeEntity));
    }
}
