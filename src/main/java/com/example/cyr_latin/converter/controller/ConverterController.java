package com.example.cyr_latin.converter.controller;

import com.example.cyr_latin.converter.dto.ConverterResponse;
import com.example.cyr_latin.converter.service.Converter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/convert")
public class ConverterController {

    private final Converter converter;

    public ConverterController(Converter converter) {
        this.converter = converter;
    }

    @GetMapping("/cyr-latin")
    public ConverterResponse cyrToLatin(@RequestParam(name = "text") String text){
        return converter.cyrillicToLatin(text);
    }

    @GetMapping("/latin-cyr")
    public ConverterResponse latinToCyr(@RequestParam(name = "text") String text){
        return converter.latinToCyrillic(text);
    }
}
