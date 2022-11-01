package de.kattendick.tf.controller;

import de.kattendick.tf.persistence.model.SizeEntity;
import de.kattendick.tf.service.SizeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/size")
@AllArgsConstructor
public class SizeController {

    private SizeService sizeService;

    @PostMapping
    public ResponseEntity<SizeEntity> createSize(@RequestBody SizeEntity sizeEntity) {
        return ResponseEntity.ok(sizeService.createSize(sizeEntity));
    }
}
