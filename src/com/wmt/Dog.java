package com.wmt;

/**
 * @description:
 * @author:
 * @date:Created in 2020-03-26 19:08
 * @version:0.0.1
 * @modified By:
 */
public class Dog  extends BeastOfPrey{
    @Override
    public void behaviorAvoid() {
        System.out.print("hold tail , ");
        super.behaviorAvoid();
    }
}

