package catolica.edu.sv.pianogrupo11;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class piano_infantil_de_la_selva extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano_infantil_de_la_selva);
    }

    public void Gato(View view) {
        Toast.makeText(this, "Gato", Toast.LENGTH_SHORT).show();
        //metodo de sonido de gato
        MediaPlayer mp = MediaPlayer.create(this, R.raw.gatoo);
        mp.start();
    }
    public void Leon(View view) {
        Toast.makeText(this, "Leon", Toast.LENGTH_SHORT).show();
        //metodo de sonido de Leon
        MediaPlayer mp = MediaPlayer.create(this, R.raw.leoon);
        mp.start();
    }
    public void Vaca(View view) {
        Toast.makeText(this, "Vaca", Toast.LENGTH_SHORT).show();
        //metodo de sonido de vacas
        MediaPlayer mp = MediaPlayer.create(this, R.raw.vacaa);
        mp.start();
    }
    public void Perro(View view) {
        Toast.makeText(this, "Perro", Toast.LENGTH_SHORT).show();
        //metodo de sonido de perro
        MediaPlayer mp = MediaPlayer.create(this, R.raw.perroo);
        mp.start();
    }

}