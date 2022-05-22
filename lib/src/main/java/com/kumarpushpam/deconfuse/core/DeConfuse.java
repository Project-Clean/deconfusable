package com.kumarpushpam.deconfuse.core;

public interface DeConfuse {
    /*
     * A method which returns string after "de-confusing" the input string
     *
     * eg. ⱮⱫⱩ will be changes to "mzk"
     *
     * @param String input string which you want to de-confuse
     * @return A string de-confused string
     */
    String deConfuseString(String str);

    /*
     * A method which tell if the code point (int of a char) is native char or alphabet to the language
     *
     * eg. for 97 will return true for English since it represent 'a' (97)
     *
     * @param int Codepoint value of character
     * @return true if it's a native character of the language else false
     */
    boolean isNativeCharacter(int codePoint);
}