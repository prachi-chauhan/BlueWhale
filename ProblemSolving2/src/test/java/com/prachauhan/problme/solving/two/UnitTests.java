package com.prachauhan.problme.solving.two;

import com.prachauhan.problem.solving.two.RearrangeString;
import org.junit.Assert;
import org.junit.Test;

public class UnitTests {
    
    @Test
    public void rearrangeStringTest(){
        RearrangeString rearrangeString=new RearrangeString();
        String s=rearrangeString.reorganizeString("aaab");
        Assert.assertEquals("",s);
    }
}
