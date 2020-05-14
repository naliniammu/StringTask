package com.example.stringtask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {
    private EditText stringEditText;
    private Integer mStringValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stringEditText = findViewById(R.id.inputEdittext);
        Button addButton = findViewById(R.id.add_button);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mStringValue = Integer.parseInt(stringEditText.getText().toString());
                str_store_fn(mStringValue);
            }
        });
    }

    private void str_store_fn(Integer m_enteredStr) {
        if (m_enteredStr != null) {
            Stack<Integer> stack_store = new Stack<>();
            stack_store.push(m_enteredStr);
            Dup_chk(stack_store);
        }
    }

    private static Stack<Integer> Dup_chk(Stack<Integer> stack_store) {
        Stack<Integer> dup_val_return = new Stack<>();

        int head = stack_store.peek();

        while (!stack_store.isEmpty()) {
            if (stack_store.pop() == head) {
                int bin = stack_store.pop();
            } else {
                dup_val_return.push(stack_store.pop());
            }
        }
        return dup_val_return;
    }
}
