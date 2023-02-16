package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        int evenNumber = 30;
        int oddNumber = 2137;
        BasicMath  basicMath = new BasicMath();
        System.out.println("Czy cyfra " + evenNumber + " jest liczbą parzystą?: " + basicMath.isEven(evenNumber));
        System.out.println("Czy cyfra " + oddNumber + " jest liczbą nieparzystą?: " + basicMath.isOdd(oddNumber));
        System.out.println("Pole koła o promieniu " + oddNumber + " wynosi: " + basicMath.circleField(oddNumber));
        System.out.println(evenNumber + " podniesione do kwadratu równa się " + basicMath.power(evenNumber));
    }
}
