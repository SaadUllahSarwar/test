package com.example.tl.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    private EditText fn;
    private EditText eMail;
    private EditText pas;
    private EditText cpas;
    private RadioButton R1;
    private RadioButton R2;
    private Button Butt;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fn=(EditText)findViewById(R.id.userName);
        eMail=(EditText)findViewById(R.id.Email);
        pas=(EditText)findViewById(R.id.pascode);
        cpas=(EditText)findViewById(R.id.confirmation);
        Butt = (Button)findViewById(R.id.butn);



        Butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String First_name = fn.getText().toString();
                Log.i("Saad",First_name);

                String mail = eMail.getText().toString();
                Log.i("xyz", mail);

                String pswrd = pas.getText().toString();
                Log.i("*****", pswrd);

                String conPas = cpas.getText().toString();
                Log.i("*****", conPas);

            }
        });




    }
}



