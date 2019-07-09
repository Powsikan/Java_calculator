package com.company.v6.operation;

import org.junit.Test;

import static java.lang.Float.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class DivOperationTest {
    @Test
    public void divPositiveToNegativeTest(){
        Operation operation=new DivOperation(4,-2);
        double result=operation.perform();
        assertThat(result,is(-2.0));
    }
    @Test
    public void divPositiveToZeroTest(){
        Operation operation=new DivOperation(2,0);
        double result=operation.perform();
        assertThat(result,is(Double.POSITIVE_INFINITY));
    }
   @Test
    public void divNegativeToZeroTest(){
        Operation operation=new DivOperation(-2,0);
        double result=operation.perform();
        assertThat(result,is(Double.NEGATIVE_INFINITY));
    }
    @Test
    public void divPositiveToPositiveTest(){
        Operation operation=new DivOperation(2,2);
        double result=operation.perform();
        assertThat(result,is(1.0));
    }
    @Test
    public void divZeroToZeroTest(){
        Operation operation=new DivOperation(0,0);
        double result=operation.perform();
       assertThat(result,is(Double.NaN));
    }

}