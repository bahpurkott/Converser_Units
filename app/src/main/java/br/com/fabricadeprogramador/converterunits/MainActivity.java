package br.com.fabricadeprogramador.converterunits;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @Bind(R.id.edt_text)
    EditText editText;

    @OnClick(R.id.metros)
    public void calcParaMetros(){

        //Conversão do valor digitado para string
        Double metros = Double.parseDouble(editText.getText().toString());

       chamaResultado(metros);




    }

    @OnClick(R.id.km)
    public void calcParaKm(){

        //Conversão do valor digitado para string
        Double km = Double.parseDouble(editText.getText().toString());

        //Transformar km em metros
        Double metros  = km * 1000;

        chamaResultado(metros);

    }

    @OnClick(R.id.milhasnaut)
    public void calcParaNaut(){

        //Conversão do valor digitado para string
        Double milhasnaut = Double.parseDouble(editText.getText().toString());

        //Transformar milhasnauticas em metros
        Double metros  = milhasnaut * 1852;

        chamaResultado(metros);

    }

    @OnClick(R.id.milhasterres)
    public void calcParaTerres(){

        //Conversão do valor digitado para string
        Double milhasterres = Double.parseDouble(editText.getText().toString());

        //Transformar milhasnauticas em metros
        Double metros  = milhasterres * 1609.3;

        chamaResultado(metros);

    }

    public void chamaResultado (Double metros){

        //Declaração de variáveis para conversões
        Double milhasNaut, milhasTerres, km;

        //Chamando o conversor para realizar os calculos
        milhasNaut = Conversor.metrosParaMilhasNaut(metros);
        milhasTerres = Conversor.metrosParaMilhasTerres(metros);
        km = Conversor.metrosParaKM(metros);


        //Criando um bando de paramêtros
        Bundle bundle= new Bundle();

        //Recebendo o valor convertido do bando em paramêtros
        bundle.putDouble("metros", metros);
        bundle.putDouble("milhasNaut", milhasNaut);
        bundle.putDouble("milhasTerres", milhasTerres);
        bundle.putDouble("km", km);

        //Criando a intenção para mostrar o resultado
        Intent irparaResultado = new Intent(MainActivity.this, ResultadoActivity.class);

        //A intenção da página de resultado recebendo o bando de resultado
        irparaResultado.putExtras(bundle);

        //Iniciando a Activity com a intenção e o bando
        startActivity(irparaResultado);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
