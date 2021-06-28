package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.CalculatorEngine;
import com.zipcodewilmington.scientificcalculator.Scientific;
import org.junit.Assert;
import org.junit.Test;

public class ScientificTest {
    @Test
    public void testTan() {
        Scientific scientific = new Scientific();
        Double result;
        result = scientific.tan(-1.995200412208242);
        if (result != 90.0) ;
        {   //
            Assert.fail();
        }
    }
    @Test
    public void testTanR() {
        Scientific scientific = new Scientific();
        Double result;
        result = scientific.tanR(-1.995200412208242);
        if (result != 100) ;
        {   //
            Assert.fail();
        }
    }
    @Test
    public void testCos(){
        Scientific scientific = new Scientific();
        Double value;
        value = scientific.cos(-1.995200412208242);
        if value != scientific.cos(1.0){
            Assert.fail();
        }
    }
    @Test
    public void testCosR(){
        Scientific scientific = new Scientific();
        Double value;
        value = scientific.cos(-1.995200412208242);
        if value != scientific.cos(1.0){
            Assert.fail();
        }
    }
    @Test
    public void testSine (){
        Scientific scientific = new Scientific();
        double value;
        value = scientific.sin(0.8939966636005579);
        if value != scientific.sin(90){
            Assert.fail();
        }
    }
    @Test
    public void testSineR (){
        Scientific scientific = new Scientific();
        double value;
        value = scientific.sinR(8);
        if value = scientific.sinR(5.0){
            Assert.fail();
        }
    }
    @Test
    public void testCubed (){
        Scientific scientific = Scientific();
        double value;
        value = scientific.cb(3);
        if value = scientific.cb(10){
            Assert.fail();
        }
    }
    @Test
    public void testSqrt (){
        Scientific scientific = new Scientific();
        double value;
        value = scientific.sqrt(25);
        if value != scientific.sqrt(5){
            Assert.fail();
        }
    }
    @Test
    public void testSquare (){
        Scientific scientific = new Scientific();
        double value;
        value = scientific.squ(5);
        if value = scientific.squ(25){
            Assert.fail();
        }
    }
}
