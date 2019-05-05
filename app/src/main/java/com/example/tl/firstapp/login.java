package com.example.tl.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {
    private EditText eMail;
    private EditText pas;
    private Button butn ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        eMail = (EditText)findViewById(R.id.myEmail);
        pas = (EditText)findViewById(R.id.pascode);
        butn = (Button) findViewById(R.id.buton);

        butn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Log_in = eMail.getText().toString();
                Log.i("xyz.abc",Log_in);

                String psword = pas.getText().toString();
                Log.i("******", psword);
            }
        });
    }
}
