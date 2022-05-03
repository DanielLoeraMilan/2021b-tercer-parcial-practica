package oop.exams.generator;

import oop.exams.exception.BadRegionException;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class NorthLicensePlateGenerator implements LicensePlateGenerator {
    @Override
    public String generate(String state) {
        if(state=="BCN" || state=="BCS" || state=="CHH" || state=="COA" || state=="NLE" || state=="SON" || state=="TAM"){
            int min = 10;
            int max = 99;
            Random random = new Random();
            int value = ThreadLocalRandom.current().nextInt(min, max)+min;
            return "1"+state+value;
        }else{
            throw new BadRegionException("Allowed state codes: BCN, BCS, CHH, COA, NLE, SON, TAM");
        }

    }


}


/*Region Norte (Sonora, Chihuahua, Coahuila, Nuevo León y Tamaulipas)
son de 6 caracteres
empiezan con 1
le sigue la abreviatura del estado
el resto son números aleatorios*/