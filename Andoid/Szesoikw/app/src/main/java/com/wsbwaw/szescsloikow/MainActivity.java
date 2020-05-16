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
    private float d55, d10, d5, d;

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

        malaBaza = getSharedPreferences("plikZapisu", Context.MODE_PRIVATE);

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
        SharedPreferences.Editor editor = malaBaza.edit();

        d=Float.parseFloat(deposit.getText().toString()); //zmiana tekstu na liczbę

        d55=d*0.55F;
        d10=d*0.1F;
        d5=d*0.05F;

        if (malaBaza.contains("Jar1"))
        {
            oplaty.setText(malaBaza.getFloat("jar1", 0.0F)+d55+"zł");
        }
        else
        {
            oplaty.setText(d55+"zł");
            //zapiszdobazy
        }

        if (malaBaza.contains("Jar2"))
        {
            przyjemnosci.setText(malaBaza.getFloat("jar2", 0.0F)+d10+"zł");
        }
        else
        {
            przyjemnosci.setText(d10+"zł");
        }

        if (malaBaza.contains("Jar3"))
        {
            inwestycje.setText(malaBaza.getFloat("jar3", 0.0F)+d10+"zł");
        }
        else
        {
            inwestycje.setText(d10+"zł");
        }

        if (malaBaza.contains("Jar4"))
        {
            edukacja.setText(malaBaza.getFloat("jar4", 0.0F)+d10+"zł");
        }
        else
        {
            edukacja.setText(d10+"zł");
        }

        if (malaBaza.contains("Jar5"))
        {
            zakupy.setText(malaBaza.getFloat("jar5", 0.0F)+d10+"zł");
        }
        else
        {
            zakupy.setText(d10+"zł");
        }


        if (malaBaza.contains("Jar6"))
        {
            datki.setText(malaBaza.getFloat("jar6", 0.0F)+d5+"zł");
        }
        else
        {
            datki.setText(d5+"zł");
        }

        //oplaty.setText(deposit.getText().toString()); przykład przypisania EditTextu do TextView

    }
}
