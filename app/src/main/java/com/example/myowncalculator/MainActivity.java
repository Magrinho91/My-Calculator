package com.example.myowncalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.editText);
        display.setShowSoftInputOnFocus(false);
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getString(R.string.editText).equals(display.getText().toString())) {
                    display.setText("");
                }
            }
        });
    }

    private void updateText(String stringToAdd) {
        String oldString = display.getText().toString();
        int cursorPos = display.getSelectionStart();
        String leftString = oldString.substring(0, cursorPos);
        String rightString = oldString.substring(cursorPos);
        if (getString(R.string.editText).equals(display.getText().toString())) {
            display.setText(stringToAdd);
            display.setSelection(cursorPos + 1);
        } else {
            display.setText(String.format("%s%s%s", leftString, stringToAdd, rightString));
            display.setSelection(cursorPos + 1);
        }
    }

    public void zeroBtn(View view) {
        updateText("0");
    }

    public void oneBtn(View view) {
        updateText("1");
    }

    public void twoBtn(View view) {
        updateText("2");
    }

    public void threeBtn(View view) {
        updateText("3");
    }

    public void fourBtn(View view) {
        updateText("4");
    }

    public void fiveBtn(View view) {
        updateText("5");
    }

    public void sixBtn(View view) {
        updateText("6");
    }

    public void sevenBtn(View view) {
        updateText("7");
    }

    public void eightBtn(View view) {
        updateText("8");
    }

    public void nineBtn(View view) {
        updateText("9");
    }

    public void divideBtn(View view) {
        updateText("÷");
    }

    public void plusBtn(View view) {
        updateText("+");
    }

    public void minusBtn(View view) {
        updateText("-");
    }

    public void multiplyBtn(View view) {
        updateText("×");
    }

    public void exponentBtn(View view) {
        updateText("^");
    }

    public void backspaceBtn(View view) {

    }
    public void percentBtn(View view) {
        updateText("%");
    }
    public void clearBtn(View view) {
        display.setText("");
    }
    public void pointBtn(View view) {
        updateText(".");
    }
    public void equalBtn(View view) {

    }
    public void parenthesesBtn(View view){

    }

}