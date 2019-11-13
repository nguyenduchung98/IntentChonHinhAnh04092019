package nguyenduchung.ndh.intentchonhinhanh04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView imgHinhChon,imgHinhGoc;
    ImageButton imgPlay;
    TextView txtTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgHinhChon=findViewById(R.id.imageviewHinhChon);
        imgHinhGoc=findViewById(R.id.imageviewHinhGoc);
        imgPlay=findViewById(R.id.imagebuttonPlay);
        txtTime=findViewById(R.id.textviewTime);
    }
}
