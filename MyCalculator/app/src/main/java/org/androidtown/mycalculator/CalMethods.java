package org.androidtown.mycalculator;
import android.util.Log;
import android.widget.Toast;

import java.security.spec.ECField;

/**
 * Created by User on 2015-12-26.
 */
public class CalMethods {
    String VAL = "Num";
    String[] data_sub = new String[100];
    String[] data_cal = new String[100];
    int k = 0;
    double result = 0;
    public double answerData(String string) {

        char[] step = string.toCharArray();

            for(int k = 0; k < 100 ; k++){
                data_sub[k] = "";
                data_cal[k] = "";
            }

            for (int i = 0; i < step.length; i++) {

                if (step[i] == '0') {

                    Log.d(VAL, "0입력 ㅇㅋ");
                    data_sub[k] += "0";

                } else if (step[i] == '1') {

                    Log.d(VAL, "1입력 ㅇㅋ");
                    data_sub[k] += "1";

                } else if (step[i] == '2') {

                    Log.d(VAL, "2입력 ㅇㅋ");
                    data_sub[k] += "2";

                } else if (step[i] == '3') {

                    Log.d(VAL, "3입력 ㅇㅋ");
                    data_sub[k] += "3";

                } else if (step[i] == '4') {

                    Log.d(VAL, "4입력 ㅇㅋ");
                    data_sub[k] += "4";

                } else if (step[i] == '5') {

                    Log.d(VAL, "5입력 ㅇㅋ");
                    data_sub[k] += "5";

                } else if (step[i] == '6') {

                    Log.d(VAL, "6입력 ㅇㅋ");
                    data_sub[k] += "6";

                } else if (step[i] == '7') {

                    Log.d(VAL, "7입력 ㅇㅋ");
                    data_sub[k] += "7";

                } else if (step[i] == '8') {

                    Log.d(VAL, "8입력 ㅇㅋ");
                    data_sub[k] += "8";

                } else if (step[i] == '9') {

                    Log.d(VAL, "9입력 ㅇㅋ");
                    data_sub[k] += "9";

                } else if (step[i] == '.') {

                    Log.d(VAL, ".입력 ㅇㅋ");
                    data_sub[k] += ".";

                }else if (step[i] == '+') {

                    Log.d(VAL, "+입력 ㅇㅋ");
                    data_cal[k] = "+";
                    k++;
                }else if (step[i] == 'X') {

                    Log.d(VAL, "x 입력 ㅇㅋ");
                    data_cal[k] = "X";
                    k++;
                }else if (step[i] == '/') {

                    Log.d(VAL, "/ 입력 ㅇㅋ");
                    data_cal[k] = "/";
                    k++;
                }else if (step[i] == '-') {

                    Log.d(VAL, "- 입력 ㅇㅋ");
                    data_cal[k] = "-";
                    k++;
                }else if (step[i] == 'm') {

                    Log.d(VAL, "m 입력 ㅇㅋ");
                    data_sub[k] += "m";

                }
            }

        for(int p = 0; p < data_sub.length ; p++){
            Log.d(VAL, "test  "+data_sub[p]);
            char[] formin = data_sub[p].toCharArray();
            String k = "";
            double t=0 ;
            try{
                if(formin[0] == 'm') {
                    for (int i = 1; i < data_sub[p].length(); i++) {
                        k += formin[i];
                        //Log.d(VAL, "테스트값"+ k);
                    }
                    //Log.d(VAL, "테스트값"+k);
                    t = Double.parseDouble(k) * (-1);
                    //Log.d(VAL, "테스트값"+t);
                    data_sub[p] = "" + t;
                    //Log.d(VAL, "테스트값"+data_sub[p]);
                }
            }catch(Exception e){

            }
        }

        for(int p = 0; p < data_sub.length ; p++){
            Log.d(VAL, data_sub[p]);
        }
        //Log.d(VAL, data_sub[0]);

        result = Double.parseDouble(data_sub[0]);
        for(int j = 0; j < k ; j++) {
            if (data_cal[j] == "+") {
                Log.d(VAL, "+ 계산 전 " + result);
                result = result + Double.parseDouble(data_sub[j + 1]) ;
                Log.d(VAL, "+ 계산 후 " + result);
            }else if (data_cal[j] == "X") {
                Log.d(VAL, "x 계산 전 " + result);
                result = result * Double.parseDouble(data_sub[j + 1]) ;
                Log.d(VAL, "x 계산 후 " + result);
            }else if (data_cal[j] == "-") {
                Log.d(VAL, "- 계산 전 " + result);
                result = result - Double.parseDouble(data_sub[j + 1]) ;
                Log.d(VAL, "- 계산 후 " + result);
            }else if (data_cal[j] == "/") {
                Log.d(VAL, "/ 계산 전 " + result);
                result = result / Double.parseDouble(data_sub[j + 1]) ;
                Log.d(VAL, "/ 계산 후 " + result);
            }
        }
        return result;
    }
  /*  public void resetCal(){
        result = 0;
        for(int k = 0; k < 100 ; k++){
            data_sub[k] = "";
            data_cal[k] = "";
        }
    }*/
}
