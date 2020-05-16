package com.wsbwaw.szescsloikow;

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
    private TextView oplaty, przyjemnosci, inwestycje, edukacja, zakupy, datki;
    private Button pobierz;

    //utowrzenie zmiennych pomocniczych
    private double Jar1, Jar2, Jar3, Jar4, Jar5, Jar6, d; // dotychczasowe wartości słoików
    private double dJar1, dJar2, dJar3, dJar4, dJar5, dJar6; // nowe wartości słoików
    private double wyplata1, wyplata2, wyplata3, wyplata4, wyplata5, wyplata6; // kwota wypłaty



    @Override
    //nie wiem od czego to jest ale było przy utworzeniu i niech będzie
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //nowa metoda dodawania
    public void onClickButtonAdd(View view)
    {
        //przypisanie skrótów
        deposit=(EditText)findViewById(R.id.deposit);
        oplaty=(TextView)findViewById(R.id.textValue1);
        przyjemnosci=(TextView)findViewById(R.id.textValue2);
        inwestycje=(TextView)findViewById(R.id.textValue3);
        edukacja=(TextView)findViewById(R.id.textValue4);
        zakupy=(TextView)findViewById(R.id.textValue5);
        datki=(TextView)findViewById(R.id.textValue6);

        //oplaty.setText(deposit.getText().toString()); przykład przypisania EditTextu do TextView

        d=Double.parseDouble(deposit.getText().toString()); //zmiana tekstu na liczbę

        Jar1=d*0.55;
        Jar2=d*0.1;
        Jar3=d*0.1;
        Jar4=d*0.1;
        Jar5=d*0.1;
        Jar6=d*0.05;


        //przypisanie liczb do TextView`ów
        oplaty.setText(Jar1+"zł");
        przyjemnosci.setText(Jar2+"zł");
        inwestycje.setText(Jar3+"zł");
        edukacja.setText(Jar4+"zł");
        zakupy.setText(Jar5+"zł");
        datki.setText(Jar6+"zł");
    }

    //nowa metoda odejmowania opłaty stałe
    public void onClickButtonRemJar1(View view)
    {
        wyplata1=Double.parseDouble(deposit.getText().toString()); //zmiana tekstu na liczbę

        dJar1 = Jar1 - wyplata1;

        //przypisanie liczb do TextView`ów
        oplaty.setText(dJar1+"zł");

    }

    //nowa metoda odejmowania przyjemności
    public void onClickButtonRemJar2(View view)
    {
        wyplata2=Double.parseDouble(deposit.getText().toString()); //zmiana tekstu na liczbę

        dJar2 = Jar2- wyplata2;

        //przypisanie liczb do TextView`ów
        przyjemnosci.setText(dJar2+"zł");

    }

    //nowa metoda odejmowania inwestycje
    public void onClickButtonRemJar3(View view)
    {
        wyplata3=Double.parseDouble(deposit.getText().toString()); //zmiana tekstu na liczbę

        dJar3 = Jar3- wyplata3;

        //przypisanie liczb do TextView`ów
        inwestycje.setText(dJar3+"zł");

    }

    //nowa metoda odejmowania edukacja
    public void onClickButtonRemJar4(View view)
    {
        wyplata4=Double.parseDouble(deposit.getText().toString()); //zmiana tekstu na liczbę

        dJar4 = Jar4- wyplata4;

        //przypisanie liczb do TextView`ów
        edukacja.setText(dJar4+"zł");

    }

    //nowa metoda odejmowania większe zakupy
    public void onClickButtonRemJar5(View view)
    {
        wyplata5=Double.parseDouble(deposit.getText().toString()); //zmiana tekstu na liczbę

        dJar5 = Jar5- wyplata5;

        //przypisanie liczb do TextView`ów
        zakupy.setText(dJar5+"zł");
    }

    //nowa metoda odejmowania datki
    public void onClickButtonRemJar6(View view)
    {
        wyplata6=Double.parseDouble(deposit.getText().toString()); //zmiana tekstu na liczbę

        dJar6 = Jar6- wyplata6;

        //przypisanie liczb do TextView`ów

        datki.setText(dJar6+"zł");
    }
}
