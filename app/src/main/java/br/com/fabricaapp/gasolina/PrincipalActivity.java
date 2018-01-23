package br.com.fabricaapp.gasolina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PrincipalActivity extends AppCompatActivity {

    EditText txtGasolina;
    EditText txtAlcool;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtGasolina = (EditText) findViewById(R.id.txtGasolina);
        txtAlcool = (EditText)findViewById(R.id.txtAlcool);
    }

    public void verificarMelhorOpcao(View view){
        Cotacao c = new Cotacao();
        c.setValorGasolina(Double.parseDouble(txtGasolina.getText().toString()));
        c.setValorAlcool(Double.parseDouble(txtAlcool.getText().toString()));

        Intent it = new Intent(this,CalcularActivity.class);
        it.putExtra("objCotacao",c);
        startActivity(it);

    }
}
