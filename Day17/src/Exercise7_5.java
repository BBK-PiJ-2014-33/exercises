
public class Exercise7_5 {
    public static void main(String[] args)
    {
        Patient patientListStart = null;
        Patient firstPatient = new Patient("John", 33, "Tuberculosis");
        patientListStart = firstPatient;
        Patient secondPatient = new Patient("Mary", 66, "Meningitis");
        patientListStart.addPatient(secondPatient);
        Patient thirdPatient = new Patient("Anna", 23, "Cold");
        patientListStart.addPatient(thirdPatient);
        Patient fourthPatient = new Patient("Dan", 25, "Flu");
        patientListStart.addPatient(fourthPatient);
        Patient fifthPatient = new Patient("John", 42, "Ear infection");
        patientListStart.addPatient(fifthPatient);
        Patient sixthPatient = new Patient("Sam", 34, "Sore throat");
        patientListStart.addPatient(sixthPatient);
        Patient seventhPatient = new Patient("Richard", 56, "Indigestion");
        patientListStart.addPatient(seventhPatient);
        Patient eighthPatient = new Patient("Will", 39, "Broken arm");
        patientListStart.addPatient(eighthPatient);
        Patient ninthPatient = new Patient("Kim", 16, "Cold");
        patientListStart.addPatient(ninthPatient);
        Patient tenthPatient = new Patient("Adam", 21, "Broken leg");
        patientListStart.addPatient(tenthPatient);
        patientListStart.printListTwice(patientListStart);

        System.out.println();
        patientListStart.deletePatient(fifthPatient);
        patientListStart.deletePatient(eighthPatient);
        patientListStart.printListTwice(patientListStart);

        Patient eleventhPatient = new Patient("Ian", 21, "Nose bleed");
        patientListStart.addPatient(eleventhPatient);
        patientListStart.printListTwice(patientListStart);

        Patient twelfthPatient  = new Patient("Rich", 39, "Bad back");
        patientListStart.deletePatient(twelfthPatient);
    }
}

