package com.wmt;

/**
 * @description:
 * @author: wmt
 * @date: Created in 2020/4/3 15:13
 * @version: v1.0
 * @modified By:
 */
public class Persion {
    private String id;  //实例化的时候，做为对象的唯一标识

    //用向上造型实现   父类对象=子类对象   父类对象在调用的时候会“自动，智能”调用相应子类的方法
    public void feedAnimal(BeastOfPrey beastOfPrey) {
        beastOfPrey.behaviorEat();//调用的是子类的behaviorEat
    }

    //设计模式，解决工程上遇到的问题
    // 用重载实现！ 喂猫，喂狗，喂狐狸，喂狮子，喂老虎，喂狼   是程序员决定的！！！！
    //假设10000种动物 tom是个动物园饲养员
    public void feedAnimal(Bear bear) {
        bear.behaviorEat();
    }

    public void feedAnimal(Cat cat) {
        cat.behaviorEat();
    }

    public void feedAnimal(Dog dog) {
        dog.behaviorEat();
    }

    public void feedAnimal(Fox fox) {
        fox.behaviorEat();
    }

    public void feedAnimal(Lion lion) {
        lion.behaviorEat();
    }

    public void feedAnimal(Wolf wolf) {
        wolf.behaviorEat();
    }

    public void feedAnimal(Tiger tiger) {
        tiger.behaviorEat();
    }

    public void feedAnimal(Pig pig) {
        pig.behaviorEat();
    }
//    这里要写10000个方法！！！！！！！


    //////////////////////////////////////////////////////////////////
    public void playEachother(Bear bear) {
        System.out.println("play eachother with  " + bear.getBeastId());
    }

    public void viewAndAdmire(Bear bear) {
        System.out.println("viewAndAdmire  " + bear.getBeastId());
    }

    public void sweepNest(Bear bear) {
        System.out.println("sweepNest  " + bear.getBeastId());
    }


    public Persion() {
    }

    public Persion(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
