package com.example.task32;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Stack stack;
    EditText inputText;
    String stringChars;
    Button reverseBtn;
    TextView reverseText;
    String fullChars = "";
    String answer = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stack = new Stack();
        inputText = findViewById(R.id.inputText);
        reverseBtn = findViewById(R.id.reverseBtn);
        reverseText = findViewById(R.id.reverseText);
        reverseBtn.setOnClickListener(v -> {
            stringChars = inputText.getText().toString().trim();
            //reverseText.setText( stringChars);
            for (int i = 0; i < stringChars.length(); i++) {
                if (!stringChars.isEmpty()) {
                    char chars = stringChars.charAt(i);
                    fullChars += chars;
                    // reverseText.setText("" + fullChars);
                    stack.push(chars);
                }
            }
            for (int i = 0; i < stringChars.length(); i++) {
                if (!stack.isEmpty()) {
                    answer += stack.pop();
                    reverseText.setText("" + answer);
                }
            }
        });
    }
}


