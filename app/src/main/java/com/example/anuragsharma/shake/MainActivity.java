package com.example.anuragsharma.shake;

import android.graphics.Color;
import android.graphics.Typeface;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.seismic.ShakeDetector;

import java.util.Random;


public class MainActivity extends AppCompatActivity implements ShakeDetector.Listener {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        ShakeDetector sd = new ShakeDetector(this);
        sd.start(sensorManager);


        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
         tv = (TextView)findViewById(R.id.textview);
        tv.setTextColor(Color.parseColor("#000000"));

    }

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
        if (id == R.id.action_exit) {
            finish();
            System.exit(0);

        }

        return super.onOptionsItemSelected(item);
    }

    public void hearShake() {

        Random randomno = new Random();

        int x=randomno.nextInt(100);
        if(x<10) {
            Typeface myTypeface = Typeface.createFromAsset(getAssets(), "fonts/Boldie.ttf");
            tv.setTypeface(myTypeface);
            tv.setText(R.string.s1);
            View root = tv.getRootView();
            root.setBackgroundColor(Color.RED);
            tv.setTextColor(Color.parseColor("#ffffff"));
        }
        else if(x>=10 && x<20) {
            Typeface myTypeface = Typeface.createFromAsset(getAssets(), "fonts/CoarseRounded.otf");
            tv.setTypeface(myTypeface);
            tv.setText(R.string.s2);
            View root = tv.getRootView();
            root.setBackgroundColor(Color.CYAN);
            tv.setTextColor(Color.parseColor("#000000"));
        }
        else if(x>=20 && x<30) {
            Typeface myTypeface = Typeface.createFromAsset(getAssets(), "fonts/Impregnable_Personal_Use_Only.ttf");
            tv.setTypeface(myTypeface);
            tv.setText(R.string.s3);
            View root = tv.getRootView();
            root.setBackgroundColor(Color.BLUE);
            tv.setTextColor(Color.parseColor("#ffffff"));
        }
        else if(x>=30 && x<40) {
            Typeface myTypeface = Typeface.createFromAsset(getAssets(), "fonts/Queen_Leela.ttf");
            tv.setTypeface(myTypeface);
            tv.setText(R.string.s4);
            View root = tv.getRootView();
            root.setBackgroundColor(Color.GRAY);
        }
        else if(x>=40 && x<50) {
            Typeface myTypeface = Typeface.createFromAsset(getAssets(), "fonts/Impregnable_Personal_Use_Only.ttf");
            tv.setTypeface(myTypeface);
            tv.setText(R.string.s5);
            View root = tv.getRootView();
            root.setBackgroundColor(Color.RED);
            tv.setTextColor(Color.parseColor("#ffffff"));
        }
        else if(x>=50 && x<60) {
            Typeface myTypeface = Typeface.createFromAsset(getAssets(), "fonts/Queen_Leela.ttf");
            tv.setTypeface(myTypeface);
            tv.setText(R.string.s6);
            View root = tv.getRootView();
            root.setBackgroundColor(Color.YELLOW);
            tv.setTextColor(Color.parseColor("#000000"));
        }
        else if(x>=60 && x<70) {
            Typeface myTypeface = Typeface.createFromAsset(getAssets(), "fonts/Boldie.ttf");
            tv.setTypeface(myTypeface);
            tv.setText(R.string.s7);
            View root = tv.getRootView();
            root.setBackgroundColor(Color.GREEN);
            tv.setTextColor(Color.parseColor("#ffffff"));
        }
        else if(x>=70 && x<80) {
            Typeface myTypeface = Typeface.createFromAsset(getAssets(), "fonts/Queen_Leela.ttf");
            tv.setTypeface(myTypeface);
            tv.setText(R.string.s8);
            View root = tv.getRootView();
            root.setBackgroundColor(Color.LTGRAY);
            tv.setTextColor(Color.parseColor("#ffffff"));
        }
        else if(x>=80 && x<90) {
            Typeface myTypeface = Typeface.createFromAsset(getAssets(), "fonts/CoarseRounded.otf");
            tv.setTypeface(myTypeface);
            tv.setText(R.string.s9);
            View root = tv.getRootView();
            root.setBackgroundColor(Color.MAGENTA);
            tv.setTextColor(Color.parseColor("#ffffff"));
        }
        else if(x>=90 && x<100) {
            Typeface myTypeface = Typeface.createFromAsset(getAssets(), "fonts/Impregnable_Personal_Use_Only.ttf");
            tv.setTypeface(myTypeface);
            tv.setText(R.string.s10);
            View root = tv.getRootView();
            root.setBackgroundColor(Color.DKGRAY);
            tv.setTextColor(Color.parseColor("#ffffff"));
        }


    }
}
