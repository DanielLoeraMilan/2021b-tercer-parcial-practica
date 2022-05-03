package oop.exams.generator;

import oop.exams.exception.BadRegionException;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CenterLicensePlateGenerator implements LicensePlateGenerator {
    private final LicensePlateGenerator defaultLicensePlateGenerator = new DefaultLicensePlateGenerator();


    @Override
    public String generate(String state) {
        if(state=="AGU" || state=="CMX" || state=="DUR" || state=="GUA" || state=="HID" || state=="MEX" || state=="PUE" || state=="QUE" || state=="SLP" || state=="TLA" || state=="ZAC"){
            return defaultLicensePlateGenerator.generate(state);
        }else{
            throw new BadRegionException("Allowed state codes: AGU, CMX, DUR, GUA, HID, MEX, PUE, QUE, SLP, TLA, ZAC");
        }
    }
}

/*Región centro
Son de 8 caracteres
empiezan con 5
el resto son solo números aleatorios*/