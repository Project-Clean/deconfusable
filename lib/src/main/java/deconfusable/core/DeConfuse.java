package deconfusable.core;

public interface DeConfuse {
    String deConfuseString(String str);
    boolean isNativeCharacter(int codePoint);
}