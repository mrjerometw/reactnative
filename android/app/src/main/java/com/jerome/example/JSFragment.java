package com.jerome.example;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.react.ReactRootView;

/**
 * Created by jerome on 2016/5/23.
 */
public class JSFragment extends Fragment {

    private ReactRootView mReactRootView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        return mReactRootView;
    }

    public void setReactRootView(ReactRootView reactRootView)
    {

        mReactRootView = reactRootView;
    }

}
