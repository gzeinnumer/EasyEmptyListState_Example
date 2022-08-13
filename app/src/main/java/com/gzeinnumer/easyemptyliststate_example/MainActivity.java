package com.gzeinnumer.easyemptyliststate_example;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.gzeinnumer.easyemptyliststate_example.ui.nested.NestedActivity;
import com.gzeinnumer.easyemptyliststate_example.ui.noNested.NoNestedActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_nested).setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), NestedActivity.class));
        });
        findViewById(R.id.btn_no_nested).setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), NoNestedActivity.class));
        });
    }
}