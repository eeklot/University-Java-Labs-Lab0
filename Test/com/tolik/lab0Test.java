package com.tolik;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import java.util.Arrays;

import static org.testng.Assert.*;

public class lab0Test {
    public lab0 obj = new lab0();

    ///////////////////////////////////////////////////
    // check : function that returns area of rect
    // exception provider
    @DataProvider
    public Object[][] areaTaskException(){
        return new Object[][] {
                {-1000,1},
                {-500,0}
        };
    }
    // exceprion provider test
    @Test(
            expectedExceptions= IllegalArgumentException.
            class,dataProvider = "areaTaskException"
    )
    public void areaException(float side,float expected){
        assertEquals(obj.rectArea(side),expected);
    }

    @DataProvider
    public Object[][] areaTaskProvider(){
        // first - side of reckt and second the square
        // actual,  expected
        return new Object[][] {
                {0,0},
                {1,1},
                {2,4},
                {3,9}
        };
    }
    @Test(dataProvider = "areaTaskProvider")
    public void areaTest(float side_of_rect, float exp){
        // actual then expected
        assertEquals(obj.rectArea(side_of_rect),exp);
    }

    ///////////////////////////////////////////////
    // check : find full tons in mass
    @DataProvider
    public Object[][] fullTonsProvider(){
        // mass,    full tons
        // actual,  expected
        return new Object[][] {
                {1000,1},
                {1600,1},
                {2100,2},
                {500,0},
                {0,0}
        };
    }
    @Test(dataProvider = "fullTonsProvider")
    public void fullTonsTest(int mass_to_chack,int exp){
        assertEquals(obj.fullTons(mass_to_chack),exp);
    }
    ////////////////////////////////////////////////////
    // check : function isEquals
    @DataProvider
    public Object[][] isEqualsProvider(){
        return new Object[][] {
                //ectual value - value Expected
                {0,true},
                {1,false},
                {2,true},
                {3,false},
                {4,true},
                {5,false},
                {-10,true},
                {-5,false}
        };
    }
    @Test(dataProvider = "isEqualsProvider")
    public void isEqualsTest(int value,boolean exp){
        assertEquals(obj.isEquals(value),exp);
    }
    ////////////////////////////////////////////////
    // test function : changeValue
    @DataProvider
    public Object[][] changeValueProvider(){
        // actual , expected
        return new Object[][] {
                {0,1},
                {1,2},
                {10,11},
                {-1,-3},
                {-2,-4}
        };
    }
    @Test(dataProvider = "changeValueProvider")
    public void changeValue(int value,int exp){
        assertEquals(obj.changeValue(value),exp);
    }
    ///////////////////////////////////////////////
    // test function : examinate
    @DataProvider
    public Object[][] examinateProvider(){
        // value ,expected res
        return new Object[][] {
                {1,"плохо"},
                {2,"неудовлетворительно"},
                {3,"удовлетворительно"},
                {4,"хорошо»"},
                {5,"отлично"},
                {6,"ошибка"},
                {0,"ошибка"},
                {-1,"ошибка"}
        };
    }
    @Test(dataProvider = "examinateProvider")
    public void examinateTest(int value_to_pass,String exp){
        assertEquals(obj.examinate(value_to_pass),exp);
    }
    ///////////////////////////////////////////////////////
    // exp function : check
    @DataProvider
    public Object[][] expProvider(){
        // function arg : X and N, exp value
        return new Object[][] {
                //X,N,exp
                {1,0,1},
                {1,1,2},
                {1,2,2.5},
                {1,3,2.666666},
                {1,4,2.708333},
                {2,1,3},
                {2,2,4},
                {2,3,4.333333},
                {3,1,4},
                {3,2,5.5}
        };
    }
    @Test(dataProvider="expProvider")
    public void expTest(double X,int N,double exp){
        assertEquals(obj.exp(X,N), exp,0.000001);
    }
    /////////////////////////////////////////////////
    // check function : linesIn
    @DataProvider
    public Object[][] linesInProvider(){
        // line A, line B, exp
        return new Object[][] {
                {1,1,1},
                {2,1,2},
                {2,0.5f,4},
                {1,0.2f,5},
                {1,0.1f,10}
        };
    }
    @Test(dataProvider = "linesInProvider")
    public void linesInTest(float line_a,float line_b,int exp){
        assertEquals(obj.linesIn(line_a,line_b),exp);
    }
    ///////////////////////////////////////////////////////////
    // check function : array task
    @DataProvider
    public Object[][] arrayTaskProvider(){
        return new Object[][]{
                {new int[] {1,2,3,4,5,6,7,8,9,10},  9},
                {new int[] {10,2,3,4,5,1,2},    0},
                {new int[] {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10},    0},
                {new int[] {1,-2,-3,-4,5,-6,-7,-8,-9,10},    5}
        };
    }
    @Test(dataProvider = "arrayTaskProvider")
    public void arrayTaskTest(int[] array, int exp){
        assertEquals(obj.arrayTask(array),exp);
    }
    ///////////////////////////////////////////////////////////
    // check function : changeRaws
    @DataProvider
    public Object[][] changeRawsProvider(){
            return new Object[][]{
                    {
                        new float[][]{
                                {1,2},
                                {1,2}
                                },
                            // k1 k2
                            0, 1,
                            // exp matr
                            new float[][]{
                                    {2, 1},
                                    {2, 1}
                            }
                    },
                    // second fiels
                    {
                        new float[][]{
                                {1,2,3},
                                {-1,2,-3},
                                {0,0,1}
                        },
                        0,2,
                        new float[][]{
                                {3,2,1},
                                {-3,2,-1},
                                {1,0,0}
                        }

                    }
                };
    }
    @Test(dataProvider = "changeRawsProvider")
    public void changeRawsTEst(float[][] array,int k1,int k2, float[][] exp){
        obj.changeRaws(array,k1,k2);
        assertTrue(Arrays.deepEquals(array,exp));
    }
}

