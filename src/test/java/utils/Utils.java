package utils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Utils {
    
    public static void saveInfo(String username, String password, String firstName, String lastName, String employeeid) throws IOException, ParseException {
        String filePath = "./src/test/resources/employees.json";
        JSONParser parser = new JSONParser();
        JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(filePath));
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("username", username);
        jsonObject.put("password", password);
        jsonObject.put("firstName", firstName);
        jsonObject.put("lastName", lastName);
        jsonObject.put("employeeid", employeeid);


        jsonArray.add(jsonObject);

        FileWriter writer = new FileWriter(filePath);
        writer.write(jsonArray.toJSONString());
        writer.flush();
        writer.close();

    }

    public static JSONArray readJSONArray(String filename) throws Exception {
        JSONParser parser = new JSONParser();
        JSONArray empErray = (JSONArray) parser.parse(new FileReader(filename));
        return empErray;
    }

    public static String generateStrongPassword() {
        String password = "";
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_+";
        boolean hasLowercase = false;
        boolean hasNumber = false;

        while (password.length() < 8 || !hasLowercase || !hasNumber) {
            int index = (int) (Math.random() * chars.length());
            char c = chars.charAt(index);

            if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            }

            password += c;
        }
        return password;
    }


    public static int generateRandomId(int min, int max) {
        double rand = Math.random()*(max-min)+min;
        return (int)rand;
    }
    public static void doScroll(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
    }



}
