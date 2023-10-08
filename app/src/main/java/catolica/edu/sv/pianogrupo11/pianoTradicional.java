package catolica.edu.sv.pianogrupo11;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class pianoTradicional extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano_tradiconal);
    }

    public void sonidoDoo(View view){
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.doo);
        if (sonido.isPlaying()) {
            sonido.stop();
        }else{
            try {
                sonido.start();
            }catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }
    public void sonidoFaa(View view){
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.faa);
        if (sonido.isPlaying()) {
            sonido.stop();
        }else{
            try {
                sonido.start();
            }catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }
    public void sonidoMii(View view){
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.mii);
        if (sonido.isPlaying()) {
            sonido.stop();
        }else{
            try {
                sonido.start();
            }catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }
    public void sonidoLaa(View view){
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.laa);
        if (sonido.isPlaying()) {
            sonido.stop();
        }else{
            try {
                sonido.start();
            }catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }
    public void sonidoRee(View view){
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.ree);
        if (sonido.isPlaying()) {
            sonido.stop();
        }else{
            try {
                sonido.start();
            }catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }
    public void sonidoSii(View view){
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.sii);
        if (sonido.isPlaying()) {
            sonido.stop();
        }else{
            try {
                sonido.start();
            }catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }
    public void sonidoSool(View view){
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.sool);
        if (sonido.isPlaying()) {
            sonido.stop();
        }else{
            try {
                sonido.start();
            }catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }
}