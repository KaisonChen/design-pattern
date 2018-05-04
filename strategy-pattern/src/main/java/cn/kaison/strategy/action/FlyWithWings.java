package cn.kaison.strategy.action;

/**
 * User: kaison
 * Date: 2018/5/4
 * Time: 19:03
 * Description: 动作行为类
 */
public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("fly with wings!");
    }
}
