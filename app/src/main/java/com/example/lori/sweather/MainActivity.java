package com.example.lori.sweather;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {

    //static int count=0;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next = (Button) findViewById(R.id.buttonStart);
        next.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                String weather = "Rain";
                Intent infoScreen;
                switch(weather) {
                    case "Clear":
                        infoScreen = new Intent(getApplicationContext(), startUpActivity.class);
                        startActivity(infoScreen);
                        break;
                    case "Rain":
                        infoScreen = new Intent(getApplicationContext(), rahnactivity.class);
                        startActivity(infoScreen);
                        break;
                    case "Clouds":
                        infoScreen = new Intent(getApplicationContext(), clouds.class);
                        startActivity(infoScreen);
                        break;
                    case "Snow":
                        infoScreen = new Intent(getApplicationContext(), clouds.class);
                        startActivity(infoScreen);
                        break;
                    default:
                        infoScreen = new Intent(getApplicationContext(), startUpActivity.class);
                        startActivity(infoScreen);
                }


            }


        });
        TextView fontChoice = (TextView)findViewById(R.id.textView2);
        TextView fontChoice1 = (TextView)findViewById(R.id.textView);
        TextView fontChoice2 = (TextView)findViewById(R.id.buttonStart);
        final Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/font44.ttf");
        fontChoice.setTypeface(custom_font);
        fontChoice1.setTypeface(custom_font);
        fontChoice2.setTypeface(custom_font);

    }

}

