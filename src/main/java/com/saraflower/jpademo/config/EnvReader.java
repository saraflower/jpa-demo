package com.saraflower.jpademo.config;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EnvReader {
    private static final String ENV_FILE = "config/env.sh";
    private static final String ENV_FILE_NOT_FOUND = "%s file not found";
    private static final String SEPARATOR = "=";
    public static void readEnvironment() {
        try {
            File myObj = new File(ENV_FILE);
            Scanner scanner = new Scanner(myObj);
            while (scanner.hasNextLine()) {
                String envLine = scanner.nextLine();
                setVariable(envLine);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println(
                    String.format(ENV_FILE_NOT_FOUND, ENV_FILE)
            );
            e.printStackTrace();
        }
    }

    private static void setVariable(String envLine) {
        String[] parts = envLine.split(SEPARATOR);
        System.setProperty(parts[0], parts[1]);
    }
}
