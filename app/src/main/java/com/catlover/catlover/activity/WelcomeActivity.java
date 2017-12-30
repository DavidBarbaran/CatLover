package com.catlover.catlover.activity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.catlover.catlover.R;
import com.catlover.catlover.adapter.WelcomeAdapter;
import com.catlover.catlover.util.DesignUtil;
import com.rd.PageIndicatorView;
import com.rd.animation.type.AnimationType;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WelcomeActivity extends AppCompatActivity {

    @BindView(R.id.pageIndicatorView)
    PageIndicatorView pageIndicatorView;

    @BindView(R.id.viewpager)
    ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ButterKnife.bind(this);
        pager.setAdapter(new WelcomeAdapter(getSupportFragmentManager()));
        pageIndicatorView.setViewPager(pager);
        DesignUtil.setStatusBarTransparent(getWindow());
    }
}
