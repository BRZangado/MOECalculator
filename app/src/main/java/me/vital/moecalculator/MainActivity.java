package me.vital.moecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import me.vital.commons.MoeCalculator;

public class MainActivity extends AppCompatActivity {

    private Button sum;
    private Button subtract;
    private EditText number_x;
    private EditText number_y;
    private TextView result_field;
    private MoeCalculator calculator;
    private boolean isSumClicked;
    private boolean isSubClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sum = findViewById(R.id.button_sum);
        subtract = findViewById(R.id.button_subtract);
        number_x = findViewById(R.id.number1_input);
        number_y = findViewById(R.id.number2_input);
        result_field = findViewById(R.id.result_field);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtract.setBackgroundResource(R.drawable.roundedbuttonoff);
                sum.setBackgroundResource(R.drawable.roundedbutton);
                String x = number_x.getText().toString();
                String y = number_y.getText().toString();
                calculator = new MoeCalculator(x,y);
                calculator.sum_();
                result_field.setText(calculator.get_result());
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum.setBackgroundResource(R.drawable.roundedbuttonoff);
                subtract.setBackgroundResource(R.drawable.roundedbutton);
                String x = number_x.getText().toString();
                String y = number_y.getText().toString();
                calculator = new MoeCalculator(x,y);
                calculator.subtract();
                result_field.setText(calculator.get_result());
            }
        });

    }
}
