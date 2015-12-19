package com.example.of17.footballbrain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class startMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_main);

        TextView startButton = (TextView)findViewById(R.id.startButton);
        TextView exitButton = (TextView)findViewById(R.id.exitButton);
        TextView chooseMyTeamButton = (TextView)findViewById(R.id.addTeam);
        TextView chooseEnemyTeamButton = (TextView)findViewById(R.id.addEnemyTeam);

        exitButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });

        startButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "start",
                        Toast.LENGTH_SHORT).show();
            }
        });

        chooseMyTeamButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "my team",
                        Toast.LENGTH_SHORT).show();
            }
        });

        chooseEnemyTeamButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "enemy team",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
