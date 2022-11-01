package de.kattendick.tf.service;

import de.kattendick.tf.persistence.SizeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SizeService {

    private SizeRepository sizeRepository;

}
