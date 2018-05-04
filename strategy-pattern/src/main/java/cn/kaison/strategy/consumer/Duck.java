package cn.kaison.strategy.consumer;

import cn.kaison.strategy.action.FlyBehavior;

/**
 * User: kaison
 * Date: 2018/5/4
 * Time: 19:00
 * Description:
 */
public abstract class Duck {

    //同一包中所有子类都会继承这个接口的引用变量
    FlyBehavior flyBehavior;

    abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    //将行为委托出去
    public void performFly(){
        flyBehavior.fly();
    }
}
