package cn.kaison.strategy.app;

import cn.kaison.strategy.action.FlyWithWings;
import cn.kaison.strategy.consumer.Duck;
import cn.kaison.strategy.consumer.ReadHeadDuck;

/**
 * User: kaison
 * Date: 2018/5/4
 * Time: 19:12
 * Description:
 */
public class DuckFlyApp {

    public static void main(String args[]){
        Duck readHeadDuck = new ReadHeadDuck();
        readHeadDuck.performFly();
        readHeadDuck.setFlyBehavior(new FlyWithWings());
        readHeadDuck.performFly();
    }
}
