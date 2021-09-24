package umn.ac.id.week04b_37711;

import umn.ac.id.week04_37711.R;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


        Fragment firstFragment = new FirstFragment();
        fragmentTransaction.replace(R.id.third_activity_fragment_1, firstFragment);


        Fragment secondFragment = new Fragment();
        fragmentTransaction.replace(R.id.third_activity_fragment_2, secondFragment);
        fragmentTransaction.commit();
    }
}