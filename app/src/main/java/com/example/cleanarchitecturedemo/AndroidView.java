package com.example.cleanarchitecturedemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AndroidView extends AppCompatActivity {

     Model model = new Model();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView outputView = (TextView) findViewById(R.id.outputView);
        outputView.setText(model.getData());

        EditText inputText = (EditText) findViewById(R.id.inputText);
        inputText.setText(model.getData());
    }

    public void enterInput(View view) {
        TextView outputView = (TextView) findViewById(R.id.outputView);
        EditText inputText = (EditText) findViewById(R.id.inputText);

        String input = inputText.getText().toString();
        model.setData(input);
        outputView.setText(input);
    }
}