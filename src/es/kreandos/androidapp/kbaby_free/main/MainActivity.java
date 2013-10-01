package es.kreandos.androidapp.kbaby_free.main;

import es.kreandos.androidapp.kbaby_free.main.R;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        TabHost tabHost = getTabHost(); // Creamos el TabHost de la actividad.
        TabHost.TabSpec spec; // Creamos un recurso para las propiedades de la pestaña.
        Intent intent; // Intent que se utilizara para abrir cada pestaña.
        Resources res = getResources(); // Obtenemos los recursos.
        
        //intent = new Intent().setClass(this, TareasSQLiteActivity.class);
        intent = new Intent().setClass(this, Tab_Historia.class);
        spec = tabHost.newTabSpec("Historia").setIndicator("Historia/Histórico", res.getDrawable(R.drawable.historia))
        		.setContent(intent);
        tabHost.addTab(spec);
        //tabHost.getTabWidget().getChildAt(3).setBackgroundColor(color.blue);
        
        // Se lanza crea el intent para abrir la actividad que en realidad es una clase:
        intent = new Intent().setClass(this, Tab_Termometro.class);
        
        // Se configura la pestaña con sus propiedades:
        spec = tabHost.newTabSpec("Termómetro").setIndicator("Termómetro", res.getDrawable(R.drawable.termometro))
        		.setContent(intent);
        
        // Se carga la pestaña en el contenedor TabHost:
        tabHost.addTab(spec);
        //tabHost.getTabWidget().getChildAt(0).setBackgroundColor(color.blue);
        
        // Se hacen los mismo con los demas:
        intent = new Intent().setClass(this, Tab_Alarma.class);
        spec = tabHost.newTabSpec("Alarma").setIndicator("Reloj/Alarma", res.getDrawable(R.drawable.alarma))
        		.setContent(intent);
        tabHost.addTab(spec);
        //tabHost.getTabWidget().getChildAt(1).setBackgroundColor(color.blue);
       
        intent = new Intent().setClass(this, Tab_Medicamentos.class);
        spec = tabHost.newTabSpec("Medicamentos").setIndicator("Medicamentos", res.getDrawable(R.drawable.medicamentos))
        		.setContent(intent);
        tabHost.addTab(spec);
        //tabHost.getTabWidget().getChildAt(2).setBackgroundColor(color.blue);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
