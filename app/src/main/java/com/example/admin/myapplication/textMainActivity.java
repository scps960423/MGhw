package com.example.admin.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class textMainActivity extends Activity {

    private Button butTest;

    private EditText editTest;

    //key
    private static final String ACTIVITY_TAG="happyert";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_main);

        butTest=(Button)findViewById(R.id.button);
        butTest.setOnClickListener(test);
        editTest=(EditText)findViewById(R.id.editText);

    };

    private Button.OnClickListener test =new Button.OnClickListener(){

        //當按下按鈕會把輸入框裡面的字串傳送到text2這個Activity裡面

        @Override
        public void onClick(View v) {

            Intent intent=new Intent();

            Bundle bundle=new Bundle();
            bundle.putString("message",editTest.getText().toString());
            intent.putExtra("bundle",bundle);

            intent.setClass(textMainActivity.this,text2.class);
            startActivityForResult(intent,0);
            Log.d(ACTIVITY_TAG,"OAO");

        }
    };


    //接受text2回傳的資料
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

//        Bundle extra=data.getExtras();
//        String aaa=extra.getString("ACTIVITY_TAG");
//        Toast.makeText(this,"extra="+aaa,Toast.LENGTH_SHORT).show();

        if (requestCode == 0 && resultCode == Activity.RESULT_OK) {
            Bundle extra=data.getExtras();
            String aaa=extra.getString("ACTIVITY_TAG");
            Toast.makeText(this,"extra="+aaa,Toast.LENGTH_SHORT).show();
        }

        Log.d(ACTIVITY_TAG,"onActivityResult");
    }

}

