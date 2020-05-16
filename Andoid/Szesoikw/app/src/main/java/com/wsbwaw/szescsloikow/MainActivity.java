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
    private double d55, d10, d5, d;
    private double dJar1, dJar2, dJar3, dJar4, dJar5, dJar6;
    private double dJar1Value, dJar2Value, dJar3Value, dJar4Value, dJar5Value, dJar6Value; // dotychczasowe wartości słoików

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

        d55=d*0.55;
        d10=d*0.1;
        d5=d*0.05;

        //przypisanie liczb do TextView`ów
        oplaty.setText(d55+"zł");
        przyjemnosci.setText(d10+"zł");
        inwestycje.setText(d10+"zł");
        edukacja.setText(d10+"zł");
        zakupy.setText(d10+"zł");
        datki.setText(d5+"zł");
    }

    //nowa metoda odejmowania opłaty stałe
    public void onClickButtonRemJar1(View view)
    {
        //przypisanie skrótów
        deposit=(EditText)findViewById(R.id.deposit);
        oplaty=(TextView)findViewById(R.id.textValue1);

        //oplaty.setText(deposit.getText().toString()); przykład przypisania EditTextu do TextView

        d=Double.parseDouble(deposit.getText().toString()); //zmiana tekstu na liczbę
        dJar1Value=Double.parseDouble(oplaty.getText().toString()); //zmiana tekstu z wartością opłat na liczbę

        dJar1=dJar1Value-d;

        //przypisanie liczb do TextView`ów
        oplaty.setText(dJar1+"zł");

    }

    //nowa metoda odejmowania przyjemności
    public void onClickButtonRemJar2(View view)
    {
        //przypisanie skrótów
        deposit=(EditText)findViewById(R.id.deposit);
        przyjemnosci=(TextView)findViewById(R.id.textValue2);

        //oplaty.setText(deposit.getText().toString()); przykład przypisania EditTextu do TextView

        d=Double.parseDouble(deposit.getText().toString()); //zmiana tekstu na liczbę
        dJar2Value=Double.parseDouble(przyjemnosci.getText().toString()); //zmiana tekstu z wartością opłat na liczbę

        dJar2=dJar2Value-d;

        //przypisanie liczb do TextView`ów
        przyjemnosci.setText(dJar2+"zł");

    }

    //nowa metoda odejmowania inwestycje
    public void onClickButtonRemJar3(View view)
    {
        //przypisanie skrótów
        deposit=(EditText)findViewById(R.id.deposit);
        inwestycje=(TextView)findViewById(R.id.textValue3);

        //oplaty.setText(deposit.getText().toString()); przykład przypisania EditTextu do TextView

        d=Double.parseDouble(deposit.getText().toString()); //zmiana tekstu na liczbę
        dJar3Value=Double.parseDouble(inwestycje.getText().toString()); //zmiana tekstu z wartością opłat na liczbę

        dJar3=dJar3Value-d;

        //przypisanie liczb do TextView`ów
        inwestycje.setText(dJar3+"zł");

    }

    //nowa metoda odejmowania edukacja
    public void onClickButtonRemJar4(View view)
    {
        //przypisanie skrótów
        deposit=(EditText)findViewById(R.id.deposit);
        edukacja=(TextView)findViewById(R.id.textValue4);

        //oplaty.setText(deposit.getText().toString()); przykład przypisania EditTextu do TextView

        d=Double.parseDouble(deposit.getText().toString()); //zmiana tekstu na liczbę
        dJar4Value=Double.parseDouble(edukacja.getText().toString()); //zmiana tekstu z wartością opłat na liczbę

        dJar4=dJar4Value-d;

        //przypisanie liczb do TextView`ów
        edukacja.setText(dJar4+"zł");

    }

    //nowa metoda odejmowania większe zakupy
    public void onClickButtonRemJar5(View view)
    {
        //przypisanie skrótów
        deposit=(EditText)findViewById(R.id.deposit);
        zakupy=(TextView)findViewById(R.id.textValue5);


        //oplaty.setText(deposit.getText().toString()); przykład przypisania EditTextu do TextView

        d=Double.parseDouble(deposit.getText().toString()); //zmiana tekstu na liczbę
        dJar5Value=Double.parseDouble(zakupy.getText().toString()); //zmiana tekstu z wartością opłat na liczbę

        dJar5=dJar5Value-d;

        //przypisanie liczb do TextView`ów
        zakupy.setText(dJar5+"zł");

    }

    //nowa metoda odejmowania datki
    public void onClickButtonRemJar6(View view)
    {
        //przypisanie skrótów
        deposit=(EditText)findViewById(R.id.deposit);
        datki=(TextView)findViewById(R.id.textValue6);

        //oplaty.setText(deposit.getText().toString()); przykład przypisania EditTextu do TextView

        d=Double.parseDouble(deposit.getText().toString()); //zmiana tekstu na liczbę
        dJar6Value=Double.parseDouble(datki.getText().toString()); //zmiana tekstu z wartością opłat na liczbę

        dJar6=dJar6Value-d;

        //przypisanie liczb do TextView`ów
        datki.setText(dJar6+"zł");
    }
}
