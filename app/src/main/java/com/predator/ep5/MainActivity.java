package com.predator.ep5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void onrbclicked(View view){

        Boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {

            case R.id.male:
                if(checked)
                    Toast.makeText(getApplicationContext(), "MALE", Toast.LENGTH_SHORT).show();
                    break;
            case R.id.female:
                if (checked)
                    Toast.makeText(getApplicationContext(), "FEMALE", Toast.LENGTH_SHORT).show();
                    break;
        }
    }


}
