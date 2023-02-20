package com.mmm.emi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText  amount,intrest,month;

    TextView texemi,texamount,texintrest;

    Button calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amount = findViewById(R.id.amount);
          intrest = findViewById(R.id.intrest);
          month = findViewById(R.id.month);
          calculator = findViewById(R.id.calculator);
         texemi= findViewById(R.id.texemi);
        texamount = findViewById(R.id.texamount);
       texintrest= findViewById(R.id.texintrest);

          calculator.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

                  int amt = Integer.parseInt(amount.getText().toString());


              }
          });
    }
}