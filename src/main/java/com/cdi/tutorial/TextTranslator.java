package com.cdi.tutorial;

import javax.inject.Inject;

@RealTranslator
public class TextTranslator implements Translator {

    @Inject
    private SentenceParser parser;
    @Inject
    private SentenceTranslator translator;

    public String translate(String text) {
        StringBuilder sb = new StringBuilder();
        for (String sentence : parser.parse(text)) {
            sb.append(translator.translate(sentence));
        }
        return sb.toString();
    }

}
