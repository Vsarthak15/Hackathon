package com.sv15.mercadventure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by Dell on 19-Jan-18.
 */

public class Third_page extends Activity {

    Spinner spinner1, spinner2;
    Button btn_save;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_page);
        spinner1 = findViewById(R.id.spinner);
        spinner2 = findViewById(R.id.spinner2);
        btn_save= findViewById(R.id.button4);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(Third_page.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.drop_list_1));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(myAdapter);
        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(Third_page.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.drop_list_2));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(myAdapter2);
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Third_page.this, "PREFERENCES SAVED!", Toast.LENGTH_LONG).show();
            }
        });


    }
        public void onRadioButtonClicked(View view) {
            // Is the button now checked?
            boolean checked = ((RadioButton) view).isChecked();

            // Check which radio button was clicked
            switch(view.getId()) {
                case R.id.radio_pirates:
                    if (checked)
                        // Pirates are the best
                        break;
                case R.id.radio_ninjas:
                    if (checked)
                        // Ninjas rule
                        break;
            }
    }

}