package com.example.sarmirey.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class GuesstheNumbers extends AppCompatActivity {

    Button firstplus;
    Button firstminus;
    Button secondplus;
    Button secondminus;
    Button thirdplus;



    Button thirdminus;
    Button fourthplus;
    Button fourthminus;
    Button fifthplus;
    Button fifthminus;



    TextView firstnum;
    TextView secondnum;
    TextView thirdnum;
    TextView fourthnum;
    TextView fifthnum;

    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;


    int currentfirstnumber = 0;
    int secondnumber = 0;
    int thirdnumber = 0;
    int fourthnumber = 0;
    int fifthnumber = 0;




    Button done;
    Button message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guessthe_numbers);

        // plus signs
        firstplus = (Button)findViewById(R.id.firstplus);
        secondplus = (Button)findViewById(R.id.secondplus);
        thirdplus = (Button)findViewById(R.id.thirdplus);
        fourthplus = (Button)findViewById(R.id.fourthplus);
        fifthplus = (Button)findViewById(R.id.fifthplus);


        //minus signs
        firstminus = (Button)findViewById(R.id.firstminus);
        secondminus = (Button)findViewById(R.id.secondminus);
        thirdminus = (Button)findViewById(R.id.thirdminus);
        fourthminus = (Button)findViewById(R.id.fourthminus);
        fifthminus = (Button)findViewById(R.id.fifthminus);

        //numbers
        firstnum = (TextView)findViewById(R.id.firsttnumber);
        firstnum.setText("" + currentfirstnumber);
        secondnum = (TextView)findViewById(R.id.secondnumber);
        secondnum.setText("" + secondnumber);
        thirdnum = (TextView)findViewById(R.id.thirdnumber);
        thirdnum.setText("" + thirdnumber);
        fourthnum = (TextView)findViewById(R.id.fourthnumber);
        fourthnum.setText("" + fourthnumber);
        fifthnum = (TextView)findViewById(R.id.fifthnumber);
        fifthnum.setText("" + fifthnumber);




        tv1 = (TextView)findViewById(R.id.firstRandom);
        tv2 = (TextView)findViewById(R.id.secondRandom);
        tv3 = (TextView)findViewById(R.id.thirdRandom);
        tv4 = (TextView)findViewById(R.id.fourthRandom);
        tv5 = (TextView)findViewById(R.id.fifthRandom);


        tv1.setText(" | " + 0 + "  |  ");
        tv2.setText("" + 0 + "  |  ");
        tv3.setText("" + 0 + "  |  ");
        tv4.setText("" + 0 + "  |  ");
        tv5.setText("" + 0 +"  |  ");


        done = (Button)findViewById(R.id.Done);
        message = (Button)findViewById(R.id.message);


        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                //r.nextInt(50);
                int firstrandom = r.nextInt(10);;
                int secondrandom = r.nextInt(10);;
                int thirdrandom = r.nextInt(10);;
                int fourthrandom = r.nextInt(10);;
                int fifthrandom = r.nextInt(10);;


                tv1 = (TextView)findViewById(R.id.firstRandom);
                tv2 = (TextView)findViewById(R.id.secondRandom);
                tv3 = (TextView)findViewById(R.id.thirdRandom);
                tv4 = (TextView)findViewById(R.id.fourthRandom);
                tv5 = (TextView)findViewById(R.id.fifthRandom);


                tv1.setText(" | " + firstrandom + "  |  ");
                tv2.setText("" + secondrandom+ "  |  ");
                tv3.setText("" + secondrandom + "  |  ");
                tv4.setText("" + fourthrandom+ "  |  ");
                tv5.setText("" + fifthrandom+"  |  ");
                done.setEnabled(false);

                if(currentfirstnumber == firstrandom)
                {
                    if(secondnumber == secondrandom)
                    {
                        if(thirdnumber == secondrandom)
                        {
                            if(fourthnumber == fourthrandom)
                            {
                                if(fifthnumber == fifthrandom)
                                {
                                    //Button message = (Button)findViewById(R.id.message);
                                    message.setVisibility(View.VISIBLE);
                                    message.setText("Congrats!!! \n You Won! \n CLICK HERE");

                                }
                            }
                        }
                    }

                }
                else
                {
                    Button message = (Button)findViewById(R.id.message);
                    message.setText("Try again");
                    message.setVisibility(View.VISIBLE);
                }

            }
        });

        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = message.getText().toString();
                String compare1 = "Try again";

                if(s.equals(compare1))
                {
                    currentfirstnumber = 0;
                    firstnum.setText("" + currentfirstnumber);
                    secondnumber = 0;
                    secondnum.setText("" + secondnumber);
                    thirdnumber = 0;
                    thirdnum.setText("" + thirdnumber);
                    fourthnumber = 0;
                    fourthnum.setText("" + fourthnumber);
                    fifthnumber = 0;
                    fifthnum.setText("" + fifthnumber);

                    tv1 = (TextView)findViewById(R.id.firstRandom);
                    tv2 = (TextView)findViewById(R.id.secondRandom);
                    tv3 = (TextView)findViewById(R.id.thirdRandom);
                    tv4 = (TextView)findViewById(R.id.fourthRandom);
                    tv5 = (TextView)findViewById(R.id.fifthRandom);


                    tv1.setText(" | " + 0 + "  |  ");
                    tv2.setText("" + 0 + "  |  ");
                    tv3.setText("" + 0 + "  |  ");
                    tv4.setText("" + 0 + "  |  ");
                    tv5.setText("" + 0 +"  |  ");

                    message.setVisibility(View.INVISIBLE);
                    done.setEnabled(true);





                }
                else
                {
                    Intent i = new Intent(v.getContext(), congrats.class);
                    startActivity(i);

                }
            }
        });





        firstplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentfirstnumber < 10)
                {
                    currentfirstnumber++;
                }
                firstnum.setText("" + currentfirstnumber);

            }
        });

        firstminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentfirstnumber > 0)
                {
                    currentfirstnumber--;
                }
                firstnum.setText("" + currentfirstnumber);

            }
        });

        secondplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(secondnumber < 10)
                {
                    secondnumber++;
                }
                secondnum.setText("" + secondnumber);

            }
        });

        secondminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(secondnumber> 0)
                {
                    secondnumber--;
                }
                secondnum.setText("" + secondnumber);

            }
        });


        thirdplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(thirdnumber < 10)
                {
                    thirdnumber++;
                }
                thirdnum.setText("" + thirdnumber );

            }
        });

        thirdminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(thirdnumber > 0)
                {
                    thirdnumber --;
                }
                thirdnum.setText("" + thirdnumber );

            }
        });

        fourthplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fourthnumber < 10)
                {
                    fourthnumber++;
                }
                fourthnum.setText("" + fourthnumber);

            }
        });

        fourthminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fourthnumber > 0)
                {
                    fourthnumber --;
                }
                fourthnum.setText("" + fourthnumber);

            }
        });

        fifthplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fifthnumber < 10)
                {
                    fifthnumber++;
                }
                fifthnum.setText("" + fifthnumber);

            }
        });

        fifthminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fifthnumber > 0)
                {
                    fifthnumber --;
                }
                fifthnum.setText("" + fifthnumber);

            }
        });

    }
}
