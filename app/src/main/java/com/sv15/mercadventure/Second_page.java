package com.sv15.mercadventure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Dell on 19-Jan-18.
 */

public class Second_page extends Activity {

    EditText et1,et2,et3,et4;
    Button btn_enter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_page);
        et1=findViewById(R.id.editText);
        et2=findViewById(R.id.editText2);
        et3= findViewById(R.id.editText3);
        et4=findViewById(R.id.editText4);
        btn_enter= findViewById(R.id.button3);
        btn_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Second_page.this, Third_page.class));
            }
        });

    }
}
