
public class Patient
{
    private String name;
    private int age;
    private String illness;
    private Patient nextPatient;
    private Patient previousPatient;

    public Patient(String name, int age, String illness)
    {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.nextPatient = null;
        this.previousPatient = null;
    }

    public void addPatient(Patient newPatient) {
        if (this.nextPatient == null) {
            // this means this is the last patient in the list
            this.nextPatient = newPatient;
            newPatient.previousPatient = this;
        } else {
            this.nextPatient.addPatient(newPatient);
        }
    }
    public boolean deletePatient(Patient patient)
    {
        if (this.nextPatient == null)
        {
            // patient to remove was not found
            return false;
        }
        else if (this.nextPatient.name.equals(patient.name))
        {
            // We found it! It is the next one!
            // Now link this patient to the one after the next
            this.nextPatient = nextPatient.nextPatient;
            nextPatient.previousPatient=this;
            return true;
        }
        else
        {
            return this.nextPatient.deletePatient(patient);
        }
    }

    public int getLength(Patient myPatient)
    {
        if (myPatient.nextPatient == null) {
            return 1;
        } else {
            return getLength(myPatient.nextPatient) + 1;
        }
    }
    public void printList(Patient myPatient)
    {
        if(myPatient.nextPatient==null)
        {
            System.out.println("Patient name: " + myPatient.name + "; Patient age: " + myPatient.age + "; Patient illness: " + myPatient.illness);
        }
        else
        {
            System.out.println("Patient name: " + myPatient.name + "; Patient age: " + myPatient.age + "; Patient illness: " + myPatient.illness);
            printList(myPatient.nextPatient);
        }

    }
    public void printListTwice(Patient myPatient)
    {
        if(myPatient.nextPatient==null)
        {
            System.out.println("Patient name: " + myPatient.name + "; Patient age: " + myPatient.age + "; Patient illness: " + myPatient.illness);
            //System.out.println("Patient name: " + myPatient.nextPatient.name + "; Patient age: " + myPatient.nextPatient.age + "; Patient illness: " + myPatient.nextPatient.illness);
            System.out.println("Previous: Patient name: " + myPatient.previousPatient.name + "; Patient age: " + myPatient.previousPatient.age + "; Patient illness: " + myPatient.previousPatient.illness);
            System.out.println();
        }
        else
        {
            System.out.println("Patient name: " + myPatient.name + "; Patient age: " + myPatient.age + "; Patient illness: " + myPatient.illness);
            System.out.println("Next: Patient name: " + myPatient.nextPatient.name + "; Patient age: " + myPatient.nextPatient.age + "; Patient illness: " + myPatient.nextPatient.illness);
            //System.out.println("Patient name: " + myPatient.previousPatient.name + "; Patient age: " + myPatient.previousPatient.age + "; Patient illness: " + myPatient.previousPatient.illness);
            if(myPatient.previousPatient!=null)
            {
                System.out.println("Previous: Patient name: " + myPatient.previousPatient.name + "; Patient age: " + myPatient.previousPatient.age + "; Patient illness: " + myPatient.previousPatient.illness);
            }
            System.out.println();
            printListTwice(myPatient.nextPatient);
        }

    }

}
