package ru.mkedonsky.myweather;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
        private TextInputEditText editText;
        private Button startSecondActivityBtn, openUrlBtn;
        static final String DATA_KEY = "data_key";


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            initViews();
            setOnStartSecondActivityBtnClick();

        }

        private void initViews() {
            editText = findViewById(R.id.textInputEditText);
            startSecondActivityBtn = findViewById(R.id.button);
        }

        private void setOnStartSecondActivityBtnClick() {
            startSecondActivityBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra(DATA_KEY, editText.getText().toString());
                    startActivity(intent);
                }
            });
        }
    }
