package com.example.tchl.mvpscreendensity.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.tchl.mvpscreendensity.R;
import com.example.tchl.mvpscreendensity.model.entity.ScreenDensity;
import com.example.tchl.mvpscreendensity.ui.common.BaseActivity;
import com.example.tchl.mvpscreendensity.ui.view.ScreenDensityView;

public class MainActivity extends BaseActivity implements ScreenDensityView, View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        findView(R.id.btn_getScreenDensity).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_getScreenDensity:
                //weatherPresenter.getWeather(cityNOInput.getText().toString().trim());
                break;
        }
    }


    @Override
    public void showError(){
        Toast.makeText(this,"showError",Toast.LENGTH_LONG);
    }

    @Override
    public void showLoading(){
        Toast.makeText(this,"showLoading",Toast.LENGTH_LONG);
    }

    @Override
    public void setScreenDensityInfo(ScreenDensity screenDensity){
        Toast.makeText(this,"setScreenDensity0",Toast.LENGTH_LONG);
    }
}
