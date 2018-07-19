package customfont.com.customfont;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView textView_1,textView_2,textView_3,textView_4,textView_5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_1 = findViewById(R.id.textView_1);
        textView_2 = findViewById(R.id.textView_2);
        textView_3 = findViewById(R.id.textView_3);
        textView_4 = findViewById(R.id.textView_4);
        textView_5 = findViewById(R.id.textView_5);

        changeFont();
    }

    //change font function with ttf format.
    public void changeFont(){
        textView_1.setTypeface(Typeface.createFromAsset(getAssets(), "Avenir-Black-03.ttf"));
        textView_2.setTypeface(Typeface.createFromAsset(getAssets(), "Avenir-BlackOblique-04.ttf"));
        textView_3.setTypeface(Typeface.createFromAsset(getAssets(), "Avenir-Book-01.ttf"));
        textView_4.setTypeface(Typeface.createFromAsset(getAssets(), "Avenir-Heavy-05.ttf"));
        textView_5.setTypeface(Typeface.createFromAsset(getAssets(), "Avenir-Roman-12.ttf"));
    }
}
