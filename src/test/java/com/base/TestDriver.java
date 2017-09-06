package com.base;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestDriver {

    @Test
    public void testDriver() {
        Driver driver = new Driver();
        assertEquals("Himanshu",driver.getName());
    }
}
