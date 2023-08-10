package org.example.Mentor;



import io.opentelemetry.api.internal.StringUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesOperations {

    static Properties prop = new Properties();

    public static String getPropertyValueByKey(String key){
        String propFilePath = System.getProperty("user.dir") + "/src/main/java/org/example/Mentor/config.properties";

        FileInputStream fileInputStream;

        try{
            fileInputStream = new FileInputStream(propFilePath);
            prop.load(fileInputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }

        String value = prop.get(key).toString();

        if (StringUtils.isNullOrEmpty(value)){
            try {
                throw new Exception("Value is not specified for key: " + key + "in properties file.");
            }catch (Exception e){

            }
        }
        return value;
    }
}
