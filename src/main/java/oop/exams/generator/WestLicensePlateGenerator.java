package oop.exams.generator;

import oop.exams.exception.BadRegionException;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class WestLicensePlateGenerator implements LicensePlateGenerator {
    @Override
    public String generate(String state) {
        if(state=="COL" || state=="JAL" || state=="NAY" || state=="SIN"){
            int min = 0;
            int max = 9;
            Random random = new Random();
            int value = ThreadLocalRandom.current().nextInt(min, max)+min;
            return "2"+value+state;
        }else{
            throw new BadRegionException("Allowed state codes: COL, JAL, NAY, SIN");
        }
    }
}

/*Región Oeste (Sinaloa, Nayarit, Jalisco y Colima)
son de 5 caracteres
empiezan con 2
terminan con la abreviatura del estado
el resto son números aleatorios*/