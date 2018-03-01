package hao.zhang.modedeom.proxy;

/**
 * Created by ZhangWenHao on 2018/3/1 0001.
 */

public class Car implements ICar {
   String run;
    public Car(String run) {
        this.run=run;

    }
    @Override
    public String run() {
        return run;
    }
}
