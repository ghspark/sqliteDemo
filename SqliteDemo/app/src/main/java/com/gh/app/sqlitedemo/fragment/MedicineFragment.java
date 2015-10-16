package com.gh.app.sqlitedemo.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gh.app.sqlitedemo.R;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by gaohang on 15/10/16.
 */
public class MedicineFragment extends Fragment {

    @Bind(R.id.prfl_show)
    PullToRefreshListView prfl_show;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_medicine, container, false);
        ButterKnife.bind(getActivity(), rootView);
        initView();
        return rootView;

    }

    public void initView(){

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
