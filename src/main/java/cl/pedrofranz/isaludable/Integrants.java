package cl.pedrofranz.isaludable;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

/**
 * Created by pedrofranz on 27-05-15.
 */
public class Integrants extends Activity{

    Button comida, estadisticas, cocinar, deportes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        comida = (Button) findViewById(R.id.button);
        estadisticas = (Button) findViewById(R.id.button2);
        cocinar = (Button) findViewById(R.id.button3);
        deportes = (Button) findViewById(R.id.button4);

    }


}
