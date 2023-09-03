package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
public class WeatherActivity extends AppCompatActivity {
    private static final String LOG_TAG = "WeatherActivity";
    public Toolbar toolbar;
    HomeFragmentPagerAdapter viewPagerFragmentAdapter;
    ViewPager2 viewPager2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.myToolBar);
        setSupportActionBar(toolbar);
        viewPager2 = findViewById(R.id.view_for_pager);
        viewPagerFragmentAdapter = new HomeFragmentPagerAdapter(this);
        viewPager2.setAdapter(viewPagerFragmentAdapter);
        Log.i(LOG_TAG, "onCreate");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_bar, menu);
        return true;
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