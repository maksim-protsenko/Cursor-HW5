import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        System.out.println("Write a generic class named MyList, with a type parameter T. The type parameter T should be constrained to\n" +
                "an upper bound: the Number class. The class should have as a field an ArrayList of T. Write a public method\n" +
                "named add, which accepts a parameter of type T. When an argument is passed to the method, it is added to the\n" +
                "ArrayList. Write two other methods, largest and smallest, which return the largest and smallest values in the ArrayList\n");

        MyList<Double> doubleList = new MyList<>();
        doubleList.add((double) 5);
        doubleList.add(3.578);
        doubleList.add(3.584);
        doubleList.add(3.784);
        doubleList.add(3.56764);
        System.out.println("List of Double type values:" + doubleList);

        MyList<Integer> integerList = new MyList<>();
        integerList.add(5);
        integerList.add(20);
        integerList.add(-562684);
        integerList.add(100);
        integerList.add(587);
        System.out.println("List of Integer type values:" + integerList);

        MyList<Long> longList = new MyList<>();
        longList.add(556466575757675676L);
        longList.add(2056L);
        longList.add(-5629808908684L);
        longList.add(1009000L);
        longList.add(587L);
        System.out.println("List of Long type values:" + longList);

        MyList<BigInteger> bigIntegerList = new MyList<>();
        bigIntegerList.add(new BigInteger("1569998"));
        bigIntegerList.add(new BigInteger("869"));
        bigIntegerList.add(new BigInteger("-854"));
        bigIntegerList.add(new BigInteger("-388775"));
        bigIntegerList.add(new BigInteger("569"));
        System.out.println("List of BigInteger type values:" + bigIntegerList);
    }
}
