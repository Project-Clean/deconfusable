package deconfusable.core;

import deconfusable.enums.Language;

public class DeConfuseFactory {

    public static DeConfuse createDeConfuse(Language language) {
        DeConfuse obj = null;
        try {
            switch (language) {
                case ENGLISH: obj = new DeConfuseEnglish();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}
