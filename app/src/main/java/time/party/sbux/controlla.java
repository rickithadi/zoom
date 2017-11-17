package time.party.sbux;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Adapter;
import android.widget.BaseAdapter;


/**
 * Created by hadi on 11/18/17.
 */

public class controlla extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate( savedInstanceState );
        setContentView( R.layout.controlla );
        //receive from main
        Intent intent = getIntent();
        String name1 = intent.getStringExtra("name1");
        Log.d( name1, "name1 in controlla: " +name1);

String hold="penis";
//send to second
//        Intent go = new Intent(controlla.this, SecondActivity.class);
//        go.putExtra("Name1", hold);
//      startActivity( go );
//
//
//        //go to second
//        startActivity(new Intent(controlla.this, SecondActivity.class));
    }


//    Intent intent = getIntent();
//    String temp = intent.getStringExtra("Data1");// usr getStringExtra() If your extra data is represented as strings:
//    String name1 = getIntent.getExtra("String key which you used when send value");


}
