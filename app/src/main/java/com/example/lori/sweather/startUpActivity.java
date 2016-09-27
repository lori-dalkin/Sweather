package com.example.lori.sweather;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class startUpActivity extends AppCompatActivity {

    ImageButton back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up);


        TextView fontChoice1 = (TextView)findViewById(R.id.textView3);
        TextView fontChoice2 = (TextView)findViewById(R.id.textView4);
        TextView fontChoice3 = (TextView)findViewById(R.id.textView5);
        final Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/font44.ttf");
        fontChoice1.setTypeface(custom_font);
        fontChoice2.setTypeface(custom_font);
        fontChoice3.setTypeface(custom_font);






    }
}
