package com.twu.biblioteca;

import java.util.ArrayList;

public class MainMenu {
    private ArrayList<String> userOptions;

    public MainMenu(ArrayList<String> options) {
        this.userOptions = options;
    }

    public void displayUserOptions() {
        for (String userOption : userOptions) {
            System.out.println(userOption);
        }
    }
}