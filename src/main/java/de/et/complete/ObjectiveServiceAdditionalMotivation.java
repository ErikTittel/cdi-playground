package de.et.complete;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Typed;
import javax.inject.Inject;

@ApplicationScoped
public class ObjectiveServiceAdditionalMotivation implements ObjectiveService {

    @Inject
    private Doer doer;

    private String objective;

    @Override
    public void addObjective(String objective) {
        this.objective = objective + " Go, Go, Go!!! " + doer.getImportantStuff();
    }

    @Override
    public String getObjective() {
        return objective;
    }
}
