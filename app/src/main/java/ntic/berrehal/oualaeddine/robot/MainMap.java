package ntic.berrehal.oualaeddine.robot;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainMap extends AppCompatActivity {

    Button move;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_map);
        move = (Button) findViewById(R.id.buttonDeplacer);
    }

}
