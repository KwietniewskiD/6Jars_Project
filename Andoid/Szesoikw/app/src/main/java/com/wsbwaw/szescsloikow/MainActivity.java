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

    //nowa metoda odejmowania deposit
    public void onClickButtonRem(View view)
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

    //nowa metoda odejmowania przyjemności
    public void onClickButtonRemJar2(View view)
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

    //nowa metoda odejmowania inwestycje
    public void onClickButtonRemJar3(View view)
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

    //nowa metoda odejmowania edukacja
    public void onClickButtonRemJar4(View view)
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

    //nowa metoda odejmowania większe zakupy
    public void onClickButtonRemJar5(View view)
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

    //nowa metoda odejmowania datki
    public void onClickButtonRemJar6(View view)
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
}
