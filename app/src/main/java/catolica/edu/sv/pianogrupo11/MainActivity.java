package catolica.edu.sv.pianogrupo11;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void TipodePiano(View view) {
        final String[] items = {"Piano Tradicional", "Piano Infantil de la Selva", "Piano de Instrumentos Musicales"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Seleccione el tipo de piano");
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                if (items[i].equals("Piano Tradicional")) {
                    // Llamada a la actividad piano tradicional usando Intent
                    Intent intent = new Intent(MainActivity.this, pianoTradicional.class);
                    startActivity(intent);

                } else if (items[i].equals("Piano Infantil de la Selva")) {
                    // Llamada a la actividad piano infantil de la selva usando Intente

                    Intent intent = new Intent(MainActivity.this, piano_infantil_de_la_selva.class);
                    startActivity(intent);

                } else if (items[i].equals("Piano de Instrumentos Musicales")) {
                    // Llamada a la actividad piano de instrumentos musicales usando Intente
                    Intent intent = new Intent(MainActivity.this, piano_de_instrumentos_musicales.class);
                    startActivity(intent);
                }
            }
        });

        // Mostrar el cuadro de diálogo
        builder.show();
    }

    public void Acercade(View view){
        //muestra el layout de activity_acercade con Intente
        Intent intent = new Intent(this, AcercaDe.class);
        startActivity(intent);
    }
    public void Salir(View view){
        //finaliza la aplicacion
        finish();
    }

}