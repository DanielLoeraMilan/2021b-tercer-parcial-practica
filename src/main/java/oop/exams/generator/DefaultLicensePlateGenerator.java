package oop.exams.generator;

import oop.exams.exception.BadRegionException;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class DefaultLicensePlateGenerator implements LicensePlateGenerator {
    @Override
    public String generate(String state) {
        if(state=="AGU" || state=="CMX" || state=="DUR" || state=="GUA" || state=="HID" || state=="MEX" || state=="PUE" || state=="QUE" || state=="SLP" || state=="TLA" || state=="ZAC"){
            int min = 1000000;
            int max = 9999999;
            Random random = new Random();
            int value = ThreadLocalRandom.current().nextInt(min, max)+min;
            return "5" + value;
        }else{
            throw new BadRegionException("Allowed state codes: AGU, CMX, DUR, GUA, HID, MEX, PUE, QUE, SLP, TLA, ZAC");
        }
    }
}
