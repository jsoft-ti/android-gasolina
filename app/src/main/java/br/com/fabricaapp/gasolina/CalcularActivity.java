package br.com.fabricaapp.gasolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CalcularActivity extends AppCompatActivity {

    private Cotacao cotacao;
    TextView txtMensagem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular);
        Bundle bundle = getIntent().getExtras();
        txtMensagem = (TextView) findViewById(R.id.txtMensagem);

        if(bundle.get("objCotacao")!= null)
        {
            cotacao = (Cotacao) bundle.get("objCotacao");
            if(cotacao.getValorAlcool()/cotacao.getValorGasolina() < 0.7){
                txtMensagem.setText("Escolha o Alcool");
            }else{
                txtMensagem.setText("Escolha gasolina");
        }
                    //TODO here get the string stored in the string variable and do
            // setText() on userName
        }
    }
}
