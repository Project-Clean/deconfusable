package com.kumarpushpam.deconfuse;

import com.kumarpushpam.deconfuse.core.DeConfuse;
import com.kumarpushpam.deconfuse.core.DeConfuseFactory;
import com.kumarpushpam.deconfuse.enums.Language;

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
    @Test public void isNativeCharacterTest() {
        assertTrue("A is native char to should return true", deConfuse.isNativeCharacter((int)'A'));
        assertFalse("Ⱨ is native char to should return true", deConfuse.isNativeCharacter(11367));
    }
}
