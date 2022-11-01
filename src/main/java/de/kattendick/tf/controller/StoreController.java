package de.kattendick.tf.controller;

import de.kattendick.tf.service.StoreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store")
@AllArgsConstructor
public class StoreController {

    private StoreService storeService;

}
