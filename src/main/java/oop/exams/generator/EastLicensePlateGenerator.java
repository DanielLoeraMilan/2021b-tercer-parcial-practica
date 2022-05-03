package oop.exams.generator;

import oop.exams.exception.BadRegionException;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class EastLicensePlateGenerator implements LicensePlateGenerator {
    @Override
    public String generate(String state) {
        if(state=="CAM" || state=="ROO" || state=="TAB" || state=="VER" || state=="YUC"){
            int min = 10;
            int max = 99;
            Random random = new Random();
            int value = ThreadLocalRandom.current().nextInt(min, max)+min;
            return "3"+value + "Z";
        }else{
            throw new BadRegionException("Allowed state codes: CAM, ROO, TAB, VER, YUC");
        }
    }
}

/*Región Este (Veracruz, Tabasco, Campeche, Yucatán y Quintana Roo)
son de 4 caracteres
empiezan con 3
terminan con Z
el resto son números aleatorios*/