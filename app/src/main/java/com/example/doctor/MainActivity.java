package com.example.doctor;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private Button dateBtn;
    private Button timeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dateBtn=findViewById(R.id.dateBtn);
        timeBtn=findViewById(R.id.timeBtn);
    }

    public void showDatePikcerDialog(View view) {
        Calendar todaysCalender = Calendar.getInstance();
        int year = todaysCalender.get(Calendar.YEAR);
        int month = todaysCalender.get(Calendar.MONTH);
        int day = todaysCalender.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog.OnDateSetListener listener = null;
        DatePickerDialog  datePickerDialog =new DatePickerDialog(this,listener, year, month, day);
        datePickerDialog.show();
    }

    public void showTimePikcerDialog(View view) {

        TimePickerDialog.OnTimeSetListener listener=null;
        Calendar c = Calendar.getInstance();
        Date date=null;
        c.setTime(date);
        TimePicker picker = new TimePicker(getApplicationContext());
        picker.setCurrentHour(c.get(Calendar.HOUR_OF_DAY));
       picker.setCurrentMinute(c.get(Calendar.MINUTE));
       int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

       TimePickerDialog timePickerDialog = new TimePickerDialog(this,listener,hour,minute,false);
    }
}
