package org.androidtown.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView ;
    String value = "";
    String[] data = new String[20];
    String setvalue ="";
    double answerbefore = 0;
    String answer = "";

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
        try{
            CalMethods cal = new CalMethods();
            answerbefore = cal.answerData(value);
            answer += answerbefore;
            textView.setText(String.valueOf(answer));
            value = "";
            answer="";

        }catch(Exception e){
            Toast.makeText(getApplicationContext(), "오류가 발생했습니다. 입력 방식을 바꿔 주시던지 다시 나갔다 들어와주세요" , Toast.LENGTH_LONG).show();
        }
    }
    public void btn_x(View v){
        value += "X";
        textView.setText(String.valueOf(value));
    }
    public void btn_div(View v){
        value += "/";
        textView.setText(String.valueOf(value));
    }
    public void btn_plu(View v){

        value += "+";
        textView.setText(String.valueOf(value));
    }
    public void btn_min(View v){
        value += "-";
        textView.setText(String.valueOf(value));
    }
    public void btn_ac(View v){
        value="";
        textView.setText(String.valueOf(value));
    }
    public void btn_dot(View v){
        value+=".";
        textView.setText(String.valueOf(value));
    }
    public void btn_per(View v){
        try {
            double k;
            k = Double.parseDouble(value) / 100;
            String t = "";
            t = t + k + " %";
            textView.setText(String.valueOf(t));
        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "%는 값을 입력한 수에 한번만 가능합니다." ,Toast.LENGTH_LONG).show();
        }
    }
    public void btn_cha(View v){
        value += "m";
        textView.setText(String.valueOf(value));
    }
}
