package edu.dmacc.codedsm.hw16.objects;

public class Phone implements TaskAssigner {
    @Override
    public void assignTasker() {
        System.out.println("Assign by phone");
    }
}
