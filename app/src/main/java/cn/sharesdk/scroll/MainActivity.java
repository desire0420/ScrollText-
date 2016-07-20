package cn.sharesdk.scroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1;
    MultiScrollNumber scrollNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        scrollNumber = (MultiScrollNumber) findViewById(R.id.scroll_number);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                scrollNumber.setNumber(2048);
                scrollNumber.setTextColors(new int[]{R.color.blue01, R.color.red01,
                        R.color.green01, R.color.purple01});
                scrollNumber.setTextSize(64);
                scrollNumber.setInterpolator(new DecelerateInterpolator());
            }
        });


    }
}
