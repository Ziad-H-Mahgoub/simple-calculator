package acadmey.learnprogramming;

public class Main implements ICalculator {
    int maximum= Integer.MAX_VALUE;
    int minimum = Integer.MIN_VALUE;
    @Override
    public int add(int x, int y) {
        long max = (long)x+(long)y;
        if (max>maximum||max<minimum) {
            System.out.println("Out Of The Range");
            return -1;
        }
        return x+y;
    }

    @Override
    public float divide(int x, int y) {
        try {
            float z= (float)x/(float)y;
            return z;
        }
        catch (ArithmeticException e) {
            throw new RuntimeException("this division by 0");

        }
    }

}


