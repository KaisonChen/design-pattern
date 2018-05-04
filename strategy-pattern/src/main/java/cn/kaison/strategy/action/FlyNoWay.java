package cn.kaison.strategy.action;

/**
 * User: kaison
 * Date: 2018/5/4
 * Time: 19:11
 * Description:
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly!");
    }
}
