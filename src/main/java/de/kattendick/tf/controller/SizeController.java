package de.kattendick.tf.controller;

import de.kattendick.tf.mapper.SizeMapper;
import de.kattendick.tf.persistence.model.SizeEntity;
import de.kattendick.tf.persistence.model.request.SizeRequest;
import de.kattendick.tf.persistence.model.response.SizeResponse;
import de.kattendick.tf.service.SizeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/size")
@AllArgsConstructor
public class SizeController {

    private SizeService sizeService;

    private SizeMapper sizeMapper;

    @PostMapping
    public ResponseEntity<SizeResponse> createSize(@RequestBody @Validated SizeRequest sizeRequest) {

        SizeEntity sizeEntity = sizeService.createSize(sizeRequest);

        return ResponseEntity.ok(sizeMapper.entityToResponse(sizeEntity));
    }
}
