package de.et.complete;

import javax.enterprise.inject.Produces;

public class ObjectiveServiceFactory {

    @Produces @ServiceFactory
    public ObjectiveService createService(ObjectiveServiceAdditionalMotivation additionalMotivation) {
        // TODO: Think about how to defer instantiation of a bean from startup to point of access
        return additionalMotivation;
    }

}
