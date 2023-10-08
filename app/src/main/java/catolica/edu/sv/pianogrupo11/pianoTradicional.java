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
    public void NotaDo(View v){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.doo);
        mp.start();
    }

    public void NotaRe(View v){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.ree);
        mp.start();
    }

    public void NotaMi(View v){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.mii);
        mp.start();
    }

    public void NotaFa(View v){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.faa);
        mp.start();
    }

    public void NotaSol(View v){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sool);
        mp.start();
    }

    public void NotaLa(View v){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.laa);
        mp.start();
    }

    public void NotaSi(View v){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sii);
        mp.start();
    }

}