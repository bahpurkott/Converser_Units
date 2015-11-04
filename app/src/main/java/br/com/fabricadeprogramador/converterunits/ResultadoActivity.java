package br.com.fabricadeprogramador.converterunits;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by barbarapurkottcezar on 03/11/15.
 */


public class ResultadoActivity extends Activity {
    @Bind(R.id.TextView_resultMetros)
    TextView textViewresultMetros;

    @Bind(R.id.TextView_resultKM)
    TextView textViewresultKM;

    @Bind(R.id.TextView_resultMilhasNaut)
    TextView textViewresultMilhasNaut;


    @Bind(R.id.TextView_resultMilhasTerres)
    TextView textViewresultMilhasTerres;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_resultado);

        ButterKnife.bind(this);

        //Recebe o bando trazido da MainActivity
        Intent intencao = getIntent();

        Bundle bundle = intencao.getExtras();

        Double metros = bundle.getDouble("metros");
        Double milhasNaut = bundle.getDouble("milhasNaut");
        Double minhasTerres = bundle.getDouble("milhasTerres");
        Double km = bundle.getDouble("km");

        textViewresultMetros.setText(metros.toString());
        textViewresultMilhasNaut.setText(milhasNaut.toString());
        textViewresultMilhasTerres.setText(minhasTerres.toString());
        textViewresultKM.setText(km.toString());

    }
}
