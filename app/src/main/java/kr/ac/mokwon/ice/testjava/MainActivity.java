package kr.ac.mokwon.ice.testjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    protected int[] a;  // int array
    protected Button btCalc;    // Calculation button

    protected void makeArray(int nSize) {

    }

    protected void fill(int nSize) {

    }

    protected double avg(int nSize) {   // 평균
        return 0.;
    }

    protected double var(int nSize) {   // 분산
        return 0.;
    }

    protected double std(int nSize) {   // 표준편차
        return 0.;
    }

    protected void print(double x1, double x2, double x3) {

    }

    protected void calc() {
        makeArray(10000);
        fill(10000);
        double x1 = avg(10000);
        double x2 = var(10000);
        double x3 = std(10000);
        print(x1, x2, x3);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCalc = (Button)findViewById(R.id.btCalc);
        btCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc();
            }
        });
    }
}
