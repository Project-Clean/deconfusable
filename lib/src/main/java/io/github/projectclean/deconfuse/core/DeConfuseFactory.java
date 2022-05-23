package io.github.projectclean.deconfuse.core;

import io.github.projectclean.deconfuse.enums.Language;

/*
 * A factory which is used to get DeConfuse Object based on the different Language.
 */
public class DeConfuseFactory {
    /*
     * A method which return DeConfuse Object based on the different Language
     *
     * @param Language
     * @return DeConfuse Object based on Language
     */
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
