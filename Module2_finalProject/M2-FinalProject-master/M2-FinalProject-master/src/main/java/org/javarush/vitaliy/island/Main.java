package org.javarush.vitaliy.island;

import org.javarush.vitaliy.island.config.AppConfigurator;


public class Main {
    public static void main(String[] args) {

        AppConfigurator.getInstance().init();

    }
}