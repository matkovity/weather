package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utils {

    private static final String URL_TO_PROPERTIES = "src/main/resources/utils.properties";

    public static Properties loadProperty() {
        Properties prop = new Properties();
        try (InputStream input = new FileInputStream(URL_TO_PROPERTIES)) {
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return prop;
    }

}
