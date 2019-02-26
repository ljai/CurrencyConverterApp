package com.jailalwani.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view) {
        EditText dollaramountEditText = (EditText) findViewById(R.id.dollaramountEditText);
        Double dollaramountDouble = Double.parseDouble(dollaramountEditText.getText().toString());
        Double rupeeAmount = dollaramountDouble*65;
        Toast.makeText(MainActivity.this,"Rs "+String.format("%.2f",rupeeAmount),Toast.LENGTH_SHORT).show();

        Log.i("Amount" , dollaramountEditText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
