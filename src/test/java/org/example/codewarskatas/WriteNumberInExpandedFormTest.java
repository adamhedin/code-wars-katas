package org.example.codewarskatas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class WriteNumberInExpandedFormTest {
    @Test
    public void testSomething() {
        assertEquals("10 + 2", WriteNumberInExpandedForm.expandedForm(12));
        assertEquals("40 + 2", WriteNumberInExpandedForm.expandedForm(42));
        assertEquals("100 + 2", WriteNumberInExpandedForm.expandedForm(102));

        assertEquals("70000 + 300 + 4", WriteNumberInExpandedForm.expandedForm(70304));
    }
}