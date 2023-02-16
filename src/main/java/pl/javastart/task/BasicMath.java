package pl.javastart.task;

public class BasicMath {

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public boolean isOdd(int number) {
        return number % 2 == 1;
    }

    public double circleField(double radius) {
        return 3.14 * radius * radius;
    }

    public int power(int number) {
        return number * number;
    }
}
