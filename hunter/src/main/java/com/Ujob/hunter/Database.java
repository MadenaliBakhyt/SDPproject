package com.Ujob.hunter;

import com.Ujob.hunter.entity.strategy.Vacancy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Database {
    private static Database database;
    private static String level;
    private static String lang;
    public static Database getDatabase(){
        if(database == null) database = new Database();
        return database;
    }
    private Database(){}

    private List<Vacancy> listOfVacancy = new ArrayList<>();

    public List<Vacancy> getListOfVacancy() {
        return listOfVacancy;
    }
    public List<Vacancy> getListOfVacancy(String level,String lang) {
        List<Vacancy> list = new ArrayList<>();
        lang=lang+" Developer";
        for (Vacancy vacancy : listOfVacancy) {

            if (Objects.equals(vacancy.getLevel(), level) && Objects.equals(vacancy.getLang(), lang)) {
                list.add(vacancy);
            }
        }
        return list;
    }

    public static String getLevel() {
        return level;
    }

    public static void setLevel(String level) {
        Database.level = level;
    }

    public static String getLang() {
        return lang;
    }

    public static void setLang(String lang) {
        Database.lang = lang;
    }

    public void addVacancy(Vacancy vacancy){
        listOfVacancy.add(vacancy);
    }
}
