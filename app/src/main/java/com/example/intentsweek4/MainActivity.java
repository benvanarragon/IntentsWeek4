package com.example.intentsweek4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText urlEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        urlEditText = findViewById(R.id.urlEditText);
    }

    public void openDetailActivity(View view) {
        Intent i = new Intent(getApplicationContext(),DetailActivity.class);
        i.putExtra("url",urlEditText.getText().toString());


        startActivity(i);
    }
}
