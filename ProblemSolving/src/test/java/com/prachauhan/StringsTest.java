package com.prachauhan;
import org.junit.Test;

public class StringsTest {
    
    @Test
    public void splitIntoBlancedStringsTest(){
        SplitStringIntoBalancedStrings splitStringIntoBalancedStrings=new SplitStringIntoBalancedStrings();
        int num=splitStringIntoBalancedStrings.balancedStringSplit("RLLLLRRRLR");
        System.out.println(num);
    }
}
