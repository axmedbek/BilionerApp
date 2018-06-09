package com.axmedbek.bilioner;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by User on 6/8/2018.
 */

public class MenuActivity extends Activity {

    Button newGameBtn , optionsBtn , aboutBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);
    }
    public void findAction(View v){
        switch (v.getId()){
            case R.id.newGameBtn :
                startActivity(new Intent(getApplicationContext(),NewGameActivity.class));
                break;
            case R.id.optionsBtn :
                startActivity(new Intent(getApplicationContext(),OptionsActivity.class));
                break;
            case R.id.aboutBtn :
                startActivity(new Intent(getApplicationContext(),AboutActivity.class));
                break;
        }
    }
}
