package com.example.jonnygroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="jonnySearch" ;
    //    private static final Object TAG = "jonnySearch";
    TextView restart;
    TextView resume;
    TextView start;
    TextView pause;
    TextView stop;
    int countRestart = 0, countResume = 0, countStart = 0, countPause = 0, countStop = 0;
    Button resetall;
    Button resetrestart;
    Button resetstart;
    Button resetpause;
    Button resetresume;
    Button resetstop;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        restart = findViewById(R.id.onRestart);
        resume = findViewById(R.id.onResume);
        start = findViewById(R.id.onStart);
        pause = findViewById(R.id.onPause);
        stop = findViewById(R.id.onStop);
        resetall = findViewById(R.id.resetall);
        resetrestart = findViewById(R.id.clearRestart);
        resetstart = findViewById(R.id.clearStart);
        resetpause = findViewById(R.id.clearPause);
        resetresume = findViewById(R.id.clearResume);
        resetstop = findViewById(R.id.clearStop);


        resetall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetAll();
            }
        });

        resetrestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               clearRestart();
            }
        });

        resetstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearStart();
            }
        });

        resetpause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               clearPause();
            }
        });

        resetresume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearResume();
            }
        });


        resetstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearStop();
            }
        });


    }

    @Override
    protected void onStart() {

//        Log.d(TAG, "Jonny App Starting");

            Log.d(TAG, "Jonny Starting");
        countStart++;
            String x = Integer.toString(countStart);
        start.setText(x);
        super.onStart();
    }


    @Override
    protected void onResume() {
        Log.d(TAG, "jonny Resume");
//        Toast.makeText(this, "on Resume", Toast.LENGTH_SHORT).show();

        countResume++;
        String x = Integer.toString(countResume);
        resume.setText(x);
        super.onStart();

//        resume.setText(countResume++);
        super.onResume();
    }


    @Override
    protected void onPause() {
        Log.d(TAG, "jonny Pause");
//        Toast.makeText(this, "pause", Toast.LENGTH_SHORT).show();

        countPause++;
        String x = Integer.toString(countPause);
        pause.setText(x);
        super.onPause();

    }


    @Override
    protected void onStop() {

        Log.d(TAG, "jonny Stop");
//        Toast.makeText(this, "stop", Toast.LENGTH_SHORT).show();

        countStop++;
        String x = Integer.toString(countStop);
        stop.setText(x);



        super.onStop();
    }



    @Override
    protected void onRestart() {
        Log.d(TAG, "jonny Restart");
//        Toast.makeText(this, "restart", Toast.LENGTH_SHORT).show();

        countRestart++;
        String x = Integer.toString(countRestart);
        restart.setText(x);




//        restart.setText(countRestart++);
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "jonny Destroy");
//        Toast.makeText(this, "destoru", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

    public void resetAll(){
        countRestart = 0;

        countResume = 0;
        countStart = 0;
        countPause = 0;
        countStop = 0;

        restart.setText("0");
        resume.setText("0");
        start.setText("0");
        pause.setText("0");
        stop.setText("0");

    }


    public void clearRestart(){
        countRestart = 0;
        restart.setText("0");

    }

    public void clearResume(){
        countResume = 0;
        resume.setText("0");

    }


    public void clearStart(){
        countStart = 0;
        start.setText("0");
    }

    public void clearPause(){
        countPause = 0;
        pause.setText("0");
    }

    public void clearStop(){
        countStop = 0;
        stop.setText("0");
    }


}