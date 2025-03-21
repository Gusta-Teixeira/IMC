package com.ifsc.imc;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MsgActivity extends AppCompatActivity {
    EditText edPeso, edAltura;
    TextView tvIMC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_msg);
        edPeso = findViewById(R.id.edPeso);
        edAltura = findViewById(R.id.edAltura);
        tvIMC = findViewById(R.id.tvIMC);

        Bundle bundle = getIntent().getExtras();
        edPeso.setText(bundle.getString("Peso") + "Kg");
        edAltura.setText(bundle.getString("Altura") + "M");
        tvIMC.setText(bundle.getString("IMC"));
    }
}