package de.et.complete;

import javax.enterprise.inject.Produces;

public class ObjectiveServiceFactory {

    @Produces @ServiceFactory
    public ObjectiveService createService() {
        // FIXME: should produce the managed bean, not a new class because this way nothing gets injected in new
        // instance
        return new ObjectiveServiceAdditionalMotivation();
    }

}
