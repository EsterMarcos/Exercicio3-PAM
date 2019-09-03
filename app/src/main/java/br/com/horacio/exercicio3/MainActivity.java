package br.com.horacio.exercicio3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        EditText txtChopp;
        EditText txtPizza;
        EditText txtRecheio;
        EditText txtPessoas;
        TextView txtConsumo;
        TextView txtServicos;
        TextView txtTotal;
        TextView txtpPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtChopp= findViewById(R.id.txtChopp);
        txtPizza=findViewById(R.id.txtPizza);
        txtRecheio=findViewById(R.id.txtRecheio);
        txtPessoas=findViewById(R.id.txtPessoas);
        txtConsumo=findViewById(R.id.txtConsumo);
        txtServicos=findViewById(R.id.txtServicos);
        txtTotal=findViewById(R.id.txtTotal);
        txtpPessoa=findViewById(R.id.txtppessoa);

    }public void onCalcular(View v){
        double qtdechopp =Double.parseDouble(txtChopp.getText().toString());
        double qtdpizza =Double.parseDouble(txtPizza.getText().toString());
        double qtdrecheio=Integer.parseInt(txtRecheio.getText().toString());

        int ppessoa=Integer.parseInt(txtPessoas.getText().toString());

        double cons =(qtdechopp * 7.3) +(qtdpizza * 31.5) + (qtdrecheio * 5.9);
        double serv = cons/10;
        double tot = cons+ serv;
        double pess = tot /ppessoa;

        txtConsumo.setText(String.format("%.2f",cons));
        txtServicos.setText(String.valueOf(serv));
        txtTotal.setText(String.valueOf(tot));
        txtpPessoa.setText(String.valueOf(pess));

    }

}
