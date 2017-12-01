package time.party.sbux;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_second );
        textView=(TextView) findViewById(R.id.textView);

//
//        //reseive from second
//        Intent intent2 = getIntent();
//        String name1 = intent2.getStringExtra("Name1");
//        Log.d( name1, "name1 in second: " +name1);

//
//        textView.setText( name1 );
    }
}
