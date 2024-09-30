package cz.spseiostrava.han.kalkulacka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1, number2;
    Button button;
    TextView vylsedek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        button = findViewById(R.id.button);
        vylsedek = findViewById(R.id.vysledek);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!number1.getText().toString().equals("") && !number2.getText().toString().equals(""))
                    vylsedek.setText((Double.parseDouble(number1.getText().toString()) +  Double.parseDouble(number2.getText().toString())) + "");
            }
        });

    }
}