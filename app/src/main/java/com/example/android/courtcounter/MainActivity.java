package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int a=0;
    int b=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textViewA=(TextView)findViewById(R.id.score_A);
        TextView textViewB=(TextView)findViewById(R.id.score_A);
        TextView textView=new TextView(this,null);
        textView.setText("heloo");
        textViewA.setText(""+a);
        textViewB.setText(""+b);

    }
    public void addOne(View view) {
     TextView textViewA=(TextView)findViewById(R.id.score_A);
     a=a+1;
     textViewA.setText(""+a);


    }
    public void addTwo(View view) {
        TextView textViewA=(TextView)findViewById(R.id.score_A);
        a=a+2;
        textViewA.setText(""+a);

    }
    public void addThree(View view) {
        TextView textViewA=(TextView)findViewById(R.id.score_A);
        a=a+3;
        textViewA.setText(""+a);

    }
    public void addFour(View view) {
        TextView textViewA=(TextView)findViewById(R.id.score_A);
        a=a+4;
        textViewA.setText(""+a);


    }
    public void addSix(View view) {
        TextView textViewA=(TextView)findViewById(R.id.score_A);
        a=a+6;
        textViewA.setText(""+a);

    }
    public void addOneB(View view) {
        TextView textViewB=(TextView)findViewById(R.id.score_B);
        b=b+1;
        textViewB.setText(""+b);


    }
    public void addTwoB(View view) {
        TextView textViewB=(TextView)findViewById(R.id.score_B);
        b=b+2;
        textViewB.setText(""+b);

    }
    public void addThreeB(View view) {
        TextView textViewB=(TextView)findViewById(R.id.score_B);
        b=b+3;
        textViewB.setText(""+b);

    }
    public void addFourB(View view) {
        TextView textViewB=(TextView)findViewById(R.id.score_B);
        b=b+4;
        textViewB.setText(""+b);


    }
    public void addSixB(View view) {
        TextView textViewB=(TextView)findViewById(R.id.score_B);
        b=b+6;
        textViewB.setText(""+b);

    }

    public void onReset(View view) {
        TextView textViewA=(TextView)findViewById(R.id.score_A);
        TextView textViewB=(TextView)findViewById(R.id.score_B);
        a=0;
        b=0;
        textViewA.setText(""+a);
        textViewB.setText(""+b);

    }



}
