package com.twu.biblioteca;

import java.util.ArrayList;

public class MainMenu {
    private ArrayList<String> userOptions;

    public MainMenu(ArrayList<String> options) {
        this.userOptions = options;
    }

    @Override
    public String toString() {
        String listOfOptions = "";
        for (String option : userOptions) {
            listOfOptions = option;
        }
        return listOfOptions;
    }
}