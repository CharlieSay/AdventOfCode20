package uk.co.charliesay.day1;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DayOneTest {

    DayOne dayOne = new DayOne();

    @Test
    public void completedDayOne(){
        String partOne = dayOne.partOne();
        String partTwo = dayOne.partTwo();

        System.out.println(dayOne.solutionsTogether());

        assertNotNull(partOne);
        assertNotNull(partTwo);
    }

}