package de.et.complete;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Typed;

public class ObjectiveServiceRemember implements ObjectiveService {

    private String objective;

    @Override
    public void addObjective(String objective) {
        this.objective = objective;
    }

    @Override
    public String getObjective() {
        return objective;
    }
}
