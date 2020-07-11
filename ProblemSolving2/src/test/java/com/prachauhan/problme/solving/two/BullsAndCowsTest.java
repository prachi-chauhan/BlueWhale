package com.prachauhan.problme.solving.two;

import com.prachauhan.problem.solving.two.BullsAndCowsProblem;
import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.assertNotNull;

public class BullsAndCowsTest {
    public static final Logger logger = Logger.getLogger(BullsAndCowsTest.class.getName());
    
    @Test
    public void bullsAndCowsTest() {
        BullsAndCowsProblem bullsAndCowsProblem = new BullsAndCowsProblem();
        String val = bullsAndCowsProblem.getHint("1123", "0111");
        logger.info(val);
        
        assertNotNull(val);
    }
}
