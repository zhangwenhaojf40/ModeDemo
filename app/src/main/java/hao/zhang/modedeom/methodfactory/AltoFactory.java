package hao.zhang.modedeom.methodfactory;

import hao.zhang.modedeom.simplefactory.Alto;
import hao.zhang.modedeom.simplefactory.Audi;
import hao.zhang.modedeom.simplefactory.Car;

/**
 * Created by ZhangWenHao on 2018/3/1 0001.
 */

public class AltoFactory extends CarFactory{

    @Override
    public Car create() {
        return new Alto();
    }
}
