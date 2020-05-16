package com.wsbwaw.szescsloikow;

import android.app.Notification;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //utworzenie skrótów do elementów interfejsu
    private EditText deposit;
    private TextView oplaty;
    private TextView przyjemnosci;
    private TextView inwestycje;
    private TextView edukacja;
    private TextView zakupy;
    private TextView datki;
    private Button pobierz;
    private String y;

    //utowrzenie zmiennych pomocniczych
    private float d55, d10, d5, d, x;

    //przywołanie bazy danych
//    private SharedPreferences bazaDanych = getSharedPreferences("BazaSloikow", Activity.MODE_PRIVATE);
//    private SharedPreferences.Editor editor = bazaDanych.edit();


    @Override
    //nie wiem od czego to jest ale było przy utworzeniu i niech będzie
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences bazaDanych = getSharedPreferences("BazaSloikow", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = bazaDanych.edit();

        //przypisanie skrótów
        deposit=(EditText)findViewById(R.id.deposit);
        oplaty=(TextView)findViewById(R.id.textValue1);
        przyjemnosci = (TextView) findViewById(R.id.textValue2);
        inwestycje=(TextView)findViewById(R.id.textValue3);
        edukacja=(TextView)findViewById(R.id.textValue4);
        zakupy=(TextView)findViewById(R.id.textValue5);
        datki=(TextView)findViewById(R.id.textValue6);

        //pobranie zapisanych wartości lub jeśli takich brak to 0.0zł (oznaczone jako warning ale wszystko jest dobrze)
        x=bazaDanych.getFloat("jar1", 0.0F);
        y= Float.toString(x)+"zł";
        oplaty.setText(y);

        x=bazaDanych.getFloat("jar2", 0.0F);
        y= Float.toString(x)+"zł";
        przyjemnosci.setText(y);

        x=bazaDanych.getFloat("jar3", 0.0F);
        y= Float.toString(x)+"zł";
        inwestycje.setText(y);

        x=bazaDanych.getFloat("jar4", 0.0F);
        y= Float.toString(x)+"zł";
        edukacja.setText(y);

        x=bazaDanych.getFloat("jar5", 0.0F);
        y= Float.toString(x)+"zł";
        zakupy.setText(y);

        x=bazaDanych.getFloat("jar6", 0.0F);
        y= Float.toString(x)+"zł";
        datki.setText(y);


    }


    //metoda dodawania
    public void onClickButtonAdd(View view)
    {

        //oplaty.setText(deposit.getText().toString()); przykład przypisania EditTextu do TextView

        SharedPreferences bazaDanych = getSharedPreferences("BazaSloikow", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = bazaDanych.edit();


        d=Float.parseFloat(deposit.getText().toString()); //zmiana tekstu na liczbę

        d55=d*0.55F;
        d10=d*0.1F;
        d5=d*0.05F;

        //przypisanie liczb do TextView`ów + zapis do bazy
        x=bazaDanych.getFloat("jar1", 0.0F)+d55;
        oplaty.setText(x+"zł");
        editor.putFloat("jar1", x);

        x=bazaDanych.getFloat("jar2", 0.0F)+d10;
        przyjemnosci.setText(x+"zł");
        editor.putFloat("jar2", x);

        x=bazaDanych.getFloat("jar3", 0.0F)+d10;
        inwestycje.setText(x+"zł");
        editor.putFloat("jar3", x);

        x=bazaDanych.getFloat("jar4", 0.0F)+d10;
        edukacja.setText(x+"zł");
        editor.putFloat("jar4", x);

        x=bazaDanych.getFloat("jar5", 0.0F)+d10;
        zakupy.setText(x+"zł");
        editor.putFloat("jar5", x);

        x=bazaDanych.getFloat("jar6", 0.0F)+d5;
        datki.setText(x+"zł");
        editor.putFloat("jar6", x);

        editor.commit();
    }

    //nowa metoda odejmowania deposit
    public void onClickButtonRem(View view)
    {

    }

    //nowa metoda odejmowania opłaty stałe
    public void onClickButtonRemJar1(View view)
    {

    }

    //nowa metoda odejmowania przyjemności
    public void onClickButtonRemJar2(View view)
    {

    }

    //nowa metoda odejmowania inwestycje
    public void onClickButtonRemJar3(View view)
    {

    }

    //nowa metoda odejmowania edukacja
    public void onClickButtonRemJar4(View view)
    {

    }

    //nowa metoda odejmowania większe zakupy
    public void onClickButtonRemJar5(View view)
    {

    }

    //nowa metoda odejmowania datki
    public void onClickButtonRemJar6(View view)
    {

    }
}
