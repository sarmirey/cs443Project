package com.example.sarmirey.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import javax.xml.transform.Result;

public class trueorFalse extends AppCompatActivity {


    private TextView score, question;
    private Button tButton, fButton;

    private boolean answer;
    private int currentscore = 0;
    private int iterator = 0;
    int count = 0;

    Button hidden;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trueor_false);

        score = (TextView)findViewById(R.id.score);
        question = (TextView)findViewById(R.id.questiontext);

        tButton = (Button)findViewById(R.id.trueB);
        fButton = (Button)findViewById(R.id.falseB);
        hidden = (Button)findViewById(R.id.hiddenButton);

        changeQuestion();






        tButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer == true) {
                    currentscore++;
                    updateScore(currentscore);

                    if (iterator == quizQuestions.questions.length)
                    {
                        if(currentscore >= 17)
                        {
                            tButton.setEnabled(false);
                            hidden.setVisibility(View.VISIBLE);
                            hidden.setText("Congrats!!! \n You Won! \n CLICK HERE");
                        }
                        else
                        {
                            tButton.setEnabled(false);
                            hidden.setVisibility(View.VISIBLE);
                            hidden.setText("You must get 17/20 Questions correct!. Try again.");
                        }

                    }
                    else {
                        changeQuestion();
                    }

                }
                else
                {
                    if (iterator == quizQuestions.questions.length)
                    {
                        if(currentscore >= 17)
                        {
                            tButton.setEnabled(false);
                            hidden.setVisibility(View.VISIBLE);
                            hidden.setText("Congrats!!! \n You Won! \n CLICK HERE");
                        }
                        else
                        {
                            tButton.setEnabled(false);
                            hidden.setVisibility(View.VISIBLE);
                            hidden.setText("You must get 17/20 Questions correct!. Try again.");
                        }

                    }
                    else {
                        changeQuestion();
                    }



                }
            }
        });

        fButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer == false) {
                    currentscore++;
                    updateScore(currentscore);

                    if (iterator == quizQuestions.questions.length)
                    {
                        if(currentscore >= 17)
                        {
                            tButton.setEnabled(false);
                            hidden.setVisibility(View.VISIBLE);
                            hidden.setText("Congrats!!! \n You Won! \n CLICK HERE");
                        }
                        else
                        {
                            tButton.setEnabled(false);
                            hidden.setVisibility(View.VISIBLE);
                            hidden.setText("You must get 17/20 Questions correct!. Try again.");
                        }

                    }
                    else {
                        changeQuestion();
                    }

                }
                else
                {
                    if (iterator == quizQuestions.questions.length)
                    {
                        if(currentscore >= 17)
                        {
                            tButton.setEnabled(false);
                            fButton.setEnabled(false);
                            hidden.setVisibility(View.VISIBLE);
                            hidden.setText("Congrats!!! \n You Won! \n CLICK HERE");
                        }
                        else
                        {
                            tButton.setEnabled(false);
                            fButton.setEnabled(false);
                            hidden.setVisibility(View.VISIBLE);
                            hidden.setText("You must get 17/20 Questions correct!. Try again.");
                        }

                    }
                    else {
                        changeQuestion();
                    }



                }
            }
        });




        hidden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = hidden.getText().toString();
                String compare1 = "You must get 17/20 Questions correct!. Try again.";

                if(s.equals(compare1))
                {
                    currentscore = 0;
                    iterator = 0;
                    updateScore(currentscore);
                    changeQuestion();
                    hidden.setVisibility(View.INVISIBLE);
                    tButton.setEnabled(true);
                    fButton.setEnabled(true);

                }
                else
                {
                    Intent i = new Intent(v.getContext(), congrats.class);
                    startActivity(i);
                }
            }
        });







    }

    private void changeQuestion()
    {
        question.setText(quizQuestions.questions[iterator]);
        answer = quizQuestions.answers[iterator];
        iterator++;
    }

    private void updateScore(int points)
    {
        score.setText("" + points);

    }
}

