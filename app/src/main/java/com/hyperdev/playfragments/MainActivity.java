package com.hyperdev.playfragments;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;

import com.hyperdev.playfragments.fragments.ColorFragment;
import com.hyperdev.playfragments.fragments.RedFragment;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    private RadioGroup mBtnColors;
    private ColorFragment mColorFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();

        mColorFragment = new ColorFragment();
    }

    private void findViews() {
        mBtnColors = (RadioGroup) findViewById(R.id.btnColors);
        mBtnColors.setOnCheckedChangeListener(this);
    }

    public void addDynamicFragment(View view) {
        RedFragment redFragment = new RedFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.red_fragment_container, redFragment)
                .commit();
    }

    public void replaceRedWithColorFragment(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.red_fragment_container, mColorFragment)
                .commit();
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, @IdRes int id) {
        switch (id) {
            case R.id.btnCyan:
                mColorFragment.changeColor(Color.CYAN);
                break;

            case R.id.btnGreen:
                mColorFragment.changeColor(Color.GREEN);
                break;

            case R.id.btnYellow:
                mColorFragment.changeColor(Color.YELLOW);
                break;
        }
    }
}
