package com.wsbwaw.szescsloikow;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

// TRZEBA TO WPISAC DO PLIKU ANDOIDMANIFEST.XML ALE JESZCZE NIE WIEM JAK
//Klasa ma uproscic dostep do zapisu
public class BazaSloi extends Application {

    private SharedPreferences malaBaza;

    public BazaSloi() {
        malaBaza = getSharedPreferences("plikZapisu", Context.MODE_PRIVATE);
    }

    SharedPreferences.Editor editor = malaBaza.edit();


    public void zapiszFloat(String key, float value)
    {
        editor.putFloat(key, value);
        editor.commit();
    }

    public void usunFloat(String key)
    {
        editor.remove(key);
        editor.commit();
    }

    public void pobierzFloat(String key, float value)
    {
        malaBaza.getFloat(key, 0.0F);
    }
}
