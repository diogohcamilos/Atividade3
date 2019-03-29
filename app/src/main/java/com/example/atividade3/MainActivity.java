package com.example.atividade3;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ultimo;
    EditText altura;
    EditText cintura;
    EditText busto;
    EditText quadril;
    EditText biceps;
    EditText quadriceps;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ultimo = findViewById(R.id.ultPeso);
        altura = findViewById(R.id.altura);
        cintura = findViewById(R.id.cintura);
        busto = findViewById(R.id.busto);
        quadril = findViewById(R.id.quadril);
        biceps = findViewById(R.id.biceps);
        quadriceps = findViewById(R.id.quadriceps);

        this.carregar();

    }

    public void salvar(View v){

        //GUARDAR OS DADOS  NO ARQUIVO "MinhasNotas"
        SharedPreferences preferences = getSharedPreferences("MinhasMedidas",MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        // dentro do arquivo MinhasNotas terá o Parcial1 = a variavel global que criamos la em cima
        editor.putString("ultimo",ultimo.getText().toString());
        editor.putString("altura",altura.getText().toString());
        editor.putString("cintura",cintura.getText().toString());
        editor.putString("busto",busto.getText().toString());
        editor.putString("quadril",quadril.getText().toString());
        editor.putString("biceps",biceps.getText().toString());
        editor.putString("quadriceps",quadriceps.getText().toString());

        editor.apply(); //salvar

    }

    public void carregar(){

        //apenas lendo
        SharedPreferences preferences = getSharedPreferences("MinhasMedidas",MODE_PRIVATE);

        //criou uma string chamada parcial 1 salvou os dados que esta no arquivo MinhasNotas no campo Parcial1
        String ultimo1= preferences.getString("ultimo","0");
        ultimo.setText(ultimo1);

        String altura1= preferences.getString("altura","0");
        altura.setText(altura1);

        String cintura1= preferences.getString("cintura","0");
        cintura.setText(cintura1);

        String busto1= preferences.getString("Oficial2","0");
        busto.setText(busto1);

        String quadril1 = preferences.getString("Oficial2","0");
        quadril.setText(quadril1);

        String biceps1= preferences.getString("Oficial2","0");
        biceps.setText(biceps1);

        String quadriceps1 = preferences.getString("Oficial2","0");
        quadriceps.setText(quadriceps1);

    }

}
