package acadmey.learnprogramming;

import static org.junit.Assert.*;

public class MainTest {
 private Main obj = new Main();

    @org.junit.Test
    public void add() {
        assertEquals(0,obj.add(50,-50));
        assertEquals(5,obj.add(3,2));
        assertEquals(-1,obj.add(Integer.MAX_VALUE,1));
        assertEquals(-1,obj.add(Integer.MIN_VALUE,-1));

    }

    @org.junit.Test
    public void divide() {
        assertEquals((float)2.5,obj.divide(5,2),0);
        assertEquals((float)0,obj.divide(0,123),0);
        assertEquals((float)0,obj.divide(0,-123),0);
        try {
            float x= obj.divide(123,0);
        }catch (RuntimeException r){
            System.out.println("It tests ");
            System.out.println(r.toString());
        }
        try {
            float x= obj.divide(-123,0);
        }catch (RuntimeException r){
            System.out.println("It tests ");
            System.out.println(r.toString());
        }
    }
}