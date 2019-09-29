package animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        while (true) {
            String animalType = reader.readLine();

            if (animalType.equals("Beast!")) {
                break;
            }

            String[] animalInfo = reader.readLine().split("\\s+");

            String name = animalInfo[0];
            int age = Integer.parseInt(animalInfo[1]);
            String gender = animalInfo[2];

            switch (animalType) {
                case "Cat":
                    Cat cat = new Cat(name, age, gender);
                    System.out.println(cat.toString());
                    break;
                case "Dog":
                    Dog dog = new Dog(name, age, gender);
                    System.out.println(dog.toString());
                    break;
                case "Frog":
                    Frog frog = new Frog(name, age, gender);
                    System.out.println(frog.toString());
                    break;
                case "Kitten":
                    Kitten kitten = new Kitten(name, age);
                    System.out.println(kitten.toString());
                    break;
                case "Tomcat":
                    Tomcat tomcat = new Tomcat(name, age);
                    System.out.println(tomcat.toString());
                    break;
            }
        }

    }
}
