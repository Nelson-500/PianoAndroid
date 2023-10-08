package catolica.edu.sv.pianogrupo11;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class piano_de_instrumentos_musicales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano_de_instrumentos_musicales);
    }

    public void sonidoFlauta(View view) {

        MediaPlayer sonido = MediaPlayer.create(this, R.raw.flautaa);
        if (sonido.isPlaying()) {
            sonido.stop();
        } else {
            try {
                sonido.start();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }
    public void sonidoGuitarra(View view) {

        MediaPlayer sonido = MediaPlayer.create(this, R.raw.guitarraa);
        if (sonido.isPlaying()) {
            sonido.stop();
        } else {
            try {
                sonido.start();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }
    public void sonidoTrompeta(View view) {

        MediaPlayer sonido = MediaPlayer.create(this, R.raw.trompetaa);
        if (sonido.isPlaying()) {
            sonido.stop();
        } else {
            try {
                sonido.start();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }
    public void sonidoSaxofon(View view) {

        MediaPlayer sonido = MediaPlayer.create(this, R.raw.saxofoon);
        if (sonido.isPlaying()) {
            sonido.stop();
        } else {
            try {
                sonido.start();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }
}