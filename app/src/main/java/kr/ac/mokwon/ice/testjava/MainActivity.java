package kr.ac.mokwon.ice.testjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    protected int[] arrayData;  // int array
    protected Button btCalc;    // Calculation button

    protected void makeArray(int nSize) {

    }

    protected void fillArray(int nSize) {

    }

    protected double getAvg(int nSize) {   // 평균
        return 0.;
    }

    protected double getVar(int nSize) {   // 분산
        return 0.;
    }

    protected double getStd(int nSize) {   // 표준편차
        return 0.;
    }

    protected void printTextView(double avg, double var, double std) {

    }

    protected void calcArrayStat() {
        makeArray(10000);
        fillArray(10000);
        double avg = getAvg(10000);
        double var = getVar(10000);
        double std = getStd(10000);
        printTextView(avg, var, std);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCalc = (Button)findViewById(R.id.btCalc);
        btCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcArrayStat();
            }
        });
    }
}
