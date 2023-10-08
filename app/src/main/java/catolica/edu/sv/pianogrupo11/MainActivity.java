package catolica.edu.sv.pianogrupo11;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano_tradiconal);
    }
    public void TipodePiano(View view){
        //cuadro de dialogo selectivo entre piano tradicional, piano infantil de la selva  y piano de instrumentos musicales
       final String[] items = {"Piano Tradicional", "Piano Infantil de la Selva", "Piano de Instrumentos Musicales"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Seleccione el tipo de piano");
        builder.setItems(items,new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int i) {
                if (items[i].equals("Piano Tradicional")){
                    //llamada a la actividad piano tradicional
                    setContentView(R.layout.activity_piano_tradiconal);
                }
                else if (items[i].equals("Piano Infantil de la Selva")){
                    //llamada a la actividad piano infantil de la selva
                    setContentView(R.layout.activity_piano_infantil_de_la_selva);
                }
                else if (items[i].equals("Piano de Instrumentos Musicales")){
                    //llamada a la actividad piano de instrumentos musicales
                    setContentView(R.layout.activity_piano_de_instrumentos_musicales);
                }
            }
        });

    }
    public void Acercade(View view){
        //muestra el layout de activity_acercade
        setContentView(R.layout.activity_acercade);
    }
    public void Salir(View view){
        //finaliza la aplicacion
        finish();
    }

}