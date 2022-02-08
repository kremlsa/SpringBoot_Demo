package com.example.demo.web;

import com.example.demo.dto.SimpleRequestDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;


@RestController // аннотация которая назначает этот класс за обработку входящих http запросов
@RequestMapping("demo") // путь по которому класс будет слушать запросы
public class SimpleController {


    @PostMapping("/mirror") // аннотация для прослушивания POST запросов
    public ResponseEntity<Object> mirror(@Valid @RequestBody SimpleRequestDTO simpleRequestDTO) {

        return new ResponseEntity<>(simpleRequestDTO, HttpStatus.OK);
    }
}
