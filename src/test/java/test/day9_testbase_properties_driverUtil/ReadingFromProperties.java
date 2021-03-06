package test.day9_testbase_properties_driverUtil;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingFromProperties {
    @Test
    public void reading_properties_file() throws IOException {
        //Properties class object allows us to read from config.properties.
        Properties properties =new Properties();

        //We need to show where the file is stored .
        //We need the path of the file
        String path="configuation.properties";

        //We need to open this properties file in java memory
        FileInputStream file =new FileInputStream(path);

        //We need to load the opened file into  the properties object
        properties.load(file);

        //We can read the config.properties file using properties object
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));
        System.out.println("properties.getProperty(\"password\") = " + properties.getProperty("password"));


    }
}
