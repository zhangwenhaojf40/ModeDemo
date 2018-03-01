package hao.zhang.modedeom.abstractfactory;

import hao.zhang.modedeom.simplefactory.Alto;
import hao.zhang.modedeom.simplefactory.Audi;

/**
 * Created by ZhangWenHao on 2018/3/1 0001.
 */

public abstract class AbsFactory {
    abstract Audi createAudi();
    abstract Alto createAlto();

}
