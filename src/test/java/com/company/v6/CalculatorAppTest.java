package com.company.v6;

import com.company.v6.repository.NumberRepository;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatorAppTest {
    @Test
    public void testCase1(){
        //mock a  number repository
        NumberRepository numberRepository=mock(NumberRepository.class);
        List<Double> number=new ArrayList<>();
        number.add(10.0);
        number.add(30.0);
        when(numberRepository.read()).thenReturn(number);

        String[] args={"add"};
        CalculatorApp calculatorApp=new CalculatorApp(numberRepository,args);
        calculatorApp.run();
    }


}