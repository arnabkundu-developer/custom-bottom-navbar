package com.arnabkundu.custombottomnav;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton backButton1,backButton2,backButton3,backButton4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backButton1 = findViewById(R.id.backButton1);
        backButton2 = findViewById(R.id.backButton2);
        backButton3 = findViewById(R.id.backButton3);
        backButton4 = findViewById(R.id.backButton4);

        backButton1.setOnClickListener(this);
        backButton2.setOnClickListener(this);
        backButton3.setOnClickListener(this);
        backButton4.setOnClickListener(this);

        loadFragment(new Fragment1());
    }

    @Override
    public void onClick(View view) {
        Fragment fragment = null;
        if(view == backButton1)
        {
            fragment = new Fragment1();
        }
        if(view == backButton2)
        {
            fragment = new Fragment2();
        }
        if(view == backButton3)
        {
            fragment = new Fragment3();
        }
        if(view == backButton4)
        {
            fragment = new Fragment4();
        }
        loadFragment(fragment);
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame_layout, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}
