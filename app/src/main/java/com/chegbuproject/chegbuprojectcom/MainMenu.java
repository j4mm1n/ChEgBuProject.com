package com.chegbuproject.chegbuprojectcom;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


/**
 * Created by HICT-HP on 26-11-2015.
 */
public class MainMenu extends Activity {
    private final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);


        //Initialising all buttons.
        Button button_SinglePlayer = (Button) findViewById(R.id.button_SinglePlayer);
        Button button_DualPlayer = (Button) findViewById(R.id.button_DualPlayer);
        Button button_Help = (Button) findViewById(R.id.button_Help);
        Button button_Exit = (Button) findViewById(R.id.button_Exit);


        button_SinglePlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SinglePlayerActivity.class);
                startActivity(intent);
            }
        });

        button_DualPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DualPlayerActivity.class);
                startActivity(intent);
            }
        });

        button_Help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, HelpActivity.class);
                startActivity(intent);
            }
        });

        button_Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}




