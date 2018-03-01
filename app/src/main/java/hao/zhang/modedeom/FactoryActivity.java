package hao.zhang.modedeom;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import hao.zhang.modedeom.abstractfactory.FactoryImp;
import hao.zhang.modedeom.methodfactory.AltoFactory;
import hao.zhang.modedeom.methodfactory.AudiFactory;
import hao.zhang.modedeom.simplefactory.Alto;
import hao.zhang.modedeom.simplefactory.Audi;
import hao.zhang.modedeom.simplefactory.Car;
import hao.zhang.modedeom.simplefactory.CarFactory;

import static hao.zhang.modedeom.R.id.tv;

/**
 * Created by ZhangWenHao on 2018/3/1 0001.
 * http://blog.csdn.net/lemon_tree12138/article/details/46225213 可参考
 * 简单工厂  和方法工厂  本质上没有什么区别
 * 方法工厂  是一个目标对象 对应一个工厂  把简单工厂 拆分出来 如增加  Byd   简单工厂需要
 * 更改 代码    方法工厂则不需要  直接增加  BydFactory
 *
 * 三种方法都差不多  写法不一样而已   个人习惯而定   倾向于第三种
 */

public class FactoryActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv1;
    private TextView tv2;
    private TextView tv3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        Button mSimple = (Button) findViewById(R.id.btn_simple);
        Button mAbstract = (Button) findViewById(R.id.btn_abstract);
        Button mMethod = (Button) findViewById(R.id.btn_method);
        mSimple.setOnClickListener(this);
        mAbstract.setOnClickListener(this);
        mMethod.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_simple://简单工厂
                Car car1 = new CarFactory().create(Audi.class);
                Car car2 = new CarFactory().create(Alto.class);
                tv1.setText(car1.setName()+car2.setName());
                break;
            case R.id.btn_abstract://抽象工厂
                FactoryImp factory = new FactoryImp();
                Car car5 = factory.createAudi();
                Car car6 = factory.createAlto();
                tv3.setText(car5.setName()+car6.setName());
                break;
            case R.id.btn_method://工厂方法
                Car car3 = new AudiFactory().create();
                Car car4 = new AltoFactory().create();
                tv2.setText(car3.setName()+car4.setName());
                break;
        }

    }
}
