package com.catlover.catlover;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.catlover.catlover.activity.WelcomeActivity;
import com.catlover.catlover.util.DesignUtil;
import com.wang.avi.AVLoadingIndicatorView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SplashActivity extends AppCompatActivity {

    @BindView(R.id.load_view)
    AVLoadingIndicatorView loadView;

    @BindView(R.id.continue_btn)
    Button continueBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ButterKnife.bind(this);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(4000);

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            loadView.hide();
                            continueBtn.setVisibility(View.VISIBLE);
                            continueBtn.startAnimation(AnimationUtils.loadAnimation(SplashActivity.this, R.anim.slide_up));


                        }
                    });

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    @OnClick(R.id.continue_btn)
    public void actionContinue(){
        startActivity(new Intent(this, WelcomeActivity.class));
    }
}
