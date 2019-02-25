package me.vital.moecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button sum;
    private Button subtract;
    private EditText number_x;
    private EditText number_y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sum = findViewById(R.id.button_sum);
        subtract = findViewById(R.id.button_subtract);

    }
}
