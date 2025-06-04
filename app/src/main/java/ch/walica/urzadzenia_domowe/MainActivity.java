package ch.walica.urzadzenia_domowe;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText etNumber;
    Button btnConfirm, btnOnOff;
    TextView tvResult1, tvResult2, tvStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber = findViewById(R.id.etNumber);
        btnConfirm = findViewById(R.id.btnConfirm);
        btnOnOff = findViewById(R.id.btnOnOff);
        tvResult1 = findViewById(R.id.tvResult1);
        tvResult2 = findViewById(R.id.tvResult2);
        tvStatus = findViewById(R.id.tvStatus);

        btnConfirm.setOnClickListener(v -> {
            String number = etNumber.getText().toString().trim();
            if(!number.isEmpty() && Integer.parseInt(number) >= 1 && Integer.parseInt(number) <= 12) {
            tvResult1.setText("Number prania: " + number);
            }
        });

        btnOnOff.setOnClickListener(v -> {
            if(btnOnOff.getText() == "Włącz") {
                btnOnOff.setText("Wyłącz");
                tvResult2.setText("Odkurzacz włączony");
            } else {
                btnOnOff.setText("Włącz");
                tvResult2.setText("Odkurzacz wyłączony");
            }
        });

    }
}