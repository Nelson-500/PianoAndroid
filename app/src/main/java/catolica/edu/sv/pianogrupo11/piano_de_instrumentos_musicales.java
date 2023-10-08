package catolica.edu.sv.pianogrupo11;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class piano_de_instrumentos_musicales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano_de_instrumentos_musicales);
    }
    public void sonidoFlauta(View view) {
        final MediaPlayer sonido = MediaPlayer.create(this, R.raw.flautaa);
        if (sonido.isPlaying()) {
            sonido.stop();
        } else {
            try {
                sonido.start();
                // Detener el sonido después de 3 segundos (3000 milisegundos)
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (sonido.isPlaying()) {
                            sonido.stop();
                        }
                    }
                }, 3000); // 3000 milisegundos = 3 segundos
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }

    public void sonidoGuitarra(View view) {
        final MediaPlayer sonido = MediaPlayer.create(this, R.raw.guitarraa);
        if (sonido.isPlaying()) {
            sonido.stop();
        } else {
            try {
                sonido.start();
                // Detener el sonido después de 2 segundos (2000 milisegundos)
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (sonido.isPlaying()) {
                            sonido.stop();
                        }
                    }
                }, 3000); // 2000 milisegundos = 2 segundos
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }

    public void sonidoTrompeta(View view) {
        final MediaPlayer sonido = MediaPlayer.create(this, R.raw.trompetaa);
        if (sonido.isPlaying()) {
            sonido.stop();
        } else {
            try {
                sonido.start();
                // Detener el sonido después de 4 segundos (4000 milisegundos)
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (sonido.isPlaying()) {
                            sonido.stop();
                        }
                    }
                }, 2000); // 4000 milisegundos = 4 segundos
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }

    public void sonidoSaxofon(View view) {
        final MediaPlayer sonido = MediaPlayer.create(this, R.raw.saxofoon);
        if (sonido.isPlaying()) {
            sonido.stop();
        } else {
            try {
                sonido.start();
                // Detener el sonido después de 5 segundos (5000 milisegundos)
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (sonido.isPlaying()) {
                            sonido.stop();
                        }
                    }
                }, 5000); // 5000 milisegundos = 5 segundos
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }

}