package edu.dmacc.codedsm.hw16.objects;

public class Email implements TaskAssigner {
    @Override
    public void assignTasker() {
        System.out.println("Assign by email");
    }


}
