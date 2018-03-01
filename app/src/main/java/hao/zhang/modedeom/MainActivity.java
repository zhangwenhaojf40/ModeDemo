package hao.zhang.modedeom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mBuilder = (Button) findViewById(R.id.btn_builder);
        Button mProxy = (Button) findViewById(R.id.btn_proxy);
        Button mFactory = (Button) findViewById(R.id.btn_factory);
        mBuilder.setOnClickListener(this);
        mProxy.setOnClickListener(this);
        mFactory.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_builder:
                jumpActivity(BuilderActivity.class);
                break;
            case R.id.btn_proxy:
                jumpActivity(ProxyActivity.class);
                break;
            case R.id.btn_factory:
                jumpActivity(FactoryActivity.class);
                break;
        }
    }
    public void jumpActivity(Class<? extends AppCompatActivity> clz) {
        Intent intent = new Intent(this,clz);
        startActivity(intent);


    }
}
