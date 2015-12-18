package com.example.of17.footballbrain;

/**
 * Created by OF17 on 17.12.2015.
 */
public class ClassTeam { // команда участвующая в игре


    public ClassTeam(String flagTeam, String nameTeam) {
        this.pathFlagTeam = flagTeam;
        this.nameTeam = nameTeam;
    }




public String getPathFlagTeam(){ //геттер ссылки на изображение
return "@drawable/flags/"+pathFlagTeam;
}

    private String pathFlagTeam; // ссылка на изображение флага
    private String nameTeam; // название команды

}
