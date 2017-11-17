package time.party.sbux;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {




        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_test );



        textView=(TextView) findViewById(R.id.textView4);

        Intent intent = getIntent();
        String name1 = intent.getStringExtra("name1");
        Log.d( name1, "name1 in test: " +name1);
        textView.setText( name1 );
    }
}
