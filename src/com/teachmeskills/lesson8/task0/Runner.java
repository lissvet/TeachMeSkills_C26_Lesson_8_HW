package com.teachmeskills.lesson8.task0;

import com.teachmeskills.lesson8.task0.clinic.Patient;
import com.teachmeskills.lesson8.task0.clinic.Therapist;

import java.util.Scanner;
/**Create a program to simulate the work of a clinic.
 * There are three doctors in a clinic: a surgeon, an internist, and a dentist.
 * Each doctor has a "treat" method, but each doctor treats differently.
 * There is a patient class.
 * Create an object of the "Patient" class and add a treatment plan to the patient.
 * At the therapist, create a method that will assign a doctor to the patient according to the treatment plan **/
public class Runner {

    public static void main(String[] args) {
        Patient patient1 = new Patient();
        Therapist therapist = new Therapist();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the treatment plan code: ");
        patient1.docTreatPlan = scan.nextInt();
        therapist.appointDoctor(patient1);
    }

}
