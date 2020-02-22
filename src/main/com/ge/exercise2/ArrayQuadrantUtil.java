package com.ge.exercise2;

import java.util.LinkedList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayQuadrantUtil {
    private static final Logger logger = LogManager.getLogger(ArrayQuadrantUtil.class);

    Object[][] data;

    public ArrayQuadrantUtil(Object[][] data) {
        this.data = data;
    }

    public Object[] getQuadrantValues(int row, int column) {
    	Object[] quad=new Object[4];
    	List<Object> l1=new LinkedList<Object>();
    	for(int i=row*2;i<=row*2+1;i++)
    	{
    	{for(int j=column*2;j<=column*2+1;j++)
    		l1.add(data[i][j]);
    	}
    	}
    	for(int k=0;k<l1.size();k++)
    		quad[k]=l1.get(k);
    	return quad;
    }
    
    public Object[] getRow(int r)
    {   Object [] row=new Object[data.length];
    	for(int i=0;i<data[r-1].length;i++)
    		row[i]=data[r-1][i];
    	return row;
    }
    
    public Object[] getColumn(int c)
    {   Object [] column=new Object[data.length];
    	for(int i=0;i<data[c-1].length;i++)
    		column[i]=data[i][c-1];
    	return column;
    }
    
    public Object[] getColumnArbitarylength(int c, int size)
    {   Object [] column=new Object[size]; //c is column you want and size is arbitrary array size say 3 i.e, array size 3*3
    	for(int i=0;i<size;i++)
    		column[i]=data[i][c-1];
    	return column;
    }
   
    public Object[] getRowArbitarylength(int r, int size)
    {   Object [] row=new Object[size]; //r is row you want and size is arbitrary array size say 3 i.e, array size 3*3
    	for(int i=0;i<size;i++)
    		row[i]=data[r-1][i];
    	return row;
    }
}
