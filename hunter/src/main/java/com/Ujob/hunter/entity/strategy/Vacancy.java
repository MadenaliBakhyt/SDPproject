package com.Ujob.hunter.entity.strategy;

public class Vacancy {
    Lang lang;
    public String level;
    public String company;

    public Vacancy(String lan, String level, String company) {
        this.level = level;
        this.company = company;
        if (lan.equals("Java")){
            this.lang=new JavaDev();
        }else if (lan.equals("C++")){
            this.lang=new CPPDev();
        }
        else{
            this.lang=new CSDev();
        }
    }

    @Override
    public String toString() {
        return "Vacancy{" +
                "lang=" + lang.getlang() +
                ", level='" + level + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public String getLang() {
        return lang.getlang();
    }

    public void setLang(Lang lang) {
        this.lang = lang;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
