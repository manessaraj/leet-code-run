
/*
* @author: smanes
* */

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*Factory to create instance of Program based on configuration defined
* TODO: Follow the Factory Design Pattern
* */
public class ProgramFactory {

    private static ProgramFactory instance = new ProgramFactory();

    public Properties getPropertyValues() throws IOException {
        String propertiesFileName = "config.properties";
        InputStream inputStream = null;
        Properties properties = new Properties();
        try {
            inputStream = getClass().getResourceAsStream(propertiesFileName);
            if (inputStream != null) {
                properties.load(inputStream);
            } else {
                throw new FileNotFoundException(propertiesFileName + " not found");
            }
        } catch (Exception exp) {

        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
        return properties;
    }



    //TODO: This should change based on Factory Design pattern
    public static Program getProgram() {
        Program runInstance = null;
        try {
            Properties properties = instance.getPropertyValues();
        } catch (IOException e) {
            throw new NotImplementedException();
        }
        return runInstance;
    }
}
