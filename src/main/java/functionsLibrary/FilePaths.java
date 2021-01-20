package functionsLibrary;

import java.io.File;

public class FilePaths {
    public static String configFilePath = new File("src/main/resources/testData/config.properties")
            .getAbsolutePath();
    public static String ExcelFilePath = new File("src/main/resources/testData/login.xlsx").getAbsolutePath();
}
