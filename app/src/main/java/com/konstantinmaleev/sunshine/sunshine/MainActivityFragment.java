package com.konstantinmaleev.sunshine.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.fragment_main,container,false);

        ArrayList<String> fakeDataList=new ArrayList<>();
        fakeDataList.add("Today-Sunny-88/63");
        fakeDataList.add("Today-Cherry-68/63");
        fakeDataList.add("Today-Sunshine-68/63");
        fakeDataList.add("Today-Close-68/63");
        fakeDataList.add("Today-Rainy-68/42");
        fakeDataList.add("Today-Rainy-65/73");

        ArrayAdapter<String>  mForecastAdapter=
                new ArrayAdapter<String>(getActivity(),R.layout.list_item_forecast,
                        R.id.list_item_forecast_textview,fakeDataList);

        ListView lv =(ListView) rootView.findViewById(R.id.listView_forecast);
        lv.setAdapter(mForecastAdapter);

        return rootView;
    }
}
