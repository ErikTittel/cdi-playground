package de.et.complete;

import javax.inject.Inject;

public class Holder {

    @Inject
    private Doer doer;


    public String getText() {
        return doer.getImportantStuff();
    }
}
