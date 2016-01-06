package com.cdi.tutorial;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SentenceTranslatorTest {

    private SentenceTranslator translator = new SentenceTranslator();

    @Test
    public void translate() throws Exception {
        String text = "Hello";

        String result = translator.translate(text);

        assertThat(result, is("HelloT"));
    }
}