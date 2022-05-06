
public class Exercicio2 {
    public static void main(String[] args) {
        Float decimalFloat = 12.5F;
        Integer inteiroInteger = 25;
        Double decimalDouble = 12.5;
        Long inteiroLong = 25L;
        Boolean booleano = false;

        System.out.println(decimalFloat.isNaN());
        System.out.println(decimalFloat.floatValue());
        System.out.println(decimalFloat.equals(12.5));
        System.out.println(decimalFloat.doubleValue());
        System.out.println(decimalFloat.toString());
        System.out.println("-----------------------");

        System.out.println(inteiroInteger.intValue());
        System.out.println(inteiroInteger.longValue());
        System.out.println(inteiroInteger.compareTo(25));
        System.out.println(inteiroInteger.getClass());
        System.out.println(inteiroInteger.byteValue());
        System.out.println("-----------------------");

        System.out.println(inteiroLong.longValue());
        System.out.println(inteiroLong.floatValue());
        System.out.println(inteiroLong.intValue() == 25);
        System.out.println(inteiroLong.doubleValue());
        System.out.println(inteiroLong.byteValue());
        System.out.println("-----------------------");

        System.out.println(decimalDouble.isNaN());
        System.out.println(decimalDouble.floatValue());
        System.out.println(decimalDouble.equals(12.5));
        System.out.println(decimalDouble.doubleValue());
        System.out.println(decimalDouble.toString());
        System.out.println("-----------------------");

        System.out.println(booleano.booleanValue());
        System.out.println(booleano.getClass());
        System.out.println(booleano.equals(false));
        System.out.println(booleano.toString());
        System.out.println(booleano.describeConstable());
    }
}
