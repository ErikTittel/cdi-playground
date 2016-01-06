package de.et.complete;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.jglue.cdiunit.CdiRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

@RunWith(CdiRunner.class)
public class ObjectiveTest {

    @Inject
    private ObjectiveService service;

    @Test
    public void addObjective() {
        String objective = "read a book";

        service.addObjective(objective);

        String result = service.getObjective();
        assertThat(result, is("read a book"));
    }
}
