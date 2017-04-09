package kostiukvladyslav.com.mynewprojektapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public void setNewInt(int newInt) {
        NewInt = newInt;
    }

    public int getNewInt() {
        return NewInt;
    }

    String NewString;
    int NewInt;
    TextView NTV;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button NB = (Button) findViewById(R.id.button);
        NTV = (TextView) findViewById(R.id.textView);



        NB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NewInt++;
                setNewInt(NewInt);
                NewString = Integer.valueOf(NewInt).toString();
                NTV.setText(NewString);
            }
        });

    }



}
