package edu.dmacc.codedsm.hw16.objects;

public class Person implements TaskAssigner {
    @Override
    public void assignTasker() {
        System.out.println("assign by person");
    }
}
