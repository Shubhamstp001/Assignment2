package com.shubham.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import static com.shubham.quizapp.R.id.result;

public class MainActivity extends AppCompatActivity {

    RadioGroup rgroup1, rgroup2;
    Button btn;

    double mark = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgroup1 = (RadioGroup) findViewById(R.id.rg1);
        rgroup2 = (RadioGroup) findViewById(R.id.rg2);
        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView res = (TextView)findViewById(result);
                res.setText("Your Score : " + mark + "/20");
                res.setVisibility(View.VISIBLE);

            }
        });

    }

    public void rbClick(View view)
    {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.questionOneA:
                if (checked)
                    mark = mark-2.5;
                break;
            case R.id.questionOneB:
                if (checked)
                    mark = mark-2.5;
                break;
            case R.id.questionOneC:
                if (checked)
                    mark = mark-2.5;
                break;
            case R.id.questionOneD:
                if (checked)
                    mark = mark+10;
                break;
        }
    }

    public void rbClick2(View view)
    {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.questionTwoA:
                if (checked)
                    mark = mark+10;
                break;
            case R.id.questionTwoB:
                if (checked)
                    mark = mark-2.5;
                break;
            case R.id.questionTwoC:
                if (checked)
                    mark = mark-2.5;
                break;
            case R.id.questionTwoD:
                if (checked)
                    mark = mark-2.5;
                break;
        }
    }
}
