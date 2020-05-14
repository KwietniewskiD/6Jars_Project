package com.wsbwaw.szescsloikow;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;


//Klasa ma uproscic dostep do zapisu
public class BazaSloi extends Application {

    private SharedPreferences bazaSloi;

    public BazaSloi() {
        bazaSloi = getSharedPreferences("plikZapisu", Context.MODE_PRIVATE);
    }

    private SharedPreferences.Editor editor = bazaSloi.edit();


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

    public boolean zawiera(String key)
    {
        if(bazaSloi.contains(key))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public float pobierzFloat(String key, float value) // 1. klucz 2. domyślna wartość jest nic nie będzie
    {
        return bazaSloi.getFloat(key, 0.0F);
    }
}
