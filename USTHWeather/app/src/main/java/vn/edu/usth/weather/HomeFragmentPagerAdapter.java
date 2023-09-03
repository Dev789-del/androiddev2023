package vn.edu.usth.weather;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter ;
public class HomeFragmentPagerAdapter extends FragmentStateAdapter {
    private final int PAGE_COUNT = 3;
    private final String[] titles = new String[]{"Hanoi", "Paris", "Toulouse"};

    public HomeFragmentPagerAdapter(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @Override
    public Fragment createFragment(int position) {
// returns an instance of Fragment corresponding to the specified page
        switch (position) {
            case 0:
                return new WeatherAndForecastFragment();
            case 1:
                return new WeatherAndForecastFragment();
            case 2:
                return new WeatherAndForecastFragment();
        }
        return new BlankFragment(); // failsafe
    }
    @Override
    public int getItemCount() {
        return 3; // number of pages for a ViewPager
    }
}