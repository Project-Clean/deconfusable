package deconfusable.data;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class EnglishData implements Data {
    private JSONParser jsonParser;
    private Object obj;

    public EnglishData(){
        jsonParser = new JSONParser();
        try {
            obj = jsonParser.parse(En.getJsonString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //TODO: Handle Parse and FileNotFoundException separately
    }

     public JSONObject getData() {
         JSONObject jsonObject = (JSONObject) obj;
         return jsonObject;
    }
}