
public class Exercise7_4 {

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
        System.out.println("List length is " + patientListStart.getLength(patientListStart));
    }
}
