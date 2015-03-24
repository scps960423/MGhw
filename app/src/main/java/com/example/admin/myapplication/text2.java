package com.example.admin.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Admin on 2015/3/6.
 */
public class text2 extends Activity {
    private TextView testHello;
    private static final String ACTIVITY_TAG="happyert";

    private int name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text2);

        testHello=(TextView)findViewById(R.id.textView);
        testHello.setClickable(true);
        testHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.putExtra("ACTIVITY_TAG","O3O");
                setResult(Activity.RESULT_OK,intent);
                finish();
            }
        });

        //------------------------------------------------------
        //setContentView(R.layout.text2);
        Intent intent=getIntent();
        if(intent != null){
            String name =getIntent().getStringExtra(ACTIVITY_TAG);
            if(" ".equals(name) == false && name !=null){
                testHello.setText(name);
           }else{
                testHello.setText("nono");
            }
        }
        //-------------------------------------------------------


        //-------------------------------------------------------
        Bundle bundle =getIntent().getBundleExtra("bundle");
        String msg =bundle.getString("message");
        testHello.setText(msg);
        //-------------------------------------------------------

        Log.d(text2.ACTIVITY_TAG,"HI HI HI");


        //
        //
        //

        Toyata toyata=new Toyata(1);
        BMV bmv=new BMV(2);
for(int i=0;i<2;i++){
    // 建立物件
    // 設定速度
    toyata.setSpeed(i*50);
    // 設定方向
    toyata.setDirection("left");
    toyata.setCarName("Toyata");


    //;
    bmv.setSpeed(i*50);
    bmv.setDirection("left");
    bmv.setCarName("BMV");
}
        Log.d(text2.ACTIVITY_TAG,"this bmv's speed="+bmv.getSpeed());
        Log.d(text2.ACTIVITY_TAG,"this toyata's speed="+toyata.getSpeed());


    }
}
