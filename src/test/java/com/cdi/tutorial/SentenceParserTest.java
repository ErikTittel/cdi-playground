package com.cdi.tutorial;

import static org.hamcrest.Matchers.hasItems;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import java.util.List;

public class SentenceParserTest {

    private SentenceParser parser = new SentenceParser();

    @Test
    public void parse() throws Exception {
        String text = "Hello\nthis is\na new world.";

        List<String> sentences = parser.parse(text);

        assertThat(sentences, hasItems("Hello", "this is", "a new world."));
    }
}