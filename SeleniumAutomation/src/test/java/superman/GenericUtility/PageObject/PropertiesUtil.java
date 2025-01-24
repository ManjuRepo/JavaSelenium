package superman.GenericUtility.PageObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

    // Public static variables to hold property values
    public static String url;
    public static String username;
    public static String password;
    public static String browser;

    // Public static method to load properties
    public static void loadProperties() {
        Properties properties = new Properties();
        final String FILE_PATH = System.getProperty("user.dir") + "\\data\\environment.properties";

        try (FileInputStream file = new FileInputStream(FILE_PATH)) {
            properties.load(file);

            // Fetch individual values and store in static variables
            url = properties.getProperty("UATURL");
            username = properties.getProperty("UserName");
            password = properties.getProperty("Password");
            browser = properties.getProperty("browser");

            System.out.println("Properties loaded successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load properties from: " + FILE_PATH);
        }
    }
}
