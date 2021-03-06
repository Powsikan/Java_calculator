package com.company.v6.operation;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SubOperationTest {
    @Test
    public void subPositiveToNegativeTest(){
        Operation operation=new SubOperation(2,-3);
        double result=operation.perform();
        assertThat(result,is(5.0));
    }
    @Test
    public void subPositiveToZeroTest(){
        Operation operation=new SubOperation(2,0);
        double result=operation.perform();
        assertThat(result,is(2.0));
    }
    @Test
    public void subNegativeToZeroTest(){
        Operation operation=new SubOperation(-2,0);
        double result=operation.perform();
        assertThat(result,is(-2.0));
    }
    @Test
    public void subPositiveToPositiveTest(){
        Operation operation=new SubOperation(2,3);
        double result=operation.perform();
        assertThat(result,is(-1.0));
    }
    @Test
    public void subZeroToZeroTest(){
        Operation operation=new SubOperation(0,0);
        double result=operation.perform();
        assertThat(result,is(0.0));
    }

}