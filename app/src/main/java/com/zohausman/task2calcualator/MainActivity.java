package com.zohausman.task2calcualator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
  Button buttonAdd, buttonSub, buttonMul, buttonDiv;
  EditText editTextN1,editTextN2;
  TextView textView;
  int num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonAdd = findViewById(R.id.btn_add);
        buttonSub = findViewById(R.id.btn_subtraction);
        buttonMul = findViewById(R.id.btn_mul);
        buttonDiv = findViewById(R.id.btn_division);
        editTextN1 = findViewById(R.id.number1);
        editTextN2 = findViewById(R.id.number2);
        textView = findViewById(R.id.answer);

      buttonAdd.setOnClickListener(this);
      buttonSub.setOnClickListener(this);
      buttonMul.setOnClickListener(this);
      buttonDiv.setOnClickListener(this);

    }
//    function
    public int getIntegerText(EditText editText){
        //        get the values from editText

      //         if edittext is empty
        if (editText.getText().toString().equals("")){
            Toast.makeText(this, "Enter Number", Toast.LENGTH_SHORT).show();
            return 0;
        }else
        return Integer.parseInt(editText.getText().toString());

    }

    @Override
    public void onClick(View view) {
//        num1 and num2 calling that function
        num1 = getIntegerText(editTextN1);
        num2 = getIntegerText(editTextN2);

        switch (view.getId()){
            case R.id.btn_add:
                textView.setText("Answer= " + (num1 +num2));
                break;

            case R.id.btn_subtraction:
                textView.setText("Answer= " + (num1 - num2));
                break;

            case R.id.btn_mul:
                textView.setText("Answer= " + (num1 * num2));
                break;

            case R.id.btn_division:
                textView.setText("Answer= " + ( (float)num1 / (float) num2));
                break;
        }

    }
}