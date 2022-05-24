package io.github.projectclean.deconfuse;

import io.github.projectclean.deconfuse.core.DeConfuse;
import io.github.projectclean.deconfuse.core.DeConfuseFactory;
import io.github.projectclean.deconfuse.enums.Language;

import org.junit.Test;
import static org.junit.Assert.*;

public class DeConfuseEnglishTest {
    DeConfuse deConfuse = DeConfuseFactory.createDeConfuse(Language.ENGLISH);

    @Test public void deConfuseStringWithSpaceTest() {
        assertEquals(deConfuse.deConfuseString("\u0100\u010E\u0104"), "ada");
    }
    @Test public void deConfuseStringSingleCharTest() {
        assertEquals(deConfuse.deConfuseString("\u2C67"), "h");
    }
    @Test public void deConfuseStringTest() {
        assertEquals(deConfuse.deConfuseString("\u2C6E\u2C6B\u2C69"), "mzk");
    }
    @Test public void deConfuseAllAlphabetsTest() {
        assertEquals(deConfuse.deConfuseString("\u00C1\u0182\u010C\u1D81\u0113\u03DC\u0120\u01F6\u00CE\u037F\u04C3\u026B\uA4DF\u0148\u00F2\u03C1\u0563\u0158\u01BD\u021A\u016C\u01B2\u0175\u00D7\u00FF\u017B"), "abcdefghijklmnopqrstuvwxyz");
    }
    @Test public void isNativeCharacterTest() {
        assertTrue("A is native char so, it should return true", deConfuse.isNativeCharacter((int)'A'));
        assertFalse("Ⱨ is not native char so, it should return false", deConfuse.isNativeCharacter(11367));
    }
}
