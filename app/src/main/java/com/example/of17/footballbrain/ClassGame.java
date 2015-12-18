package com.example.of17.footballbrain;

/**
 * Created by OF17 on 17.12.2015.
 */
public class ClassGame {



    public ClassGame(ClassTeam myTeam, ClassTeam enemyTeam){ // конструктор для выполнения игровой части
        this.myTeam = myTeam;
        this.myTeam = enemyTeam;
    }

    public ClassGame(){ // перегруженный конструктор для активити
        }


public ClassTeam[] getClassTeam(){
    return Teams;
}

    private ClassTeam[] Teams = { //Массив для работы с активити , списком команд
            new ClassTeam("eng","Англия"),
            new ClassTeam("arg","Аргентина"),
            new ClassTeam("bra","Бразилия"),
            new ClassTeam("ger","Германия"),
            new ClassTeam("spa","Испания"),
            new ClassTeam("ita","Италия"),
            new ClassTeam("rus","Россия"),
            new ClassTeam("fra","Франция")
    };


    private ClassTeam myTeam;
    private ClassTeam enemyTeam;
}
