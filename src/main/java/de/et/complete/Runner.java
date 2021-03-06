package de.et.complete;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import javax.inject.Inject;

public class Runner {

    @Inject @ServiceFactory
    private ObjectiveService service;

    @Inject
    private Holder holder;

    @Inject
    private int randomNumber;

    public static void main(String[] args) {
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();
        container.select(Runner.class).get().createObjective();
        container.shutdown();
    }

    private void createObjective() {
        service.addObjective("read a book");

        System.out.println("My Objective: " + service.getObjective());

        System.out.println("randomNumber = " + randomNumber);

        System.out.println("Text: " + holder.getText());
    }


}
