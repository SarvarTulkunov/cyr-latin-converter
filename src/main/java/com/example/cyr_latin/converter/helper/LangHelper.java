package com.example.cyr_latin.converter.helper;

import java.util.HashMap;
import java.util.Map;

public class LangHelper {

    public static final Map<String, String> CYRILLIC_TO_LATIN = Map.ofEntries(
            Map.entry("А", "A"), Map.entry("а", "a"),
            Map.entry("Б", "B"), Map.entry("б", "b"),
            Map.entry("В", "V"), Map.entry("в", "v"),
            Map.entry("Г", "G"), Map.entry("г", "g"),
            Map.entry("Ғ", "G'"), Map.entry("ғ", "g'"),
            Map.entry("Д", "D"), Map.entry("д", "d"),
            Map.entry("Е", "E"), Map.entry("е", "e"),
            Map.entry("Ж", "J"), Map.entry("ж", "j"),
            Map.entry("З", "Z"), Map.entry("з", "z"),
            Map.entry("И", "I"), Map.entry("и", "i"),
            Map.entry("Й", "Y"), Map.entry("й", "y"),
            Map.entry("К", "K"), Map.entry("к", "k"),
            Map.entry("Қ", "Q"), Map.entry("қ", "q"),
            Map.entry("Л", "L"), Map.entry("л", "l"),
            Map.entry("М", "M"), Map.entry("м", "m"),
            Map.entry("Н", "N"), Map.entry("н", "n"),
            Map.entry("О", "O"), Map.entry("о", "o"),
            Map.entry("П", "P"), Map.entry("п", "p"),
            Map.entry("Р", "R"), Map.entry("р", "r"),
            Map.entry("С", "S"), Map.entry("с", "s"),
            Map.entry("Т", "T"), Map.entry("т", "t"),
            Map.entry("У", "U"), Map.entry("у", "u"),
            Map.entry("Ў", "O'"), Map.entry("ў", "o'"),
            Map.entry("Ф", "F"), Map.entry("ф", "f"),
            Map.entry("Х", "X"), Map.entry("х", "x"),
            Map.entry("Ҳ", "H"), Map.entry("ҳ", "h"),
            Map.entry("Ц", "Ts"), Map.entry("ц", "ts"),
            Map.entry("Ч", "Ch"), Map.entry("ч", "ch"),
            Map.entry("Ш", "Sh"), Map.entry("ш", "sh"),
            Map.entry("Щ", "Sh"), Map.entry("щ", "sh"),
            Map.entry("Ъ", ""), Map.entry("ъ", ""),
            Map.entry("Ы", "Y"), Map.entry("ы", "y"),
            Map.entry("Ь", "'"), Map.entry("ь", "'"),
            Map.entry("Э", "E"), Map.entry("э", "e"),
            Map.entry("Ё", "Yo"), Map.entry("ё", "yo"),
            Map.entry("Ю", "Yu"), Map.entry("ю", "yu"),
            Map.entry("Я", "Ya"), Map.entry("я", "ya"),
            Map.entry(" ", " ")
    );

    public static final Map<String, String> LATIN_TO_CYRILLIC = new HashMap<>();

    static {
        for (Map.Entry<String, String> entry : CYRILLIC_TO_LATIN.entrySet()) {
            LATIN_TO_CYRILLIC.put(entry.getValue(), entry.getKey());
        }
    }
}
