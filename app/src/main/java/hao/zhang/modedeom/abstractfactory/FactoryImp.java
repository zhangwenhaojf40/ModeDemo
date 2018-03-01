package hao.zhang.modedeom.abstractfactory;

import hao.zhang.modedeom.simplefactory.Alto;
import hao.zhang.modedeom.simplefactory.Audi;

/**
 * Created by ZhangWenHao on 2018/3/1 0001.
 */

public class FactoryImp extends AbsFactory {
    @Override
    public Audi createAudi() {
        return new Audi();
    }

    @Override
    public Alto createAlto() {
        return new Alto();
    }
}
