package hao.zhang.modedeom.simplefactory;

/**
 * Created by ZhangWenHao on 2018/3/1 0001.
 */

public class CarFactory {
    public Car create(Class<? extends Car> clz) {
        if (clz.getName().equals(Audi.class.getName())) {
            return new Audi();
        } else if(clz.getName().equals(Alto.class.getName())){
            return new Alto();
        }
        return null;
    }
}
