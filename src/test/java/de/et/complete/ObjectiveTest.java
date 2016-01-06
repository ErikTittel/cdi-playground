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
    private ObjectiveService serivce;

    @Test
    public void addObjective() {
        String objective = "read a book";

        serivce.addObjective(objective);

        String result = serivce.getObjective();
        assertThat(result, is("read a book"));
    }
}
