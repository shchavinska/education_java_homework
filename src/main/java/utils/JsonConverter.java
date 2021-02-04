package utils;

import java.io.InputStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Paths;
import java.nio.file.Files;

import com.fasterxml.jackson.databind.jsontype.*;
import port.*;
import ship.*;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JsonConverter {
    private final static Logger LOGGER = Logger.getLogger(JsonConverter.class);

    ObjectMapper mapper = new ObjectMapper();

    public JsonConverter(){
        mapper.registerSubtypes(
                new NamedType(Canoe.class, "Canoe"),
                new NamedType(Cruiser.class, "Cruiser"),
                new NamedType(FourMasted.class, "FourMasted"),
                new NamedType(Galley.class, "Galley"),
                new NamedType(MotorShip.class, "MotorShip"),
                new NamedType(Rowboat.class, "Rowboat"),
                new NamedType(SailingShip.class, "SailingShip"),
                new NamedType(Submarine.class, "Submarine"),
                new NamedType(TwinMasted.class, "TwinMasted")
        );
    }

    public void convertToJsonFile(Object obj, String pathToFile) {
        try {
            mapper.writeValue(Paths.get(pathToFile).toFile(), obj);
            LOGGER.info("Wrote to json file");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static String readResource(String file) throws IOException {
        ClassLoader classLoader = JsonConverter.class.getClassLoader();
        InputStream in = classLoader.getResourceAsStream(file);
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String content = new String();
        String line = reader.readLine();
        while (line != null) {
            content += line + System.lineSeparator();
            line = reader.readLine();
        }
        return content;
    }


    public Seaport readJsonToShip(String file) throws IOException {
        String jsonStr = readResource(file);
        Seaport ships = null;
        try {
            ships  = mapper.readValue(jsonStr, Seaport.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return ships;
    }

    public CanoeToBuy readJsonToCanoeToBuy(String file) throws IOException {
        String jsonStr = readResource(file);
        CanoeToBuy canoe = null;
        try {
            canoe  = mapper.readValue(jsonStr, CanoeToBuy.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return canoe;
    }

    public CanoeToRent readJsonToCanoeToRent(String file) throws IOException {
        String jsonStr = readResource(file);
        CanoeToRent canoe = null;
        try {
            canoe  = mapper.readValue(jsonStr, CanoeToRent.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return canoe;
    }

}
