package com.example.listview;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class DetailView extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_view);
        textView = findViewById(R.id.textView);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        textView.setText(getIntent().getStringExtra("Item"));
    }
}