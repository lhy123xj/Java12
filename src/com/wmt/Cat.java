package com.wmt;

/**
 * @description:
 * @author:
 * @date:Created in 2020-03-26 19:08
 * @version:0.0.1
 * @modified By:
 */
//如果子类没有特殊性，要父类干嘛呢？没有必要需要子类
public class Cat  extends BeastOfPrey{

    @Override
    public void behaviorAvoid() {
        System.out.println("climb tree.");
    }

    public void behaviorAvoid(String something){
        System.out.println("with " +something+ " ,climb tree.");
    }

    @Override
    public void behaviorEat() {
        System.out.println("cat eat ......");
    }
}



//    @Override
//    public void behaviorAvoid() {
//        System.out.println("mao mi bowBack.");
//        super.behaviorAvoid();//调用父类方法
//    }
//
//    @Override
//    public void behaviorEat() {
//        super.behaviorEat();
//        System.out.println("mao mi eating......");
//    }