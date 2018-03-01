package hao.zhang.modedeom;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import hao.zhang.modedeom.builder.Person;

/**
 * Created by ZhangWenHao on 2018/3/1 0001.
 */

public class BuilderActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_build);
        TextView tv = (TextView) findViewById(R.id.tv);
        Person person = new Person.Builder()
                .setAddress("BeiJing")
                .setAge(27)
                .setName("关宏宇")
                .build()
                ;
        tv.setText(person.toString());
    }
}
