package commonact;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProp {
    static InputStream inputStream;

    public static int property() throws IOException {
        Properties prop = new Properties();
        String propFileName = "config.properties";
        inputStream = ReadProp.class.getClassLoader().getResourceAsStream(propFileName);
        if (inputStream != null) {
            prop.load(inputStream);
        } else {
            throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
        }
        String wait = prop.getProperty("shortTime");
        return Integer.parseInt(wait);
    }


    public static String pagename() throws IOException {
        Properties prop = new Properties();
        String propFileName = "config.properties";
        inputStream = ReadProp.class.getClassLoader().getResourceAsStream(propFileName);
        if (inputStream != null) {
            prop.load(inputStream);
        } else {
            throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
        }
        String webpage = prop.getProperty("webpage");
        return webpage;


    }

    public static String keywords() throws IOException {
    Properties prop = new Properties();
    String propFileName = "TestData.properties";
    inputStream = ReadProp.class.getClassLoader().getResourceAsStream(propFileName);
        if (inputStream != null) {
        prop.load(inputStream);
    } else {
        throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
    }
    String key = prop.getProperty("keywords");
        return key;
}}
