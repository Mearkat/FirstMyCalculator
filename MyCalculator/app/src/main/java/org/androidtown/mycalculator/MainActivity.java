package org.androidtown.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView ;
    String value = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
    }

    public void btn_0(View v){
        value += "0";
        textView.setText(String.valueOf(value));
    }
    public void btn_1(View v){
        value += "1";
        textView.setText(String.valueOf(value));
    }
    public void btn_2(View v){
        value += "2";
        textView.setText(String.valueOf(value));
    }
    public void btn_3(View v){
        value += "3";
        textView.setText(String.valueOf(value));
    }
    public void btn_4(View v){
        value += "4";
        textView.setText(String.valueOf(value));
    }
    public void btn_5(View v){
        value += "5";
        textView.setText(String.valueOf(value));
    }
    public void btn_6(View v) {
        value += "6";
        textView.setText(String.valueOf(value));
    }
    public void btn_7(View v){
        value += "7";
        textView.setText(String.valueOf(value));
    }
    public void btn_8(View v){
        value += "8";
        textView.setText(String.valueOf(value));
    }
    public void btn_9(View v){
        value += "9";
        textView.setText(String.valueOf(value));
    }
    public void btn_ans(View v){

    }
    public void btn_x(View v){

    }
    public void btn_div(View v){

    }
    public void btn_plu(View v){

    }
    public void btn_min(View v){

    }
    public void btn_ac(View v){

    }
    public void btn_dot(View v){

    }
    public void btn_per(View v){

    }
    public void btn_cha(View v){

    }

}
