package com.app.coinally.in.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.app.coinally.in.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class OrderFragment extends Fragment {
    View view;
    Context mcontext;

    List<TextView> moreScreenOptions;

//    @BindViews(R.id.more_btn_logout)
//    Button logout;


    public static OrderFragment newInstance() {
        OrderFragment fragment = new OrderFragment();
        return fragment;
    }

    private static final String TAG = OrderFragment.class.getSimpleName();
    private static ArrayList<ArrayList<String>> biDemArrList = new ArrayList<ArrayList<String>>();

    public OrderFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int j;
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.activity_main, container, false);
        mcontext = getActivity();
        //ButterKnife.bind(this, view);



//Custom font for Alert Dialog********************************************************


        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
    /*@Override
    public void onClick(View view) {
        Log.d("working...", "--->"+view);
        if (view == moreScreenOptions.get(0)) {
            Intent webPage = new Intent(getActivity(), WebviewMoreActivity.class);
            webPage.putExtra("url","https://google.com");
            startActivity(webPage);
        } else if (view == moreScreenOptions.get(1)) {
            Intent webPage = new Intent(getContext(), WebviewMoreActivity.class);
            webPage.putExtra("url","https://google.com");
            startActivity(webPage);
        } else if (view == moreScreenOptions.get(2)) {
            Intent webPage = new Intent(getContext(), WebviewMoreActivity.class);
            webPage.putExtra("url","https://google.com");
            startActivity(webPage);
        } else if (view == moreScreenOptions.get(3)) {
            Intent webPage = new Intent(getContext(), WebviewMoreActivity.class);
            webPage.putExtra("url","https://google.com");
            startActivity(webPage);
        } else if (view == moreScreenOptions.get(4)) {
            Intent webPage = new Intent(getContext(), WebviewMoreActivity.class);
            webPage.putExtra("url","https://google.com");
            startActivity(webPage);
        } else if (view == moreScreenOptions.get(5)) {
            Intent webPage = new Intent(getContext(), WebviewMoreActivity.class);
            webPage.putExtra("url","https://google.com");
            startActivity(webPage);
        } else if (view == moreScreenOptions.get(6)) {
            Intent webPage = new Intent(getContext(), WebviewMoreActivity.class);
            webPage.putExtra("url","https://google.com");
            startActivity(webPage);
        }
    }*/
}