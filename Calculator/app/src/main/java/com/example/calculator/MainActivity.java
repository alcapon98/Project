package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_show_first_num, tv_show_operation, tv_show_second, tv_show_result;
    Button btn_clear, btn_backspace, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0,
            btn_multi, btn_division, btn_plus, btn_minus, btn_result;
    static String left_number = "";
    static String right_number = "";
    static String opertion = "";
    static int counter = 0;
    static int counter_2 = 0;
    static int result = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findviews();

    }

    private void findviews() {

        tv_show_first_num = findViewById(R.id.tv_show_first_num);
        tv_show_operation = findViewById(R.id.tv_show_operation);
        tv_show_second = findViewById(R.id.tv_show_second);
        tv_show_result = findViewById(R.id.tv_show_result);
        btn_clear = findViewById(R.id.btn_clear);
        btn_backspace = findViewById(R.id.btn_backspace);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_0 = findViewById(R.id.btn_0);
        btn_multi = findViewById(R.id.btn_multi);
        btn_division = findViewById(R.id.btn_division);
        btn_plus = findViewById(R.id.btn_plus);
        btn_minus = findViewById(R.id.btn_minus);
        btn_result = findViewById(R.id.btn_result);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_0:
                if (tv_show_operation.getText().toString() != "") {
                    if (right_number == "" && counter_2 < 5) {
                    } else if (counter_2 < 5) {
                        right_number = right_number + "0";
                        counter_2++;
                        tv_show_second.setText(right_number);

                    }
                    break;
                } else {

                    if (left_number == "" && counter < 5) {

                    } else if (counter < 5) {
                        left_number = left_number + "0";
                        counter++;
                        tv_show_first_num.setText(left_number);
                    }
                    break;
                }

            case R.id.btn_1:
                if (tv_show_operation.getText().toString() != "") {


                    if (right_number == "" && counter_2 < 5) {
                        right_number = "1";
                        counter_2++;
                        tv_show_second.setText(right_number);
                    } else if (counter_2 < 5) {
                        right_number = right_number + "1";
                        counter_2++;
                        tv_show_second.setText(right_number);

                    }
                    break;
                } else {

                    if (left_number == "" && counter < 5) {
                        left_number = "1";
                        counter++;
                        tv_show_first_num.setText(left_number);

                    } else if (counter < 5) {
                        left_number = left_number + "1";
                        counter++;
                        tv_show_first_num.setText(left_number);
                    }
                    break;
                }

            case R.id.btn_2:
                if (tv_show_operation.getText().toString() != "") {


                    if (right_number == "" && counter_2 < 5) {
                        right_number = "2";
                        counter_2++;
                        tv_show_second.setText(right_number);
                    } else if (counter_2 < 5) {
                        right_number = right_number + "2";
                        counter_2++;
                        tv_show_second.setText(right_number);

                    }
                    break;
                } else {

                    if (left_number == "" && counter < 5) {
                        left_number = "2";
                        counter++;
                        tv_show_first_num.setText(left_number);

                    } else if (counter < 5) {
                        left_number = left_number + "2";
                        counter++;
                        tv_show_first_num.setText(left_number);
                    }
                    break;
                }


            case R.id.btn_3:
                if (tv_show_operation.getText().toString() != "") {


                    if (right_number == "" && counter_2 < 5) {
                        right_number = "3";
                        counter_2++;
                        tv_show_second.setText(right_number);
                    } else if (counter_2 < 5) {
                        right_number = right_number + "3";
                        counter_2++;
                        tv_show_second.setText(right_number);

                    }
                    break;
                } else {

                    if (left_number == "" && counter < 5) {
                        left_number = "3";
                        counter++;
                        tv_show_first_num.setText(left_number);

                    } else if (counter < 5) {
                        left_number = left_number + "3";
                        counter++;
                        tv_show_first_num.setText(left_number);
                    }
                    break;
                }

            case R.id.btn_4:
                if (tv_show_operation.getText().toString() != "") {


                    if (right_number == "" && counter_2 < 5) {
                        right_number = "4";
                        counter_2++;
                        tv_show_second.setText(right_number);
                    } else if (counter_2 < 5) {
                        right_number = right_number + "4";
                        counter_2++;
                        tv_show_second.setText(right_number);

                    }
                    break;
                } else {

                    if (left_number == "" && counter < 5) {
                        left_number = "4";
                        counter++;
                        tv_show_first_num.setText(left_number);

                    } else if (counter < 5) {
                        left_number = left_number + "4";
                        counter++;
                        tv_show_first_num.setText(left_number);
                    }
                    break;
                }

            case R.id.btn_5:
                if (tv_show_operation.getText().toString() != "") {


                    if (right_number == "" && counter_2 < 5) {
                        right_number = "5";
                        counter_2++;
                        tv_show_second.setText(right_number);
                    } else if (counter_2 < 5) {
                        right_number = right_number + "5";
                        counter_2++;
                        tv_show_second.setText(right_number);

                    }
                    break;
                } else {

                    if (left_number == "" && counter < 5) {
                        left_number = "5";
                        counter++;
                        tv_show_first_num.setText(left_number);

                    } else if (counter < 5) {
                        left_number = left_number + "5";
                        counter++;
                        tv_show_first_num.setText(left_number);
                    }
                    break;
                }

            case R.id.btn_6:
                if (tv_show_operation.getText().toString() != "") {


                    if (right_number == "" && counter_2 < 5) {
                        right_number = "6";
                        counter_2++;
                        tv_show_second.setText(right_number);
                    } else if (counter_2 < 5) {
                        right_number = right_number + "6";
                        counter_2++;
                        tv_show_second.setText(right_number);

                    }
                    break;
                } else {

                    if (left_number == "" && counter < 5) {
                        left_number = "6";
                        counter++;
                        tv_show_first_num.setText(left_number);

                    } else if (counter < 5) {
                        left_number = left_number + "6";
                        counter++;
                        tv_show_first_num.setText(left_number);
                    }
                    break;
                }

            case R.id.btn_7:
                if (tv_show_operation.getText().toString() != "") {


                    if (right_number == "" && counter_2 < 5) {
                        right_number = "7";
                        counter_2++;
                        tv_show_second.setText(right_number);
                    } else if (counter_2 < 5) {
                        right_number = right_number + "7";
                        counter_2++;
                        tv_show_second.setText(right_number);

                    }
                    break;
                } else {

                    if (left_number == "" && counter < 5) {
                        left_number = "7";
                        counter++;
                        tv_show_first_num.setText(left_number);

                    } else if (counter < 5) {
                        left_number = left_number + "7";
                        counter++;
                        tv_show_first_num.setText(left_number);
                    }
                    break;
                }

            case R.id.btn_8:
                if (tv_show_operation.getText().toString() != "") {


                    if (right_number == "" && counter_2 < 5) {
                        right_number = "8";
                        counter_2++;
                        tv_show_second.setText(right_number);
                    } else if (counter_2 < 5) {
                        right_number = right_number + "8";
                        counter_2++;
                        tv_show_second.setText(right_number);

                    }
                    break;
                } else {

                    if (left_number == "" && counter < 5) {
                        left_number = "8";
                        counter++;
                        tv_show_first_num.setText(left_number);

                    } else if (counter < 5) {
                        left_number = left_number + "8";
                        counter++;
                        tv_show_first_num.setText(left_number);
                    }
                    break;
                }

            case R.id.btn_9:
                if (tv_show_operation.getText().toString() != "") {


                    if (right_number == "" && counter_2 < 5) {
                        right_number = "9";
                        counter_2++;
                        tv_show_second.setText(right_number);
                    } else if (counter_2 < 5) {
                        right_number = right_number + "9";
                        counter_2++;
                        tv_show_second.setText(right_number);

                    }
                    break;
                } else {

                    if (left_number == "" && counter < 5) {
                        left_number = "9";
                        counter++;
                        tv_show_first_num.setText(left_number);

                    } else if (counter < 5) {
                        left_number = left_number + "9";
                        counter++;
                        tv_show_first_num.setText(left_number);
                    }
                    break;
                }


            default:
                break;


        }


    }

    public void clear(View view) {
        left_number = "";
        right_number = "";
        tv_show_second.setText(right_number);
        tv_show_first_num.setText(left_number);
        counter = 0;
        counter_2 = 0;
        tv_show_operation.setText("");
        tv_show_result.setText("");
        result=0;
    }

    public void plus(View view) {

        if (left_number.equals("")) {

        } else {
            opertion = "+";
            tv_show_operation.setText(opertion);
        }

    }

    public void minus(View view) {

        if (left_number.equals("")) {

        } else {
            opertion = "-";
            tv_show_operation.setText(opertion);
        }
    }

    public void division(View view) {
        if (left_number.equals("")) {

        } else {
            opertion = "÷";
            tv_show_operation.setText(opertion);
        }
    }

    public void multi(View view) {
        if (left_number.equals("")) {

        } else {
            opertion = "×";
            tv_show_operation.setText(opertion);
        }
    }

    public void backspace(View view) {


        if (tv_show_operation.getText().toString() != "") {
            // right side statement
            if (right_number.length() > 0) {
                right_number = right_number.substring(0, right_number.length() - 1);
                tv_show_second.setText(right_number);
                counter_2--;
            }
        } else {
            // left side statement
            if (left_number.length() > 0) {
                left_number = left_number.substring(0, left_number.length() - 1);
                tv_show_first_num.setText(left_number);
                counter--;
            }
        }


    }

    public void result(View view) {
        switch (opertion) {
            case "+":
                result = Integer.parseInt(left_number)+Integer.parseInt(right_number);
                tv_show_result.setText(String.valueOf(result));
                break;
            case "-":
                result= Integer.parseInt(left_number)-Integer.parseInt(right_number);
                tv_show_result.setText(String.valueOf(result));

                break;
            case "×":
                result=Integer.parseInt(left_number)*Integer.parseInt(right_number);
                tv_show_result.setText(String.valueOf(result));

                break;
            case "÷":
                result=Integer.parseInt(left_number)/Integer.parseInt(right_number);
                tv_show_result.setText(String.valueOf(result));

                break;
            default:
                break;
        }
    }

}