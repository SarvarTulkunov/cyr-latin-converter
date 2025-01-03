package com.example.cyr_latin.converter.service;

import com.example.cyr_latin.converter.dto.ConverterResponse;
import org.springframework.stereotype.Service;

import static com.example.cyr_latin.converter.helper.LangHelper.CYRILLIC_TO_LATIN;
import static com.example.cyr_latin.converter.helper.LangHelper.LATIN_TO_CYRILLIC;

@Service
public class Converter {

    public ConverterResponse cyrillicToLatin(String text) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            String converted = CYRILLIC_TO_LATIN.getOrDefault(String.valueOf(c), String.valueOf(c));
            result.append(converted);
        }
        return new ConverterResponse(result.toString());
    }

    public ConverterResponse latinToCyrillic(String text) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < text.length()) {
            boolean found = false;
            for (int length = Math.min(4, text.length() - i); length > 0; length--) {
                String chunk = text.substring(i, i + length);
                if (LATIN_TO_CYRILLIC.containsKey(chunk)) {
                    result.append(LATIN_TO_CYRILLIC.get(chunk));
                    i += length;
                    found = true;
                    break;
                }
            }
            if (!found) {
                result.append(text.charAt(i));
                i++;
            }
        }

        return new ConverterResponse(result.toString());
    }

}
