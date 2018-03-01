package hao.zhang.modedeom.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by ZhangWenHao on 2018/3/1 0001.
 * 个人理解： 在不改变  目标对象方法的情况下   修改  处理 目标对象的方法
 * 代理的前提条件是  目标对象实现接口
 *  更像是拦截器
 */

public class DynamicProxy implements InvocationHandler {
    Object obj;
    public DynamicProxy(Object obj) {
        this.obj = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String  invoke = (String) method.invoke(obj, args);
        StringBuilder sb = new StringBuilder();
        sb.append("速度七十迈,")
                .append(invoke)
                .append(",希望终点是爱琴海");
        return sb.toString();
    }
}
