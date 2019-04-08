package edu.dmacc.codedsm.hw16;

import edu.dmacc.codedsm.hw16.objects.Email;
import edu.dmacc.codedsm.hw16.objects.Phone;
import edu.dmacc.codedsm.hw16.objects.Person;

public class Runner {

    public static void main(String[] args) {

        Email email = new Email();
        email.assignTasker();
        Phone phone = new Phone();
        phone.assignTasker();
        Person person = new Person();
        person.assignTasker();

    }
}
