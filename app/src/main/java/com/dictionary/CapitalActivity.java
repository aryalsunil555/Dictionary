package com.dictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CapitalActivity extends AppCompatActivity {

    //private Button btnOpen;
    private TextView tvCapital;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital);
        tvCapital = findViewById(R.id.tvCapital);

        Bundle bundle = getIntent().getExtras();

        if(bundle!=null) {
            String capital = bundle.getString("Capital");
            tvCapital.setText(capital);
        }


        /*btnOpen = findViewById(R.id.btnOpen);
        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CapitalActivity.this, AnotherActivity.class);
                intent.putExtra("myMessage", "This is my message");
                startActivity(intent);
            }
        }); */
    }
}
