package com.sv15.mercadventure;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

/**
 * Created by Dell on 19-Jan-18.
 */

public class Fourth_page extends Activity implements View.OnClickListener {
        Button btn1,btn2,btn3;
        EditText et1,et2;
        private int date,month,year,minutes,hours,second;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_page);
        btn1 = findViewById(R.id.button5);
        btn2 = findViewById(R.id.button6);
        btn3 = findViewById(R.id.button7);
        et1 = findViewById(R.id.editText5);
        et2 = findViewById(R.id.editText6);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }
            @Override
            public void onClick(View v) {
        if(v==btn1){
                final Calendar c= Calendar.getInstance();
                date=c.get(Calendar.DAY_OF_MONTH);
                month=c.get(Calendar.MONTH);
                year=c.get(Calendar.YEAR);

                DatePickerDialog datePickerDialog= new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        et1.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                    }
                },date,month,year);
            datePickerDialog.show();
            }
        if(v==btn2){
            final Calendar c= Calendar.getInstance();
            hours=c.get(Calendar.HOUR_OF_DAY);
            minutes=c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog= new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    et2.setText(hourOfDay+":"+minute);
                }
            },hours,minutes,false);
            timePickerDialog.show();
        }
        if(v==btn3){
            Toast.makeText(Fourth_page.this, "BOOKING SUCCESSFUL", Toast.LENGTH_LONG).show();
        }

        }

}
