package oop.exams.generator;

import oop.exams.exception.BadRegionException;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SouthLicensePlateGenerator implements LicensePlateGenerator {
    @Override
    public String generate(String state) {
        if(state=="CHP" || state=="GRO" || state=="MIC" || state=="OAX"){
            int min = 100;
            int max = 999;
            Random random = new Random();
            int value = ThreadLocalRandom.current().nextInt(min, max)+min;
            return "4"+state+value;
        }else{
            throw new BadRegionException("Allowed state codes: CHP, GRO, MIC, OAX");
        }
    }
}

/*Región Sur (Michoacán, Guerrero, Oaxaca, Chiapas)
son de 7 caracteres
empiezan con 4
en alguna parte contienen la abreviatura del estado*/