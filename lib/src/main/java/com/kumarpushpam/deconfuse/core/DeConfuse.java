package com.kumarpushpam.deconfuse.core;

public interface DeConfuse {
    String deConfuseString(String str);
    boolean isNativeCharacter(int codePoint);
}