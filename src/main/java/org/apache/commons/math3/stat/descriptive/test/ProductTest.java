package org.apache.commons.math3.stat.descriptive.test;

import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * Product Tester.
 *
 * @author <Authors name>
 * @since <pre>11月 9, 2022</pre>
 * @version 1.0
 */
public class ProductTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    public void assertEqual(double src,double des,String s)
    {
        if(src!=des)
            System.err.println(s+"Error!");
        else System.out.println(s+"Pass!");
    }


    /**
     *
     * Method: increment(final double d)
     *
     */
    @Test
    public void testIncrement() throws Exception {
        Product p= new Product();
        double[] values = new double[] { 1.0,2.0,3.0,4.0,5.0 };
        for(int i=0;i<values.length;i++)
        {
            p.increment(values[i]);
        }
        assertEqual(p.getN(),5, "testIncrement ");
    }

    /**
     *
     * Method: getResult()
     *
     */
    @Test
    public void testGetResult() throws Exception {

        Product p= new Product();
        double[] values = new double[] { 1.0,2.0,3.0,4.0,5.0 };

        for(int i=0;i<values.length;i++)
        {
            p.increment(values[i]);
        }

        assertEqual(p.getResult(),120.0,"testGetResult ");
    }

    /**
     *
     * Method: getN()
     *
     */
    @Test
    public void testGetN() throws Exception {

        Product p= new Product();
        double[] values = new double[] { 1.0,2.0,3.0,4.0,5.0 };

        for(int i=0;i<values.length;i++)
        {
            p.increment(values[i]);
        }

        assertEqual(p.getN(),5,"testGetN      ");
    }

    /**
     *
     * Method: clear()
     *
     */
    @Test
    public void testClear() throws Exception {

        Product p= new Product();
        double[] values = new double[] { 1.0,2.0,3.0,4.0,5.0 };

        for(int i=0;i<values.length;i++)
        {
            p.increment(values[i]);
        }
        p.clear();
        assertEqual(p.getN(),0,"testClear     ");
    }

    /**
     *
     * Method: evaluate(final double[] values, final int begin, final int length)
     *
     */
    @Test
    public void testEvaluate1() throws Exception {
        Product p= new Product();
        double[] values = new double[] { 1.0,2.0,3.0,4.0,5.0 };
        assertEqual(p.evaluate(values,0,5),120,"testEvaluate1 ");
    }

    /**
     *
     * Method: evaluate(final double[] values, final double[] weights, final int begin, final int length)
     *
     */
    @Test
    public void testEvaluate2() throws Exception {
        Product p= new Product();
        double[] values = new double[] { 1.0,2.0,3.0,4.0,5.0 };
        double[] weight = new double[] { 2.0,2.0,1.0,1.0,1.0 };
        assertEqual(p.evaluate(values,weight,0,5),240,"testEvaluate2 ");
    }

    /**
     *
     * Method: evaluate(final double[] values, final double[] weights)
     *
     */
    @Test
    public void testEvaluate3() throws Exception {
        Product p= new Product();
        double[] values = new double[] { 1.0,2.0,3.0,4.0,5.0 };
        double[] weight = new double[] { 2.0,2.0,1.0,1.0,1.0 };
        assertEqual(p.evaluate(values,weight),240,"testEvaluate3 ");
    }
}
