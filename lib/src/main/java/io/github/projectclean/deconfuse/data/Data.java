package io.github.projectclean.deconfuse.data;

import org.json.simple.JSONObject;

interface Data {
     /*
      * A method which return the JSONObject which contains data in json format. It is used to find codePoint mapping.
      *
      * @return JSONObject (JSONObject of string for eg. En.jsonString)
      */
     JSONObject getData();
}