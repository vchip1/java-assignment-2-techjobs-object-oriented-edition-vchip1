package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job garbagePerson = new Job();
        Job deliveryDriver = new Job();

        assertNotEquals(garbagePerson, deliveryDriver);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job productTester = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(productTester.getName(), "Product tester");
        assertEquals(productTester.getEmployer(), "ACME");
        assertEquals(productTester.getLocation(), "Desert");
        assertEquals(productTester.getPositionType(), "Quality Control");
        assertEquals(productTester.getCoreCompetency(), "Persistence");

        assertTrue(productTester instanceof Job);


    }
}
