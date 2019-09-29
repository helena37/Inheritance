package RandomArrayList;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        RandomArrayList randomArrayList = new RandomArrayList();
        randomArrayList.add("Pesho");
        randomArrayList.add(125);
        randomArrayList.add('a');
        randomArrayList.add(new BigDecimal("1.24"));

        System.out.println(randomArrayList.getRandomElement());
        System.out.println(randomArrayList.getRandomElement());
        System.out.println(randomArrayList.getRandomElement());
        System.out.println(randomArrayList.getRandomElement());
    }
}
