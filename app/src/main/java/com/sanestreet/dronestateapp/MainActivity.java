package com.sanestreet.dronestateapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    String defaultState = "Inactive";
    ListView listView;
    ArrayAdapter<String> adapter;
    ArrayList<String> arrayList;
    TextView textView;
    Date currentTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textView = findViewById(R.id.textViewState);
        listView = findViewById(R.id._dynamicList);

        String[]StateList = {};
        arrayList = new ArrayList<>(Arrays.asList(StateList));
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);

        defaultState();
        changeToFly();
        changeToInactive();
        changeToLand();

        /*FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    private void defaultState(){
        textView.setText(defaultState);
        String addItem = textView.getText().toString();
        currentTime = Calendar.getInstance().getTime();
        arrayList.add(addItem + " - " + currentTime);
        Collections.reverse(arrayList);
        adapter.notifyDataSetChanged();
    }

    private void changeToFly(){
        final String newState = "Flyver";
        Button button = findViewById(R.id.buttonFlyver);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textView.setText(newState);
                String addItem = textView.getText().toString();
                currentTime = Calendar.getInstance().getTime();
                arrayList.add(addItem + " - " + currentTime);
                adapter.notifyDataSetChanged();
                Toast.makeText(getBaseContext(), "Logged: " + newState, Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void changeToInactive(){
        final String newState = "Inactive";
        Button button = findViewById(R.id.buttonInactive);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textView.setText(newState);
                String addItem = textView.getText().toString();
                currentTime = Calendar.getInstance().getTime();
                arrayList.add(addItem + " - " + currentTime);
                adapter.notifyDataSetChanged();
                Toast.makeText(getBaseContext(), "Logged: " + newState, Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void changeToLand(){
        final String newState = "Lander";
        Button button = findViewById(R.id.buttonLand);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textView.setText(newState);
                String addItem = textView.getText().toString();
                currentTime = Calendar.getInstance().getTime();
                arrayList.add(addItem + " - " + currentTime);
                adapter.notifyDataSetChanged();
                Toast.makeText(getBaseContext(), "Logged: " + newState, Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
