package dao;

import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

@Repository
public class SimpleDao {

    public String findAll() {
        String jsonString = null;
        try {
            jsonString = Files.readString(Path.of("src/main/resources/shipments.json"), StandardCharsets.US_ASCII);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonString;

    }

}
