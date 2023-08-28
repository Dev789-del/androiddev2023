package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
public class WeatherActivity extends AppCompatActivity {
    private static final String LOG_TAG = "WeatherActivity";
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Create a new Fragment to be placed in the activity layout
        ForecastFragment firstFragment = new ForecastFragment();
        // Add the fragment to the 'container' FrameLayout
        View frameworkLayout = findViewById(R.id.frame_layout);
        getSupportFragmentManager().beginTransaction().add(R.id.frame_layout, firstFragment).commit();
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.myToolBar);
        setSupportActionBar(toolbar);
        Log.i(LOG_TAG, "onCreate");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i(LOG_TAG, "onStart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i(LOG_TAG, "onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i(LOG_TAG, "onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i(LOG_TAG, "onStop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(LOG_TAG, "onDestroy");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(LOG_TAG, "onDestroy");
    }
}