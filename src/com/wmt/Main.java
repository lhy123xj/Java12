package com.wmt;

import java.sql.SQLSyntaxErrorException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Persion tom=new Persion();
        tom.setId("20190012");

        Bear tomBear=new Bear();
        tomBear.setBeastId("tomBear");
        Cat tomCat=new Cat();
        tomCat.setBeastId("tomCat");
        Pig tomPig=new Pig();
        tomPig.setBeastId("tomPig");

        tom.feedAnimal(tomBear);
        System.out.println("\n");
        tom.feedAnimal(tomCat);
        System.out.println("\n");
        tom.feedAnimal(tomPig);
    }
}





//    Cat tomCat=new Cat();
//        tomCat.setBeastId("20190001");
//                tomCat.setGender("male");
//                tomCat.setWeight("5kg");
//                System.out.println(tomCat.getBeastId()+" " +tomCat.getGender()+" " + tomCat.getWeight()+ " " );
//                tomCat.behaviorEat();
















//    Cat cat=new Cat();
//    Dog dog=new Dog();
//
//    Person person=new Person();
//    person.feedAnimal(cat);
//    person.feedAnimal(dog);