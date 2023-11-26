package com.teachmeskills.lesson8.task0.clinic;

public class Therapist implements IDoctor{

    public void appointDoctor(Patient pat){
        if (pat.docTreatPlan == 1){
            IDoctor surgeon = new Surgeon();
            System.out.println("You've been assigned a surgeon");
            surgeon.treat();
            pat.doc = "surgeon";
        } else if(pat.docTreatPlan == 2){
            IDoctor dentist = new Dentist();
            dentist.treat();
            System.out.println("You have a dentist appointment");
            pat.doc = "dentist";
        } else if(pat.docTreatPlan <= 0){
            System.out.println("Incorrect treatment plan code.");
        } else {
            System.out.println("Your therapist will continue your treatment");
            this.treat();
            pat.doc = "therapist";
        }
    }

    public void treat(){
        System.out.println("Treated by a therapist");
    }

}
