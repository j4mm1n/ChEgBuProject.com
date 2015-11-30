package com.chegbuproject.chegbuprojectcom;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.List;

/**
 * Created by HICT-HP on 30-11-2015.
 */
public class SinglePlayerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleplayer);

        ImageButton button_0_0 = (ImageButton) findViewById(R.id.imageButton_0_0);
        ImageButton button_0_1 = (ImageButton) findViewById(R.id.imageButton_0_1);
        ImageButton button_0_2 = (ImageButton) findViewById(R.id.imageButton_0_2);
        ImageButton button_1_0 = (ImageButton) findViewById(R.id.imageButton_1_0);
        ImageButton button_1_1 = (ImageButton) findViewById(R.id.imageButton_1_1);
        ImageButton button_1_2 = (ImageButton) findViewById(R.id.imageButton_1_2);
        ImageButton button_2_0 = (ImageButton) findViewById(R.id.imageButton_2_0);
        ImageButton button_2_1 = (ImageButton) findViewById(R.id.imageButton_2_1);
        ImageButton button_2_2 = (ImageButton) findViewById(R.id.imageButton_2_2);

        ImageButton buttonList[] = {button_0_0, button_0_1, button_0_2, button_1_0, button_1_1, button_1_2
                , button_2_0, button_2_1, button_2_2};


        //Loop to make OnClickListener for all of the buttons.
        for (final ImageButton imageButton: buttonList){
            button_0_0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imageButton.setBackgroundDrawable(getResources().getDrawable(R.drawable.cross));
                }
            });
        }

    }


}
