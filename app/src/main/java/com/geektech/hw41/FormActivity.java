package com.geektech.hw41;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {
EditText editTitle;
EditText editDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        editDesc=findViewById(R.id.edit_Desc);
        editTitle=findViewById(R.id.edit_Desc);


    }

    public void onClick(View view) {
        String Desc=editDesc.getText().toString().trim();
        String title=editTitle.getText().toString().trim();

        Intent intent=new Intent();
        intent.putExtra("desc",Desc);
        setResult(RESULT_OK,intent);
        finish();
    }
}
