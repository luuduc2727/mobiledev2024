package vn.edu.usth.weather;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("WeatherActivity ","app is created");
        View main = findViewById(R.id.main);
        main.setBackgroundColor(0xFF0000);
        ForecastFragment forecastFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(
                R.id.container, forecastFragment).commit();

    };
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("WeatherActivity ","app is started");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("WeatherActivity ","app is resumed");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("WeatherActivity ","app is paused");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("WeatherActivity ","app is stopped");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("WeatherActivity ","app is destroyed");
    }





}