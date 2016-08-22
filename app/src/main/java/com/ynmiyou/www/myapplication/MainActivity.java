package com.ynmiyou.www.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToastPopularMovie(View view) {

        switch (view.getId()){
            case R.id.button:
                // TODO SOMETHING
                show(R.string.btn1_toast_msg);
                break;
            case R.id.button2:
                // TODO SOMETHING
                show(R.string.btn2_toast_msg);
                break;
            case R.id.button3:
                // TODO SOMETHING
                show(R.string.btn3_toast_msg);
                break;
            case R.id.button4:
                // TODO SOMETHING
                show(R.string.btn4_toast_msg);
                break;
            case R.id.button5:
                // TODO SOMETHING
                show(R.string.btn5_toast_msg);
                break;
            case R.id.button6:
                // TODO SOMETHING
                show(R.string.btn6_toast_msg);
                break;
        }

    }

    private void show(int resId){
        Toast toast = Toast.makeText(getApplicationContext(), resId, Toast.LENGTH_SHORT);
        toast.show();
    }
}
