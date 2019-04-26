package com.dictionary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class AddWordActivity extends AppCompatActivity {
    EditText etCountry, etCapital;
    Button btnAddCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_word);

        etCountry = findViewById(R.id.etCountry);
        etCapital = findViewById(R.id.etCapital);
        btnAddCountry = findViewById(R.id.btnAddCountry);

        btnAddCountry.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Save();

            }
        });
    }


    private void Save() {
        try {
            PrintStream printStream = new PrintStream(openFileOutput("words.txt", MODE_PRIVATE | MODE_APPEND));
            printStream.println(etCountry.getText().toString() + "->" + etCapital.getText().toString());

            Toast.makeText(this, "Saved to" + getFilesDir(), Toast.LENGTH_SHORT).show();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}