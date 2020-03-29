package com.prachauhan;

import org.junit.Assert;
import org.junit.Test;

public class RevIntTest {
    
    @Test
    public void revIntTest(){
        int N=1534236469;
        RevInt revInt=new RevInt();
        int output=revInt.reverse(N);
        Assert.assertEquals(0,output);
    }
}
