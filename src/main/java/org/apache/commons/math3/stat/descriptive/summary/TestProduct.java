package org.apache.commons.math3.stat.descriptive.summary;

public class TestProduct
{
    public static void main(String[] args) {
        TestProduct myTest=new TestProduct();
        myTest.testEvaluate();
        myTest.testIncrement();
        myTest.testGetResult();
        myTest.testClear();
    }

    public void assertEqual(double src,double des,String s)
    {
        if(src!=des)
            System.err.println(s+"Error!");
        else System.out.println(s+"Pass!");
    }

    public void testEvaluate()
    {
        Product p=new Product();
        double[]values=new double[]{1.0,2.0,3.0,4.0,5.0};
        assertEqual(p.evaluate(values),120.0,"testEvaluate");
    }

    public void testIncrement()
    {
        Product p = new Product();
        double[] values = new double[] { 1.0,2.0,3.0,4.0,5.0 };
        int i;
        for(i=0;i<values.length;i++)
        {
            p.increment(values[i]);
        }
        assertEqual(p.getN(),5,"testIncrement ");
    }


    public void testGetResult()
    {
        double[] values = new double[] { 1.0,2.0,3.0,4.0,5.0 };
        Product p = new Product();
        int i;
        for(i=0;i<values.length;i++)
        {
            p.increment(values[i]);
        }
        assertEqual(p.getResult(),120.0,"testGetResult ");
    }


    public void testClear()
    {
        Product p = new Product();
        double[] values = new double[] { 1.0,2.0,3.0,4.0,5.0 };
        int i;
        for(i=0;i<values.length;i++)
        {
            p.increment(values[i]);
        }
        p.clear();
        assertEqual(p.getN(),0,"testGetResult ");
    }


}
