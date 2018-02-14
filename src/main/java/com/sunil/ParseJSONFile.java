package com.sunil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import org.json.JSONObject;

public class ParseJSONFile {

  
  protected JSONObject readFile(String filename) {
    String jsonString = "";
    
    try {
          BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(filename)));
          StringBuilder sb = new StringBuilder();
          String line = br.readLine();
          while (line != null) {
              sb.append(line);
              line = br.readLine();
          }
          jsonString = sb.toString();
          br.close();
    } catch(Exception e) {
        e.printStackTrace();
    }
    
    JSONObject json = new JSONObject(jsonString);
    return json;
  }
  
}
