package cz.spseiostrava.han.kalkulacka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText number1, number2;
    Button buttonSoucet, buttonRozdil, buttonSoucin, buttonPodil;
    TextView vylsedek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        vylsedek = findViewById(R.id.vysledek);
        buttonSoucet = findViewById(R.id.buttonSoucet);
        buttonRozdil = findViewById(R.id.buttonRozdil);
        buttonPodil = findViewById(R.id.buttonPodil);
        buttonSoucin = findViewById(R.id.buttonSoucin);

        View.OnClickListener tlacitkaListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int btnId = view.getId();
                double cislo1, cislo2, vysledekPom;

                if(!number1.getText().toString().equals("") && !number2.getText().toString().equals("")){
                    cislo1 = Double.parseDouble(number1.getText().toString());
                    cislo2 = Double.parseDouble(number2.getText().toString());

                    if(btnId == R.id.buttonSoucet){
                        vysledekPom = cislo1 + cislo2;
                    } else if (btnId == R.id.buttonRozdil) {
                        vysledekPom = cislo1 - cislo2;
                    } else if (btnId == R.id.buttonSoucin) {
                        vysledekPom = cislo1 * cislo2;
                    }else{
                        vysledekPom = cislo1 / cislo2;
                    }

                    vylsedek.setText(String.valueOf(vysledekPom));
                }else{
                    Toast.makeText(getApplicationContext() , "Zadej 2 hodnoty", Toast.LENGTH_SHORT).show();
                }
            }
        };

        buttonSoucet.setOnClickListener(tlacitkaListener);
        buttonRozdil.setOnClickListener(tlacitkaListener);
        buttonSoucin.setOnClickListener(tlacitkaListener);
        buttonPodil.setOnClickListener(tlacitkaListener);


    }
}