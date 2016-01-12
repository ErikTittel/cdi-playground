package de.et.complete;

import java.util.Random;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

@ApplicationScoped
public class RandomNumberGenerator {

    private Random random = new Random(System.currentTimeMillis());

    @Produces
    public int getRandomNumber() {
        System.out.println("Random number is being generated");
        return random.nextInt(100);
    }
}
