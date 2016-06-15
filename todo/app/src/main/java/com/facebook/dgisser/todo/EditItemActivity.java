package com.facebook.dgisser.todo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {
    String word;
    EditText editText;
    private final int RESULT_OK = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        EditText editText = (EditText) findViewById(R.id.editText);
        word = getIntent().getStringExtra("word");
        editText.setText(word);
    }

    public void onEdit(View v) {
        EditText editText = (EditText) findViewById(R.id.editText);
        String itemText = editText.getText().toString();
        Intent data = new Intent();
        data.putExtra("response",itemText);
        setResult(RESULT_OK, data);
        finish();
    }

}
