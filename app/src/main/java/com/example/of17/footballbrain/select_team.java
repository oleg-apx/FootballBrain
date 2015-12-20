package com.example.of17.footballbrain;

import android.app.ActionBar;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ActionMenuView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class select_team extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_team);
        CreateActivityElements();
    }


    private void CreateActivityElements() { // метод создания активити элементов
        ClassTeam[] teams = classGame.getClassTeam(); // получаем массив команд из класса игры
        ; // настройка параметров отступа
        for (int i = 0; i < /*teams.length*/1; i++) { // цикл для прохода команд в приложении и создания соответствующих элементов
            ClassTeam team = teams[i];
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(35, 35);
            layoutParams.setMargins(0, 21, 0, 0);
            ImageView imageView = new ImageView(this);
            imageView.setLayoutParams(new ActionBar.LayoutParams(35, 35));
            imageView.setBackgroundResource(getResources().getIdentifier(team.getPathFlagTeam(), "drawable", getPackageName()));

            TextView textView = new TextView(this);
            LinearLayout.LayoutParams layoutParamsfortextView = new LinearLayout.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT);
            layoutParamsfortextView.setMarginStart(imageView.getId());
            layoutParamsfortextView.setMarginEnd(imageView.getId());
            textView.setLayoutParams(layoutParamsfortextView);
            textView.setText(team.getName());
            textView.setTextColor(getResources().getColor(R.color.startScreenText));
            textView.setTextSize(32);
            textView.setTypeface(null, Typeface.BOLD);
            textView.setClickable(true);
            relativeLayout.addView(imageView);
            relativeLayout.addView(textView);

        }

    }

    public ClassGame classGame = new ClassGame();
    private RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.selTeamLayout);


}
