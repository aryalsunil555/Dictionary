package com.dictionary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        TextView tvText = findViewById(R.id.tvText);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null) {
            String message = bundle.getString("myMessage");
            tvText.setText(message);
        }
        else
        {
            Toast.makeText(this,"No message", Toast.LENGTH_LONG).show();
        }
    }
}
