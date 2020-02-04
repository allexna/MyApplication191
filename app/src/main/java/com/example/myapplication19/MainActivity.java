package com.example.myapplication19;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //return super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        TextView infoTextView=findViewById(R.id.textView);


        switch (id){
            case R.id.action_cat1:
                infoTextView.setText("Вы выбрали кота!");
                return true;
            case R.id.action_cat2:
                infoTextView.setText("Вы выбрали кошку!");
                return true;
            case R.id.action_cat3:
                infoTextView.setText("Вы выбрали котенка!");
                return true;
                default:
                    return super.onOptionsItemSelected(item);
        }

    }
    public void onSettingsMenuClick(MenuItem item){
        TextView infoTextView=findViewById(R.id.textView);
        infoTextView.setText("Вы выбрали Settings вместо кота!");

    }
}
