package com.example.calender;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    CalendarView calendar;
    TextView dateView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calendar = findViewById(R.id.calender);
        dateView = findViewById(R.id.dateView);

        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth ) {
                String Date = dayOfMonth + "-" + (month+1) + "-" + year;
                dateView.setText(Date);
            }
        });

    }

}