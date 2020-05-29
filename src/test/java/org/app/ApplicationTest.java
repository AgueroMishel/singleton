package org.app;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ApplicationTest {
    @Test
    public void verifyCreateInstance() {
        assertNotNull(Singleton.getInstance());
    }

    @Test
    public void verifyCreateSingleInstance() {
        Singleton instanceA = Singleton.getInstance();
        Singleton instanceB = Singleton.getInstance();

        assertTrue(instanceA == instanceB);
    }
}
