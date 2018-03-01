package hao.zhang.modedeom;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.lang.reflect.Proxy;

import hao.zhang.modedeom.proxy.Car;
import hao.zhang.modedeom.proxy.DynamicProxy;
import hao.zhang.modedeom.proxy.ICar;

/**
 * Created by ZhangWenHao on 2018/3/1 0001.
 *
 *
 */

public class ProxyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxy);
        TextView tv = (TextView) findViewById(R.id.tv);
        Car car = new Car("心情是自由自在");
        DynamicProxy proxy = new DynamicProxy(car);

        Class c1 = car.getClass();

        ICar mCar = (ICar) Proxy.newProxyInstance(c1.getClassLoader(), c1.getInterfaces(), proxy);
        tv.setText(mCar.run());


    }
}
