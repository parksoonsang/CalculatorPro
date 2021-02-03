package com.ex.calculatorpro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;

    LinearLayout bottomsheet;
    private BottomSheetBehavior bottomSheetBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomsheet = findViewById(R.id.bottom_sheet);

        btn1 = findViewById(R.id.cal1);
        btn2 = findViewById(R.id.cal2);
        btn3 = findViewById(R.id.cal3);
        btn4 = findViewById(R.id.cal4);
        btn5 = findViewById(R.id.cal5);
        btn6 = findViewById(R.id.cal6);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(MainActivity.this);
                //bottomSheetDialog.setContentView(R.layout.normal_cal);
                //bottomSheetDialog.show();

                bottomSheetBehavior = BottomSheetBehavior.from(bottomsheet);
                bottomSheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
                    @Override
                    public void onStateChanged(@NonNull View bottomSheet, int newState) {

                    }

                    @Override
                    public void onSlide(@NonNull View bottomSheet, float slideOffset) {

                    }
                });

            }
        });


    }
}