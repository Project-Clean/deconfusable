package com.kumarpushpam.deconfuse.core;

import com.kumarpushpam.deconfuse.data.EnglishData;

import org.json.simple.JSONObject;

public class DeConfuseEnglish implements DeConfuse {
    private JSONObject jsonObject;
    private EnglishData englishData;

    DeConfuseEnglish() throws Exception {
        englishData = new EnglishData();
        jsonObject = englishData.getData();
    }

    @Override
    public boolean isNativeCharacter(int codePoint) {
        if ((codePoint >= 65 && codePoint <= 90) || (codePoint >= 97 && codePoint <= 122))
            return true;
        return false;
    }
    @Override
    public String deConfuseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int codePoint : str.codePoints().toArray()) {

            // check if the character is native to english, or it is space
            if (isNativeCharacter(codePoint) || codePoint == 32)
                sb.append((char) codePoint);
            else {
                Object codePointObject = jsonObject.get(String.valueOf(codePoint));
                if (codePointObject != null) {
                    String characterOfCodepoint = String.valueOf(codePointObject);
                    sb.append((char) Integer.parseInt(characterOfCodepoint));
                }
            }
        }
        return sb.toString().toLowerCase();
    }
}