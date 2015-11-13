package org.missioncollege.cis63_abcflash;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;
import android.view.ViewGroup;
import java.util.Random;


public class small extends Activity {



    Button button0, button1, button2, button3,button4, button5, button6, button7, button8, button9,button10,
            button11, button12, button13,button14, button15, button16, button17, button18, button19,button20,
            button21, button22, button23,button24, button25, button26, button27;

    Button expectedBtn;
    int qestionMode = 0;


    small thisMainActivity;

    private static AudioPlayer m_player=new AudioPlayer();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_small);
        thisMainActivity = this;

        button0 = (Button) findViewById(R.id.btnBig);
        button1 = (Button) findViewById(R.id.btna);
        button2 = (Button) findViewById(R.id.btnb);
        button3 = (Button) findViewById(R.id.btnc);
        button4 = (Button) findViewById(R.id.btnd);
        button5 = (Button) findViewById(R.id.btne);
        button6 = (Button) findViewById(R.id.btnf);
        button7 = (Button) findViewById(R.id.btng);
        button8 = (Button) findViewById(R.id.btnh);
        button9 = (Button) findViewById(R.id.btni);
        button10 = (Button) findViewById(R.id.btnj);
        button11 = (Button) findViewById(R.id.btnk);
        button12 = (Button) findViewById(R.id.btnl);
        button13 = (Button) findViewById(R.id.btnm);
        button14 = (Button) findViewById(R.id.btnn);
        button15 = (Button) findViewById(R.id.btno);
        button16 = (Button) findViewById(R.id.btnp);
        button17 = (Button) findViewById(R.id.btnq );
        button18 = (Button) findViewById(R.id.btnr);
        button19 = (Button) findViewById(R.id.btns);
        button20 = (Button) findViewById(R.id.btnt);
        button21 = (Button) findViewById(R.id.btnu);
        button22= (Button) findViewById(R.id.btnv);
        button23= (Button) findViewById(R.id.btnw);
        button24 = (Button) findViewById(R.id.btnx);
        button25 = (Button) findViewById(R.id.btny);
        button26 = (Button) findViewById(R.id.btnz);
        button27 = (Button) findViewById(R.id.btntest);

        button0.setOnClickListener(btn0ls);
        button1.setOnClickListener(btn1ls);
        button2.setOnClickListener(btn2ls);
        button3.setOnClickListener(btn3ls);
        button4.setOnClickListener(btn4ls);
        button5.setOnClickListener(btn5ls);
        button6.setOnClickListener(btn6ls);
        button7.setOnClickListener(btn7ls);
        button8.setOnClickListener(btn8ls);
        button9.setOnClickListener(btn9ls);
        button10.setOnClickListener(btn10ls);
        button11.setOnClickListener(btn11ls);
        button12.setOnClickListener(btn12ls);
        button13.setOnClickListener(btn13ls);
        button14.setOnClickListener(btn14ls);
        button15.setOnClickListener(btn15ls);
        button16.setOnClickListener(btn16ls);
        button17.setOnClickListener(btn17ls);
        button18.setOnClickListener(btn18ls);
        button19.setOnClickListener(btn19ls);
        button20.setOnClickListener(btn20ls);
        button21.setOnClickListener(btn21ls);
        button22.setOnClickListener(btn22ls);
        button23.setOnClickListener(btn23ls);
        button24.setOnClickListener(btn24ls);
        button25.setOnClickListener(btn25ls);
        button26.setOnClickListener(btn26ls);
        button27.setOnClickListener(btn27ls);


    }

    Button.OnClickListener btn0ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (qestionMode == 1)
            {
                m_player.play(thisMainActivity.getApplicationContext(), R.raw.tryagain);
                //qestionMode = 0;
            }
            else {
                startActivity(new Intent(small.this, MainActivity.class));
            }
        }
    };


    Button.OnClickListener btn1ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (qestionMode == 1)
            {
                if(button1 == expectedBtn)
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.goodjob);
                    flashCard(R.drawable.flashcarda);
                    qestionMode = 0;
                }
                else
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.tryagain);
                }


            }
            else {
                m_player.play(thisMainActivity.getApplicationContext(), R.raw.asound);
                flashCard(R.drawable.flashcarda);
            }

        }
    };

    Button.OnClickListener btn2ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (qestionMode == 1)
            {
                if(button2 == expectedBtn)
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.goodjob);
                    flashCard(R.drawable.flashcardb);
                    qestionMode = 0;
                }
                else
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.tryagain);
                }


            }
            else {
                m_player.play(thisMainActivity.getApplicationContext(), R.raw.bsound);
                flashCard(R.drawable.flashcardb);
            }

        }
    };


    Button.OnClickListener btn3ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (qestionMode == 1)
            {
                if(button3 == expectedBtn)
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.goodjob);
                    flashCard(R.drawable.flashcardc);
                    qestionMode = 0;
                }
                else
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.tryagain);
                }


            }
            else {
                m_player.play(thisMainActivity.getApplicationContext(), R.raw.csound);
                flashCard(R.drawable.flashcardc);
            }

        }
    };
    Button.OnClickListener btn4ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (qestionMode == 1)
            {
                if(button4 == expectedBtn)
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.goodjob);
                    flashCard(R.drawable.flashcardd);
                    qestionMode = 0;
                }
                else
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.tryagain);
                }
                //flashCard(R.drawable.flashcarda);

            }
            else {
                m_player.play(thisMainActivity.getApplicationContext(), R.raw.dsound);
                flashCard(R.drawable.flashcardd);
            }


        }
    };
    Button.OnClickListener btn5ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (qestionMode == 1)
            {
                if(button5 == expectedBtn)
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.goodjob);
                    flashCard(R.drawable.flashcarde);
                    qestionMode = 0;
                }
                else
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.tryagain);
                }
                //flashCard(R.drawable.flashcarda);
                // qestionMode = 0;
            }
            else {
                m_player.play(thisMainActivity.getApplicationContext(), R.raw.esound);
                flashCard(R.drawable.flashcarde);
            }


        }
    };

    Button.OnClickListener btn6ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (qestionMode == 1)
            {
                if(button6 == expectedBtn)
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.goodjob);
                    flashCard(R.drawable.flashcardf);
                    qestionMode = 0;
                }
                else
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.tryagain);
                }
                //flashCard(R.drawable.flashcarda);
                // qestionMode = 0;
            }
            else {
                m_player.play(thisMainActivity.getApplicationContext(), R.raw.fsound);
                flashCard(R.drawable.flashcardf);
            }


        }
    };
    Button.OnClickListener btn7ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (qestionMode == 1)
            {
                if(button7 == expectedBtn)
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.goodjob);
                    flashCard(R.drawable.flashcardg);
                    qestionMode = 0;
                }
                else
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.tryagain);
                }
                //flashCard(R.drawable.flashcarda);
                //qestionMode = 0;
            }
            else {
                m_player.play(thisMainActivity.getApplicationContext(), R.raw.gsound);
                flashCard(R.drawable.flashcardg);
            }


        }
    };
    Button.OnClickListener btn8ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (qestionMode == 1)
            {
                if(button8 == expectedBtn)
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.goodjob);
                    flashCard(R.drawable.flashcardh);
                    qestionMode = 0;
                }
                else
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.tryagain);
                }
                //flashCard(R.drawable.flashcarda);
                //qestionMode = 0;
            }
            else {
                m_player.play(thisMainActivity.getApplicationContext(), R.raw.hsound);
                flashCard(R.drawable.flashcardh);
            }


        }
    };

    Button.OnClickListener btn9ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (qestionMode == 1)
            {
                if(button9 == expectedBtn)
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.goodjob);
                    flashCard(R.drawable.flashcardi);
                    qestionMode = 0;
                }
                else
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.tryagain);
                }
                //flashCard(R.drawable.flashcarda);
                // qestionMode = 0;
            }
            else {
                m_player.play(thisMainActivity.getApplicationContext(), R.raw.isound);
                flashCard(R.drawable.flashcardi);
            }


        }
    };
    Button.OnClickListener btn10ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (qestionMode == 1)
            {
                if(button10 == expectedBtn)
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.goodjob);
                    flashCard(R.drawable.flashcardj);
                    qestionMode = 0;
                }
                else
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.tryagain);
                }
                //flashCard(R.drawable.flashcarda);
                // qestionMode = 0;
            }
            else {
                m_player.play(thisMainActivity.getApplicationContext(), R.raw.jsound);
                flashCard(R.drawable.flashcardj);
            }


        }
    };
    Button.OnClickListener btn11ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (qestionMode == 1)
            {
                if(button11 == expectedBtn)
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.goodjob);
                    flashCard(R.drawable.flashcardk);
                    qestionMode = 0;
                }
                else
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.tryagain);
                }
                //flashCard(R.drawable.flashcarda);
                // qestionMode = 0;
            }
            else {
                m_player.play(thisMainActivity.getApplicationContext(), R.raw.ksound);
                flashCard(R.drawable.flashcardk);
            }


        }
    };

    Button.OnClickListener btn12ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (qestionMode == 1)
            {
                if(button12 == expectedBtn)
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.goodjob);
                    flashCard(R.drawable.flashcardl);
                    qestionMode = 0;
                }
                else
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.tryagain);
                }
                //flashCard(R.drawable.flashcarda);
                //qestionMode = 0;
            }
            else {
                m_player.play(thisMainActivity.getApplicationContext(), R.raw.lsound);
                flashCard(R.drawable.flashcardl);
            }


        }
    };


    Button.OnClickListener btn13ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (qestionMode == 1)
            {
                if(button13 == expectedBtn)
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.goodjob);
                    flashCard(R.drawable.flashcardm);
                    qestionMode = 0;
                }
                else
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.tryagain);
                }
                //flashCard(R.drawable.flashcarda);
                // qestionMode = 0;
            }
            else {
                m_player.play(thisMainActivity.getApplicationContext(), R.raw.msound);
                flashCard(R.drawable.flashcardm);
            }


        }
    };
    Button.OnClickListener btn14ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (qestionMode == 1)
            {
                if(button14 == expectedBtn)
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.goodjob);
                    flashCard(R.drawable.flashcardn);
                    qestionMode = 0;
                }
                else
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.tryagain);
                }
                //flashCard(R.drawable.flashcarda);
                //qestionMode = 0;
            }
            else {
                m_player.play(thisMainActivity.getApplicationContext(), R.raw.nsound);
                flashCard(R.drawable.flashcardn);
            }


        }
    };
    Button.OnClickListener btn15ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (qestionMode == 1)
            {
                if(button15 == expectedBtn)
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.goodjob);
                    flashCard(R.drawable.flashcardo);
                    qestionMode = 0;
                }
                else
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.tryagain);
                }
                //flashCard(R.drawable.flashcarda);
                //qestionMode = 0;
            }
            else {
                m_player.play(thisMainActivity.getApplicationContext(), R.raw.osound);
                flashCard(R.drawable.flashcardo);
            }


        }
    };

    Button.OnClickListener btn16ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (qestionMode == 1)
            {
                if(button16 == expectedBtn)
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.goodjob);
                    flashCard(R.drawable.flashcardp);
                    qestionMode = 0;
                }
                else
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.tryagain);
                }
                //flashCard(R.drawable.flashcarda);
                // qestionMode = 0;
            }
            else {
                m_player.play(thisMainActivity.getApplicationContext(), R.raw.psound);
                flashCard(R.drawable.flashcardp);
            }


        }
    };
    Button.OnClickListener btn17ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (qestionMode == 1)
            {
                if(button17 == expectedBtn)
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.goodjob);
                    flashCard(R.drawable.flashcardq);
                    qestionMode = 0;
                }
                else
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.tryagain);
                }
                //flashCard(R.drawable.flashcarda);
                // qestionMode = 0;
            }
            else {
                m_player.play(thisMainActivity.getApplicationContext(), R.raw.qsound);
                flashCard(R.drawable.flashcardq);
            }


        }
    };
    Button.OnClickListener btn18ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (qestionMode == 1)
            {
                if(button18 == expectedBtn)
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.goodjob);
                    flashCard(R.drawable.flashcardr);
                    qestionMode = 0;
                }
                else
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.tryagain);
                }
                //flashCard(R.drawable.flashcarda);
                // qestionMode = 0;
            }
            else {
                m_player.play(thisMainActivity.getApplicationContext(), R.raw.rsound);
                flashCard(R.drawable.flashcardr);
            }


        }
    };

    Button.OnClickListener btn19ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (qestionMode == 1)
            {
                if(button19 == expectedBtn)
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.goodjob);
                    flashCard(R.drawable.flashcards);
                    qestionMode = 0;
                }
                else
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.tryagain);
                }
                //flashCard(R.drawable.flashcarda);
                // qestionMode = 0;
            }
            else {
                m_player.play(thisMainActivity.getApplicationContext(), R.raw.ssound);
                flashCard(R.drawable.flashcards);
            }


        }
    };
    Button.OnClickListener btn20ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (qestionMode == 1)
            {
                if(button20 == expectedBtn)
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.goodjob);
                    flashCard(R.drawable.flashcardt);
                    qestionMode = 0;
                }
                else
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.tryagain);
                }
                //flashCard(R.drawable.flashcarda);
                // qestionMode = 0;
            }
            else {
                m_player.play(thisMainActivity.getApplicationContext(), R.raw.tsound);
                flashCard(R.drawable.flashcardt);
            }


        }
    };

    Button.OnClickListener btn21ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (qestionMode == 1)
            {
                if(button21 == expectedBtn)
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.goodjob);
                    flashCard(R.drawable.flashcardu);
                    qestionMode = 0;
                }
                else
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.tryagain);
                }
                //flashCard(R.drawable.flashcarda);
                // qestionMode = 0;
            }
            else {
                m_player.play(thisMainActivity.getApplicationContext(), R.raw.usound);
                flashCard(R.drawable.flashcardu);
            }


        }
    };

    Button.OnClickListener btn22ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (qestionMode == 1)
            {
                if(button22 == expectedBtn)
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.goodjob);
                    flashCard(R.drawable.flashcardv);
                    qestionMode = 0;
                }
                else
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.tryagain);
                }
                //flashCard(R.drawable.flashcarda);
                // qestionMode = 0;
            }
            else {
                m_player.play(thisMainActivity.getApplicationContext(), R.raw.vsound);
                flashCard(R.drawable.flashcardv);
            }


        }
    };


    Button.OnClickListener btn23ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (qestionMode == 1)
            {
                if(button23 == expectedBtn)
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.goodjob);
                    flashCard(R.drawable.flashcardw);
                    qestionMode = 0;
                }
                else
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.tryagain);
                }
                //flashCard(R.drawable.flashcarda);
                //qestionMode = 0;
            }
            else {
                m_player.play(thisMainActivity.getApplicationContext(), R.raw.wsound);
                flashCard(R.drawable.flashcardw);
            }


        }
    };
    Button.OnClickListener btn24ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (qestionMode == 1)
            {
                if(button24 == expectedBtn)
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.goodjob);
                    flashCard(R.drawable.flashcardx);
                    qestionMode = 0;
                }
                else
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.tryagain);
                }
                //flashCard(R.drawable.flashcarda);
                //qestionMode = 0;
            }
            else {
                m_player.play(thisMainActivity.getApplicationContext(), R.raw.xsound);
                flashCard(R.drawable.flashcardx);
            }


        }
    };
    Button.OnClickListener btn25ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (qestionMode == 1)
            {
                if(button25 == expectedBtn)
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.goodjob);
                    flashCard(R.drawable.flashcardy);
                    qestionMode = 0;
                }
                else
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.tryagain);
                }
                //flashCard(R.drawable.flashcarda);
                // qestionMode = 0;
            }
            else {
                m_player.play(thisMainActivity.getApplicationContext(), R.raw.ysound);
                flashCard(R.drawable.flashcardy);
            }


        }
    };

    Button.OnClickListener btn26ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (qestionMode == 1)
            {
                if(button26 == expectedBtn)
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.goodjob);
                    flashCard(R.drawable.flashcardz);
                    qestionMode = 0;
                }
                else
                {
                    m_player.play(thisMainActivity.getApplicationContext(), R.raw.tryagain);
                }
                //flashCard(R.drawable.flashcarda);
                //  qestionMode = 0;
            }
            else {
                m_player.play(thisMainActivity.getApplicationContext(), R.raw.zsound);
                flashCard(R.drawable.flashcardz);
            }


        }
    };

    Button.OnClickListener btn27ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            Integer[] raw = {R.raw.asound, R.raw.bsound, R.raw.csound, R.raw.dsound, R.raw.esound, R.raw.fsound,
                    R.raw.gsound, R.raw.hsound, R.raw.isound, R.raw.jsound, R.raw.ksound, R.raw.lsound, R.raw.msound,
                    R.raw.nsound, R.raw.osound, R.raw.psound, R.raw.qsound, R.raw.rsound, R.raw.ssound, R.raw.tsound,
                    R.raw.usound, R.raw.vsound, R.raw.wsound, R.raw.xsound, R.raw.ysound, R.raw.zsound};
            Button[] button = {button1, button2, button3, button4, button5, button6, button7, button8, button9, button10,
                    button11, button12, button13, button14, button15, button16, button17, button18, button19, button20,
                    button21, button22, button23, button24, button25, button26};
            MediaPlayer m_player_1 = MediaPlayer.create(thisMainActivity.getApplicationContext(), R.raw.whichonepcm);

            // m_player.play(thisMainActivity.getApplicationContext(), R.raw.whichonepcm);
            m_player_1.start();

            Random random = new Random();
            int index =0xff;
            index = random.nextInt(26);
            MediaPlayer m_player_2 = MediaPlayer.create(thisMainActivity.getApplicationContext(), raw[index]);
            expectedBtn = button[index];
            m_player_1.setNextMediaPlayer(m_player_2);
            qestionMode = 1;

            // button0.setOnClickListener(btn_test);
            button1.setOnClickListener(btn1ls);
            button2.setOnClickListener(btn2ls);
            button3.setOnClickListener(btn3ls);
            button4.setOnClickListener(btn4ls);
            button5.setOnClickListener(btn5ls);
            button6.setOnClickListener(btn6ls);
            button7.setOnClickListener(btn7ls);
            button8.setOnClickListener(btn8ls);
            button9.setOnClickListener(btn9ls);
            button10.setOnClickListener(btn10ls);
            button11.setOnClickListener(btn11ls);
            button12.setOnClickListener(btn12ls);
            button13.setOnClickListener(btn13ls);
            button14.setOnClickListener(btn14ls);
            button15.setOnClickListener(btn15ls);
            button16.setOnClickListener(btn16ls);
            button17.setOnClickListener(btn17ls);
            button18.setOnClickListener(btn18ls);
            button19.setOnClickListener(btn19ls);
            button20.setOnClickListener(btn20ls);
            button21.setOnClickListener(btn21ls);
            button22.setOnClickListener(btn22ls);
            button23.setOnClickListener(btn23ls);
            button24.setOnClickListener(btn24ls);
            button25.setOnClickListener(btn25ls);
            button26.setOnClickListener(btn26ls);
            //   button27.setOnClickListener(btn27ls);
        }

    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void flashCard(int resid){
        Intent intent = new Intent(this,card.class);
        intent.putExtra("picname", resid);
        startActivity(intent);
    }







}