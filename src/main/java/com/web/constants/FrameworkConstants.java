package com.web.constants;

public final class FrameworkConstants {

    private static final String RESOURCES_PATH = System.getProperty("user.dir") + "/src/test/resources";
    private static final String CHROME_DRIVER_PATH = RESOURCES_PATH + "/chromedriver.exe";
    private static final String CONFIG_FILE_PATH = RESOURCES_PATH + "/config/config.properties";

    private FrameworkConstants() {
    }

    public static String getChromeDriverPath() {
        return CHROME_DRIVER_PATH;
    }

    public static String getConfigFilePath() {
        return CONFIG_FILE_PATH;
    }
}
