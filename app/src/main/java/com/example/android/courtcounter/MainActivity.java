package com.example.android.courtcounter;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {


    //<=================================Variables==================================================>

    //for upscreen score
    private int total_run;
    private int total_wicket;
    private int total_ball;

    //individual run
    private int run_playerA;
    private int run_playerB;

    private int ball_playerA;
    private int ball_playerB;

    private int bowlers_wicket;
    private int bowlers_run;

    private int extra_score;

    //==============================================================================================

    // <==================================Views=====================================================>

    // upper screen view
    private TextView total_score_view;
    private TextView total_ball_view;

    // radio button
    private RadioButton playerA;
    private RadioButton playerB;

    //individual players
    private TextView playerA_view;
    private TextView playerB_view;

    // bowlers
    private TextView bowers_view;

    private TextView extras_view;
    private TextView bowlersballview;
    private TextView bowler;

    private Dialog Mydialog, dialog;
//==================================================================================================

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent1 = getIntent();
        String tournament = intent1.getStringExtra("tournament");
        String batting = intent1.getStringExtra("batting");
        String bowling = intent1.getStringExtra("bowling");

        String bats1 = intent1.getStringExtra("bats1");
        String bats2 = intent1.getStringExtra("bats2");
        String bowlername = intent1.getStringExtra("bowls");

        getSupportActionBar().setTitle(tournament);

        TextView batteam = findViewById(R.id.textView2);
        batteam.setText(batting);

        bowler = findViewById(R.id.textView4);
        bowler.setText(bowlername);

//==============================================Variables==========================================>
        total_run = 0;
        total_wicket = 0;
        total_ball = 0;

        //individual ball played
        ball_playerA = 0;
        ball_playerB = 0;
        extra_score = 0;

        //individual run
        run_playerA = 0;
        run_playerB = 0;

        bowlers_run = 0;
        bowlers_wicket = 0;

//  <================================       views =================================================>

        total_score_view = findViewById(R.id.textView);
        playerA = findViewById(R.id.radioButton);
        playerB = findViewById(R.id.radioButton2);
        playerA_view = findViewById(R.id.textView5);
        playerB_view = findViewById(R.id.textView6);
        bowers_view = findViewById(R.id.textView7);
        extras_view = findViewById(R.id.extras_view);
//==================================================================================================
        playerA.setText(bats1);
        playerB.setText(bats2);


    }

    public void add_one(View view) {
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        Interpolator interpolator = new Interpolator(0.1, 20);
        myAnim.setInterpolator(interpolator);
        view.startAnimation(myAnim);


        if (playerA.isChecked()) {
            ball_playerA += 1;
            run_playerA += 1;
            playerA_view.setText(run_playerA + "(" + ball_playerA + ")");
            playerB.setChecked(true);

        } else if (playerB.isChecked()) {
            ball_playerB += 1;
            run_playerB += 1;
            playerB_view.setText(run_playerB + "(" + ball_playerB + ")");
            playerA.setChecked(true);
        }

        bowlers_run += 1;
        total_run += 1;
        total_score_view.setText(total_run + "/" + total_wicket);
        bowers_view.setText(bowlers_run + "(" + bowlers_wicket + ")");

    }

    public void add_two(View view) {
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        Interpolator interpolator = new Interpolator(0.1, 20);
        myAnim.setInterpolator(interpolator);
        view.startAnimation(myAnim);


        if (playerA.isChecked()) {
            ball_playerA += 1;
            run_playerA += 2;
            playerA_view.setText(run_playerA + "(" + ball_playerA + ")");
        } else if (playerB.isChecked()) {
            run_playerB += 2;
            ball_playerB += 1;
            playerB_view.setText(run_playerB + "(" + ball_playerB + ")");
        }

        bowlers_run += 2;
        total_run += 2;
        total_score_view.setText(total_run + "/" + total_wicket);
        bowers_view.setText(bowlers_run + "(" + bowlers_wicket + ")");
    }

    public void add_three(View view) {
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        Interpolator interpolator = new Interpolator(0.1, 20);
        myAnim.setInterpolator(interpolator);
        view.startAnimation(myAnim);


        if (playerA.isChecked()) {
            ball_playerA += 1;
            run_playerA += 3;
            playerA_view.setText(run_playerA + "(" + ball_playerA + ")");
            playerB.setChecked(true);

        } else if (playerB.isChecked()) {
            ball_playerB += 1;
            run_playerB += 3;
            playerB_view.setText(run_playerB + "(" + ball_playerB + ")");
            playerA.setChecked(true);
        }


        bowlers_run += 3;
        total_run += 3;
        total_score_view.setText(total_run + "/" + total_wicket);
        bowers_view.setText(bowlers_run + "(" + bowlers_wicket + ")");
    }

    public void add_four(View view) {
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        Interpolator interpolator = new Interpolator(0.1, 20);
        myAnim.setInterpolator(interpolator);
        view.startAnimation(myAnim);

        if (playerA.isChecked()) {
            ball_playerA += 1;
            run_playerA += 4;
            playerA_view.setText(run_playerA + "(" + ball_playerA + ")");
        } else if (playerB.isChecked()) {
            run_playerB += 4;
            ball_playerB += 1;
            playerB_view.setText(run_playerB + "(" + ball_playerB + ")");
        }

        bowlers_run += 4;
        total_run += 4;
        total_score_view.setText(total_run + "/" + total_wicket);
        bowers_view.setText(bowlers_run + "(" + bowlers_wicket + ")");


    }

    public void add_five(View view) {
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        Interpolator interpolator = new Interpolator(0.1, 20);
        myAnim.setInterpolator(interpolator);
        view.startAnimation(myAnim);

        if (playerA.isChecked()) {
            ball_playerA += 1;
            run_playerA += 5;
            playerA_view.setText(run_playerA + "(" + ball_playerA + ")");
            playerB.setChecked(true);

        } else if (playerB.isChecked()) {
            ball_playerB += 1;
            run_playerB += 5;
            playerB_view.setText(run_playerB + "(" + ball_playerB + ")");
            playerA.setChecked(true);
        }

        bowlers_run += 5;
        total_run += 5;
        total_score_view.setText(total_run + "/" + total_wicket);
        bowers_view.setText(bowlers_run + "(" + bowlers_wicket + ")");

    }

    public void add_six(View view) {
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        Interpolator interpolator = new Interpolator(0.1, 20);
        myAnim.setInterpolator(interpolator);
        view.startAnimation(myAnim);

        if (playerA.isChecked()) {
            ball_playerA += 1;
            run_playerA += 6;
            playerA_view.setText(run_playerA + "(" + ball_playerA + ")");
        } else if (playerB.isChecked()) {
            run_playerB += 6;
            ball_playerB += 1;
            playerB_view.setText(run_playerB + "(" + ball_playerB + ")");
        }

        bowlers_run += 6;
        total_run += 6;
        total_score_view.setText(total_run + "/" + total_wicket);
        bowers_view.setText(bowlers_run + "(" + bowlers_wicket + ")");
    }




    public void extra_run(View view) {
        Context wrapper = new ContextThemeWrapper(this, R.style.PopupMenu);
        PopupMenu popupMenu = new PopupMenu(wrapper, view);
        popupMenu.getMenuInflater().inflate(R.menu.menu, popupMenu.getMenu());
        popupMenu.show();
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.one:
                        total_run++;
                        bowlers_run++;
                        extra_score += 1;
                        extras_view.setText(extra_score + "");
                        total_score_view.setText(total_run + "/" + total_wicket);
                        bowers_view.setText(bowlers_run + "(" + bowlers_wicket + ")");
                        return true;
                    case R.id.two:
                        total_run += 2;
                        bowlers_run += 2;
                        extra_score += 2;
                        extras_view.setText(extra_score + "");
                        total_score_view.setText(total_run + "/" + total_wicket);
                        bowers_view.setText(bowlers_run + "(" + bowlers_wicket + ")");
                        return true;
                    case R.id.three:
                        total_run += 3;
                        bowlers_run += 3;
                        extra_score += 3;
                        extras_view.setText(extra_score + "");
                        total_score_view.setText(total_run + "/" + total_wicket);
                        bowers_view.setText(bowlers_run + "(" + bowlers_wicket + ")");
                        return true;
                    case R.id.four:
                        total_run += 4;
                        bowlers_run += 4;
                        extra_score += 4;
                        extras_view.setText(extra_score + "");
                        total_score_view.setText(total_run + "/" + total_wicket);
                        bowers_view.setText(bowlers_run + "(" + bowlers_wicket + ")");
                        return true;
                    case R.id.five:
                        total_run += 5;
                        bowlers_run += 5;
                        extra_score += 5;
                        extras_view.setText(extra_score + "");
                        total_score_view.setText(total_run + "/" + total_wicket);
                        bowers_view.setText(bowlers_run + "(" + bowlers_wicket + ")");
                        return true;
                    case R.id.six:
                        total_run += 6;
                        bowlers_run += 6;
                        extra_score += 6;
                        extras_view.setText(extra_score + "");
                        total_score_view.setText(total_run + "/" + total_wicket);
                        bowers_view.setText(bowlers_run + "(" + bowlers_wicket + ")");
                        return true;
                    default:
                        return true;

                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.reset_button) {
            total_run = 0;
            total_wicket = 0;
            total_ball = 0;

            //individual ball played
            ball_playerA = 0;
            ball_playerB = 0;
            extra_score = 0;

            //individual run
            run_playerA = 0;
            run_playerB = 0;

            bowlers_run = 0;
            bowlers_wicket = 0;
            bowers_view.setText(bowlers_run + "(" + bowlers_wicket + ")");
            total_score_view.setText(total_run + "/" + total_wicket);
            extras_view.setText(extra_score + "");
            playerA_view.setText(run_playerA + "(" + ball_playerA + ")");
            playerB_view.setText(run_playerB + "(" + ball_playerB + ")");


            return true;

        }
        return super.onOptionsItemSelected(item);
    }
    public void wicket_taken(View view) {
        Mydialog = new Dialog(this);
        Mydialog.setContentView(R.layout.custom_dialog);
        Mydialog.setTitle("Which Batsman is our");
        final EditText newPlayerName = Mydialog.findViewById(R.id.new_playername_view);
        final RadioButton rdplayerA = Mydialog.findViewById(R.id.rd_A);
        final RadioButton rdplayerB = Mydialog.findViewById(R.id.rd_B);

        String bats1 = (String) playerA.getText();
        String bats2 = (String) playerB.getText();
        rdplayerA.setText(bats1);
        rdplayerB.setText(bats2);
        Button button = Mydialog.findViewById(R.id.buttondialog);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(TextUtils.isEmpty(newPlayerName.getText().toString()))) {
                    if (rdplayerA.isChecked()) {
                        playerA.setChecked(true);
                        playerA.setText(newPlayerName.getText().toString());
                        run_playerA = 0;
                        ball_playerA = 0;
                        playerA_view.setText(run_playerA + "(" + ball_playerA + ")");
                        total_wicket++;
                        bowlers_wicket++;
                        total_score_view.setText(total_run + "/" + total_wicket);
                        bowers_view.setText(bowlers_run + "(" + bowlers_wicket + ")");
                    } else if (rdplayerB.isChecked()) {
                        playerB.setChecked(true);
                        playerB.setText(newPlayerName.getText().toString());
                        run_playerB = 0;
                        ball_playerB = 0;
                        playerB_view.setText(run_playerB + "(" + ball_playerB + ")");

                    }
                    Mydialog.dismiss();
                } else
                    Toast.makeText(getApplicationContext(), "Enter details", Toast.LENGTH_LONG).show();
            }
        });
        Mydialog.show();


    }
    public void change_bowler(View view) {
        dialog = new Dialog(this);
        dialog.setContentView(R.layout.changeplayer);
        final EditText newBowler = dialog.findViewById(R.id.change_edit);
        Button button = dialog.findViewById(R.id.buttonchange);
        dialog.show();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(TextUtils.isEmpty(newBowler.getText().toString()))) {
                    bowlers_run = 0;
                    bowlers_wicket = 0;
                    bowler.setText(newBowler.getText().toString());
                    bowers_view.setText(bowlers_run + "(" + bowlers_wicket + ")");
                    dialog.dismiss();
                } else
                    Toast.makeText(MainActivity.this, "Enter all details", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
