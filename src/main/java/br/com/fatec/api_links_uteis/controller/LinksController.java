package br.com.fatec.api_links_uteis.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;

public class LinksController {
    
    private final Map<Integer, Map<String, String>> linksDB = new HashMap<>();
    private int nextID = 1;

    public LinksController() {
        linksDB.put(1, Map.of("id", "1", "titulo", "Github", "url", "https://github.com"));
        linksDB.put(2, Map.of("id", "2", "titulo", "Stack Overflow", "url",  "https://stackoverflow.com"));
        nextId = 3;
    }
    
    @GetMapping
    public List<Map<String, String>> getLinks(){
        return new ArrayList<>(linksDB.values());
    }
}
