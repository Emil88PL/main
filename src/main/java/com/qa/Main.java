package com.qa;

import com.qa.model.Animal;
import com.qa.model.Cat;
import com.qa.model.Dog;
import com.qa.model.Rabbit;

public class Main {

    static Animal myCat = new Cat("Bob", 17) {
        public String sayHello() {
            return sayHello();
        };
    };

    static Animal myDog = new Dog("Rex", 13) {

    };

    static Animal myRabbit = new Rabbit("Mr.Rabbit", 3) {

    };

    public static void main(String[] args) {
        System.out.println(myCat);
        System.out.println(myDog);
        System.out.println(myRabbit);

    }
}
