package org.altervista.ultimaprovaprimadi.mytabletphone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (findViewById(R.id.id_textview_tablet) != null){
            Toast.makeText(this,"Dovrei essere in un tablet",Toast.LENGTH_LONG).show();git
        }
    }
}
