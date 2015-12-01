package com.chegbuproject.chegbuprojectcom;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by HICT-HP on 30-11-2015.
 */
public class SinglePlayerActivity extends Activity {

    private ArrayList<ImageButton> buttonArrayList = new ArrayList<ImageButton>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleplayer);

        ImageButton button_0 = (ImageButton) findViewById(R.id.imageButton0);
        ImageButton button_1 = (ImageButton) findViewById(R.id.imageButton1);
        ImageButton button_2 = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton button_3 = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton button_4 = (ImageButton) findViewById(R.id.imageButton4);
        ImageButton button_5 = (ImageButton) findViewById(R.id.imageButton5);
        ImageButton button_6 = (ImageButton) findViewById(R.id.imageButton6);
        ImageButton button_7 = (ImageButton) findViewById(R.id.imageButton7);
        ImageButton button_8 = (ImageButton) findViewById(R.id.imageButton8);

        ImageButton buttonList[] = {button_0, button_1, button_2, button_3, button_4, button_5
                , button_6, button_7, button_8};

        //Loop to make OnClickListener for all of the buttons.
        for (final ImageButton imageButton : buttonList) {
            imageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String tempString = imageButton.getContentDescription().toString();
                    String subString = tempString.substring(6);

                    if (checkButton(Integer.parseInt(subString))){
                        imageButton.setBackgroundDrawable(getResources().getDrawable(R.drawable.cross));

                        buttonArrayList.set(Integer.parseInt(subString), null);
                        computerTurn();
                    }
                }
            });
        }

        //Adding buttons to ArrayList
        buttonArrayList.add(button_0);
        buttonArrayList.add(button_1);
        buttonArrayList.add(button_2);
        buttonArrayList.add(button_3);
        buttonArrayList.add(button_4);
        buttonArrayList.add(button_5);
        buttonArrayList.add(button_6);
        buttonArrayList.add(button_7);
        buttonArrayList.add(button_8);
    }

    protected void computerTurn() {
        Random random = new Random();
        int tempNr = random.nextInt(8);

        if (checkButton(tempNr)) {
            buttonArrayList.get(tempNr).setBackgroundDrawable(getResources().getDrawable(R.drawable.circle));
            buttonArrayList.set(tempNr, null);
        } else {
            computerTurn();
        }
    }

    private boolean checkButton(int tempNr) {
        if (buttonArrayList.get(tempNr) == null) {
            return false;
        } else {
            return true;
        }
    }
}
