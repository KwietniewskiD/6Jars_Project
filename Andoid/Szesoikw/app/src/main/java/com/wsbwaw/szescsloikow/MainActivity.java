package com.wsbwaw.szescsloikow;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.SharedPreferences;

public class MainActivity extends AppCompatActivity {

    //utworzenie pliku zapisu
    SharedPreferences malaBaza;



    //utworzenie skrótów do elementów interfejsu
    private EditText deposit;
    private TextView oplaty, przyjemnosci, inwestycje, edukacja, zakupy, datki;
    private Button pobierz;

    //utowrzenie zmiennych pomocniczych
    private double d55, d10, d5, d;

    //funckja która jest wywoływana przy starcie aplikacji
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //przypisanie skrótów
        deposit=(EditText)findViewById(R.id.deposit);
        oplaty=(TextView)findViewById(R.id.textValue1);
        przyjemnosci=(TextView)findViewById(R.id.textValue2);
        inwestycje=(TextView)findViewById(R.id.textValue3);
        edukacja=(TextView)findViewById(R.id.textValue4);
        zakupy=(TextView)findViewById(R.id.textValue5);
        datki=(TextView)findViewById(R.id.textValue6);

        malaBaza = getSharedPreferences("plikZapisu",
                Context.MODE_PRIVATE);

        //Pobranie zapisanych wartości
        if (malaBaza.contains("Jar1"))
        {
            oplaty.setText(malaBaza.getFloat("jar1", 0.0F)+"zł");
        }

        if (malaBaza.contains("Jar2"))
        {
            przyjemnosci.setText(malaBaza.getFloat("jar2", 0.0F)+"zł");
        }

        if (malaBaza.contains("Jar3"))
        {
            inwestycje.setText(malaBaza.getFloat("jar3", 0.0F)+"zł");
        }

        if (malaBaza.contains("Jar4"))
        {
            edukacja.setText(malaBaza.getFloat("jar4", 0.0F)+"zł");
        }

        if (malaBaza.contains("Jar5"))
        {
            zakupy.setText(malaBaza.getFloat("jar5", 0.0F)+"zł");
        }

        if (malaBaza.contains("Jar6"))
        {
            datki.setText(malaBaza.getFloat("jar6", 0.0F)+"zł");
        }






    }

    //nowa metoda
    public void onClickButtonAdd(View view)
    {


        //oplaty.setText(deposit.getText().toString()); przykład przypisania EditTextu do TextView

        d=Integer.parseInt(deposit.getText().toString()); //zmiana tekstu na liczbę

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
