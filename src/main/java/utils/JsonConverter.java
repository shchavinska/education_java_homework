package utils;

import java.io.IOException;
import java.nio.file.Paths;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JsonConverter {
    private final static Logger LOGGER = Logger.getLogger(JsonConverter.class);

    ObjectMapper mapper = new ObjectMapper();

    public void toJsonFile(Object obj, String pathToFile) {
        try {
            mapper.writeValue(Paths.get(pathToFile).toFile(), obj);
            LOGGER.info("Wrote to json file");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
