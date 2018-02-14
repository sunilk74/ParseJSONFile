package com.sunil;

import com.sunil.ParseJSONFile;
import junit.framework.Assert;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONObject; 
import org.testng.annotations.Test;

public class TestParseJSONFile extends ParseJSONFile{
  
  @Test()
  public void parseJSONFile() throws IOException
  {
    
    //InputStream is = TestParseJSONFile.class.getResourceAsStream("/data/LocalOpportunityData.json");
    //System.out.println(System.getProperty("user.dir"));
    JSONObject jsonObj = readFile("/data/LocalOpportunityData.json");
    
    System.out.println("Local Opportunity_desc : "+jsonObj.getJSONObject("Local").getString("Opportunity_desc"));
    System.out.println("National Opportunity_desc : "+jsonObj.getJSONObject("National").getString("Opportunity_desc"));
    System.out.println("PPO Opportunity_desc : "+jsonObj.getJSONObject("PPO").getString("Opportunity_desc"));
    
    Assert.assertEquals("Local_Automation", jsonObj.getJSONObject("Local").getString("Opportunity_desc"));
    Assert.assertEquals("National_Automation", jsonObj.getJSONObject("National").getString("Opportunity_desc"));
    Assert.assertEquals("PPO_Automation", jsonObj.getJSONObject("PPO").getString("Opportunity_desc"));
    
  }

}
