package com.ge.exercise2;

import org.junit.Assume;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayQuadrantUtilTest {

    @Test
    public void getQuadrantValuesTest() {
        Object[][] data = {
                {'a', 'b', 'c', 'd'},
                {'e', 'f', 'g', 'h'},
                {'i', 'j', 'k', 'l'},
                {'m', 'n', 'o', 'p'}
        };
        ArrayQuadrantUtil util = new ArrayQuadrantUtil(data);
        Assume.assumeNotNull(util.getQuadrantValues(0, 0));
        Object[] expectedResult = {'a', 'b','e', 'f'};
        assertArrayEquals(expectedResult, util.getQuadrantValues(0, 0));
        
        Object[][] data1 = {
                {'a', 'b', 'c', 'd', 'l'},
                {'e', 'f', 'g', 'h', 'm'},
                {'i', 'j', 'k', 'l', 'n'},
                {'m', 'n', 'o', 'p', 'o'},
                {'u', 'v', 'y', 'x', 'y'},
                {'g', 'h', 'i', 'j', 'k'}
                
        };
        ArrayQuadrantUtil util1 = new ArrayQuadrantUtil(data1);
        Assume.assumeNotNull(util1.getQuadrantValues(0, 0));
        Object[] expectedResult1 = {'a', 'b','e', 'f'};
        assertArrayEquals(expectedResult1, util1.getQuadrantValues(0, 0));

        Object[][] data2 = {
                {1,2,3,4,5},
                {6,7,8 ,9 ,10 },
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
                
        };
        ArrayQuadrantUtil util2 = new ArrayQuadrantUtil(data2);
        Assume.assumeNotNull(util2.getQuadrantValues(0, 0));
        Object[] expectedResult2 = {1,2,6,7};					  	 							  
        assertArrayEquals(expectedResult2, util2.getQuadrantValues(0, 0));
                
    }
    
    @Test
    public void getRowTest() {
    	Object[][] data = {
    	{'a', 'b', 'c', 'd'},
        {'e', 'f', 'g', 'h'},
        {'i', 'j', 'k', 'l'},
        {'m', 'n', 'o', 'p'}
    	};
    	
    	 ArrayQuadrantUtil util = new ArrayQuadrantUtil(data);
         Object[] expectedResult = {'e', 'f', 'g', 'h'};
         assertArrayEquals(expectedResult, util.getRow(2));
         
        Object[][] data1 = {
                {'a', 'b', 'c', 'd', 'l'},
                {'e', 'f', 'g', 'h', 'm'},
                {'i', 'j', 'k', 'l', 'n'},
                {'m', 'n', 'o', 'p', 'o'},
                {'m', 'n', 'o', 'p', 'o'}
                
        };
        ArrayQuadrantUtil util1 = new ArrayQuadrantUtil(data1);
        Object[] expectedResult1 = {'e', 'f', 'g', 'h' ,'m'};
        assertArrayEquals(expectedResult1, util1.getRow(2));
        
        Object[][] data2 = {
                {1,2,3,4,5},
                {6,7,8 ,9 ,10 },
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
                
        };

        ArrayQuadrantUtil util2 = new ArrayQuadrantUtil(data2);
        Object[] expectedResult2 = {1,2,3,4,5};
        assertArrayEquals(expectedResult2, util2.getRow(1));
    }
    
    @Test
    public void getColumnTest() {
    	
    	Object[][] data = {
    	    	{'a', 'b', 'c', 'd'},
    	        {'e', 'f', 'g', 'h'},
    	        {'i', 'j', 'k', 'l'},
    	        {'m', 'n', 'o', 'p'}
    	    	};
    	    	
    	    	 ArrayQuadrantUtil util = new ArrayQuadrantUtil(data);
    	         Object[] expectedResult = {'a', 'e', 'i', 'm'};
    	         assertArrayEquals(expectedResult, util.getColumn(1));
    	         
        Object[][] data1 = {
                {'a', 'b', 'c', 'd', 'l'},
                {'e', 'f', 'g', 'h', 'm'},
                {'i', 'j', 'k', 'l', 'n'},
                {'m', 'n', 'o', 'p', 'o'},
                {'u', 'v', 'w', 'x', 'y'}
                
        };
        ArrayQuadrantUtil util1 = new ArrayQuadrantUtil(data1);
        Object[] expectedResult1 = {'a', 'e', 'i', 'm' ,'u'};
        assertArrayEquals(expectedResult1, util1.getColumn(1));
        
        Object[][] data2 = {
                {1,2,3,4,5},
                {6,7,8 ,9 ,10 },
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
                
        };

        ArrayQuadrantUtil util2 = new ArrayQuadrantUtil(data2);
        Object[] expectedResult2 = {1,6,11,16,21};
        assertArrayEquals(expectedResult2, util2.getColumn(1));
    }
    
    @Test
    public void getArbitaryColumnTest() {
        Object[][] data = {
                {'a', 'b', 'c', 'd', 'l'},
                {'e', 'f', 'g', 'h', 'm'},
                {'i', 'j', 'k', 'l', 'n'},
                {'m', 'n', 'o', 'p', 'o'},
                {'u', 'v', 'w', 'x', 'y'}
                
        };
        
        ArrayQuadrantUtil util = new ArrayQuadrantUtil(data);
        Object[] expectedResult = {'b', 'f', 'j', 'n' ,'v'};
        assertArrayEquals(expectedResult, util.getColumnArbitarylength(2,5));
         
        Object[][] data1 = {
                {1  ,2  ,3  ,4  ,5},
                {6  ,7  ,8  ,9  ,10},
                {11 ,1 ,13 ,14 ,15},
                {16 ,17 ,18 ,19 ,20},
                {21 ,22 ,23 ,24 ,25}
                
        };

        ArrayQuadrantUtil util1= new ArrayQuadrantUtil(data1);
        Object[] expectedResult1 = {2,7,1,17,22};
        assertArrayEquals(expectedResult1, util1.getColumnArbitarylength(2,5));
    }
    
    @Test
    public void getArbitaryRowTest() {
        Object[][] data = {
                {'a', 'b', 'c', 'd', 'l'},
                {'e', 'f', 'g', 'h', 'm'},
                {'i', 'j', 'k', 'l', 'n'},
                {'m', 'n', 'o', 'p', 'o'},
                {'u', 'v', 'w', 'x', 'y'}
                
        };
        
        ArrayQuadrantUtil util = new ArrayQuadrantUtil(data);
        Object[] expectedResult = {'e', 'f', 'g'};
        assertArrayEquals(expectedResult, util.getRowArbitarylength(2,3));
         
        Object[][] data1 = {
                {1  ,2  ,3  ,4  ,5},
                {6  ,7  ,8  ,9  ,10},
                {11 ,1 ,13 ,14 ,15},
                {16 ,17 ,18 ,19 ,20},
                {21 ,22 ,23 ,24 ,25}
                
        };

        ArrayQuadrantUtil util1= new ArrayQuadrantUtil(data1);
        Object[] expectedResult1 = {1,2,3,4,5};
        assertArrayEquals(expectedResult1, util1.getRowArbitarylength(1,5));
    }
}