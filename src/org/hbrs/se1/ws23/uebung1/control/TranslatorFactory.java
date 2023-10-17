package org.hbrs.se1.ws23.uebung1.control;
//
public class TranslatorFactory {
    public static Translator createGermanTranslator() {
        GermanTranslator translator = new GermanTranslator();
        translator.setDate("11-11-2020");
        return translator;
    }
    public static Translator createEnglishTranslator() {
        return new EnglishTranslator();
    }
}
