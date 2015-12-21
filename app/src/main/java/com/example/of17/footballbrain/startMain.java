package com.example.of17.footballbrain;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class startMain extends AppCompatActivity {
    private Context cntx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_main);
        cntx = this;
        TextView startButton = (TextView)findViewById(R.id.startButton);
        TextView chooseMyTeamButton = (TextView)findViewById(R.id.addTeam);
        TextView chooseEnemyTeamButton = (TextView)findViewById(R.id.addEnemyTeam);

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
                /*
                Toast.makeText(getApplicationContext(),
                        "my team",
                        Toast.LENGTH_SHORT).show();
                        */
                Intent intent = new Intent(cntx, select_team.class);
                startActivity(intent);
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
