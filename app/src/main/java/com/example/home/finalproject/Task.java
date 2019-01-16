package com.example.home.finalproject;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.icu.util.Calendar;
public class Task extends AppCompatActivity {
    TextView textViewc;
    TextView textViewd;
    Button buttonc;
    Button buttond;
    Context cContext=this;
    Context dContext=this;
    int day,month,year,minute,hour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
        textViewc=(TextView)findViewById(R.id.tvc);
        textViewd=(TextView)findViewById(R.id.tvd2);
        buttonc=(Button)findViewById(R.id.btnc);
        buttond=(Button)findViewById(R.id.btnd);
        buttonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar c = Calendar.getInstance();
                hour=c.get(Calendar.HOUR_OF_DAY);
                minute=c.get(Calendar.MINUTE);
                TimePickerDialog timePickerDialog=new TimePickerDialog(cContext, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        textViewc.setText(hourOfDay +":"+ minute);
                    }

                },hour,minute,android.text.format.DateFormat.is24HourFormat(cContext));
                timePickerDialog.show();
            }
        });
        buttond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar c = Calendar.getInstance();
                year=c.get(Calendar.YEAR);
                month=c.get(Calendar.MONTH);
                day=c.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog =new DatePickerDialog(dContext, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                        textViewd.setText(year +"/"+month+"/"+dayOfMonth);
                    }
                },year,month,day);

                datePickerDialog.show();
            }
        });
    }
}
