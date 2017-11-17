package time.party.sbux;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputText;
    TextView textView;
    Button btnShoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        inputText=(EditText) findViewById(R.id.inputText);
        textView=(TextView) findViewById(R.id.textView2);
        btnShoot= (Button) findViewById(R.id.btnShoot);
 // String penis = " "+inputText.getText().toString();
//         textView.setText( penis );


        btnShoot.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // String penis = " "+inputText.getText().toString();
               // textView.setText( penis );
            }
        } );
//        inputText.setOnClickListener( new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String penis = " "+inputText.getText().toString();
//                textView.setText( penis );
//
//            }
//        } );

      inputText.addTextChangedListener( new TextWatcher() {

          @Override
          public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
           //   textView.setText( penis );
          }

          @Override
          public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
              String penis = " "+inputText.getText().toString();
              textView.setText( penis );
          }

          @Override
          public void afterTextChanged(Editable editable) {
             // textView.setText( penis );
          }
      } );


    }


}
