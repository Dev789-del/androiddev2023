package vn.edu.usth.weather;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ForecastFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View FragmentView = inflater.inflate(R.layout.fragment_forecast, container, false);
        FragmentView.setBackgroundColor(Color.parseColor("#ffffff"));
        return FragmentView;
    }
}