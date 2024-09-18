package vn.edu.usth.weather;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class WeatherActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager2 viewPager2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("WeatherActivity ","app is created");
        tabLayout = findViewById(R.id.citytabLayout);
        viewPager2 = findViewById(R.id.viewPager2);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);

        viewPagerAdapter.addFragment(new WeatherAndForecastFragment(),getString(R.string.Hanoi));
        viewPagerAdapter.addFragment(new WeatherAndForecastFragment(),getString(R.string.Danang));
        viewPagerAdapter.addFragment(new WeatherAndForecastFragment(),getString(R.string.HaiPhong));
        
        viewPager2.setAdapter(viewPagerAdapter);
        new TabLayoutMediator(tabLayout, viewPager2, (tab, position) -> {
            tab.setText(viewPagerAdapter.getTitle(position));
        }).attach();

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