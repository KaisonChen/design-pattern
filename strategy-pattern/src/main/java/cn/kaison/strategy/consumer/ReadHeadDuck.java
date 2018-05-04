package cn.kaison.strategy.consumer;

import cn.kaison.strategy.action.FlyNoWay;

/**
 * User: kaison
 * Date: 2018/5/4
 * Time: 19:06
 * Description:
 */
public class ReadHeadDuck extends Duck {

    public ReadHeadDuck(){
        flyBehavior = new FlyNoWay();
    }

    void display() {
        System.out.println("I im a read head duck!s");
    }
}
