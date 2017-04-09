package kostiukvladyslav.com.mytestapp;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    private int mWindowWidth;
    private int mWindowHeight;


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button NB = (Button) findViewById(R.id.button);

        Point size = new Point();
        WindowManager w = getWindowManager();



            w.getDefaultDisplay().getSize(size);

            mWindowWidth = size.x;
            mWindowHeight = size.y;

        ViewGroup.LayoutParams params = NB.getLayoutParams();
        params.width = (mWindowWidth/100)*30;
        params.height = (mWindowHeight/100)*21;
        NB.setLayoutParams(params);
        NB.setTranslationX((mWindowWidth/100)*30f);
        NB.setTranslationY((mWindowHeight/100)*30f);



    }
}
