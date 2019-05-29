package com.example.intentsweek4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //variable declaration
    TextView urlTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        //instantiation
        urlTextView = findViewById(R.id.urlTextView);

        //option 1
        Bundle extras = getIntent().getExtras();
        String url = extras.getString("url");

        //option 2
        String url2 = getIntent().getStringExtra("url");

        urlTextView.setText(url2);


    }

    public void visitUrl(View view) {
        String url = urlTextView.getText().toString();
        Intent myImplicitIntent = new Intent(Intent.ACTION_VIEW);
        myImplicitIntent.setData(Uri.parse(url));
        startActivity(myImplicitIntent);
    }
}
