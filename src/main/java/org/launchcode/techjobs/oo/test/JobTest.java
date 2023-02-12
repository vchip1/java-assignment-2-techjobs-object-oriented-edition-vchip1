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

        assertEquals(productTester.getName().toString(), "Product tester");
        assertEquals(productTester.getEmployer().toString(), "ACME");
        assertEquals(productTester.getLocation().toString(), "Desert");
        assertEquals(productTester.getPositionType().toString(), "Quality control");
        assertEquals(productTester.getCoreCompetency().toString(), "Persistence");

        assertTrue(productTester instanceof Job);
        assertTrue(productTester.getEmployer() instanceof Employer);
        assertTrue(productTester.getLocation() instanceof Location);
        assertTrue(productTester.getPositionType() instanceof PositionType);
        assertTrue(productTester.getCoreCompetency() instanceof CoreCompetency);


    }

    @Test
    public void testJobsForEquality() {
        Job iceCreamTester = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job dogFoodTester = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals(iceCreamTester, dogFoodTester);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job productTester = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String productTesterString = productTester.toString();
        assertEquals(productTesterString.charAt(0), productTesterString.charAt((productTesterString.length())-1));

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job productTester = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String productTesterString = productTester.toString();

        assertEquals(productTesterString, "\n" +
                "ID: 4\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n" +
                "\n");
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job productTester = new Job("Product tester", new Employer(), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String productTesterString = productTester.toString();

        assertEquals(productTesterString, "\n" +
                "ID: 3\n" +
                "Name: Product tester\n" +
                "Employer: Data not available\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n" +
                "\n");
    }
}
