package com.cdi.tutorial;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

@RunWith(Arquillian.class)
public class TranslatorTest {

    @Inject @RealTranslator
    private Translator translator;

    @Deployment
    public static JavaArchive createDeployment() {
        JavaArchive javaArchive = ShrinkWrap.create(JavaArchive.class)
                .addPackages(true, "com.cdi.tutorial")
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
        System.out.println(javaArchive.toString(true));
        return javaArchive;

    }

    @Test
    public void translate() {
        String text = "Hey\nthere.";

        String result = translator.translate(text);

        assertThat(result, is("HeyTthere.T"));
    }
}