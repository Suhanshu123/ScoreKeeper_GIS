package com.example.android.courtcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    private EditText tournment;
    private EditText battn;
    private EditText bowtn;
    private EditText bat1;
    private EditText bat2;
    private EditText bowler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tournment = findViewById(R.id.tournament_view);
        battn = findViewById(R.id.battn_view);
        bowtn = findViewById(R.id.bowtn_view);
        bat1 = findViewById(R.id.batman1_view);
        bat2 = findViewById(R.id.batman2_view);
        bowler = findViewById(R.id.bowler_view);

    }

    public void open_activity_player(View view) {
        String tournament_string = tournment.getText().toString();
        String batting = battn.getText().toString();
        String bowling = bowtn.getText().toString();
        String bats1 = bat1.getText().toString();
        String bowls = bowler.getText().toString();
        String bats2 = bat2.getText().toString();

        if (!TextUtils.isEmpty(tournament_string) &&
                !TextUtils.isEmpty(batting) &&
                !TextUtils.isEmpty(bowling)&&
                !TextUtils.isEmpty(bats1)&&
                !TextUtils.isEmpty(bats2)&&
                !TextUtils.isEmpty(bowls)) {

            Intent intent = new Intent(this, MainActivity.class);

            intent.putExtra("tournament", tournament_string);
            intent.putExtra("batting", batting);
            intent.putExtra("bowling", bowling);
            intent.putExtra("bats1", bats1);
            intent.putExtra("bats2", bats2);
            intent.putExtra("bowls", bowls);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(getApplicationContext(), "Please fill all details", Toast.LENGTH_LONG).show();
        }
    }
}
