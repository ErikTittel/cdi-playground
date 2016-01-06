package de.et.complete;

import javax.inject.Singleton;

@Singleton
public class ObjectiveService {

    private String objective;

    public void addObjective(String objective) {
        this.objective = objective;
    }

    public String getObjective() {
        return objective;
    }
}
