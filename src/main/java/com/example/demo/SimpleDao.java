package com.example.demo;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

@Repository
public class SimpleDao {

    public String findAll() {


        File resource = null;
        String jsonString = null;
        try {
            resource = new ClassPathResource("shipments.json").getFile();
            jsonString = new String(Files.readAllBytes(resource.toPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonString;

    }

}
