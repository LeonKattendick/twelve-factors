package de.kattendick.tf.controller;

import de.kattendick.tf.service.SizeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/size")
@AllArgsConstructor
public class SizeController {

    private SizeService sizeService;

}
