import java.io.*;
import java.util.*;
import java.util.Calendar;


class staff
{
    String sid, sname, desg, sex;
    int salary;
    void new_staff()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("id:-");
        sid = input.nextLine();

        System.out.print("name:-");
        sname = input.nextLine();

        System.out.print("desigination:-");
        desg = input.nextLine();

        System.out.print("sex:-");
        sex = input.nextLine();

        System.out.print("salary:-");
        salary = input.nextInt();
    }

    void staff_info()

    {
        System.out.println(sid + "\t" + sname + "\t" + sex + "\t" + salary);
    }

}

class doctor

{
    String did, dname, specilist, appoint, doc_qual;
    int droom;
    void new_doctor()

    {
        Scanner input = new Scanner(System.in);

        System.out.print("id:-");
        did = input.nextLine();

        System.out.print("name:-");
        dname = input.nextLine();

        System.out.print("specilization:-");
        specilist = input.nextLine();

        System.out.print("work time:-");
        appoint = input.nextLine();

        System.out.print("qualification:-");
        doc_qual = input.nextLine();

        System.out.print("room no.:-");
        droom = input.nextInt();

    }

    void doctor_info()

    {
        System.out.println(did + "\t" + dname + "  \t" + specilist + "     \t" + appoint + "    \t" + doc_qual + "       \t" + droom);

    }
}

class patient

{
    String pid, pname, disease, sex, admit_status;
    int age;
    void new_patient()

    {
        Scanner input = new Scanner(System.in);

        System.out.print("id:-");
        pid = input.nextLine();

        System.out.print("name:-");
        pname = input.nextLine();

        System.out.print("disease:-");
        disease = input.nextLine();

        System.out.print("sex:-");
        sex = input.nextLine();

        System.out.print("admit_status:-");
        admit_status = input.nextLine();

        System.out.print("age:-");
        age = input.nextInt();

    }

    void patient_info()
    {
        System.out.println(pid + "\t" + pname + " \t" + disease + "     \t" + sex + "      \t" + admit_status + "\t" + age);
    }
}

class medical

{
    String med_name, med_comp, exp_date;
    int med_cost, count;
    void new_medi()
    {

        Scanner input = new Scanner(System.in);

        System.out.print("name:-");
        med_name = input.nextLine();

        System.out.print("comp:-");
        med_comp = input.nextLine();

        System.out.print("exp_date:-");
        exp_date = input.nextLine();

        System.out.print("cost:-");
        med_cost = input.nextInt();

        System.out.print("no of unit:-");
        count = input.nextInt();

    }

    void find_medi()
    {
        System.out.println(med_name + "  \t" + med_comp + "    \t" + exp_date + "     \t" + med_cost);
    }
}

class lab

{
    String facility;
    int lab_cost;
    void new_feci()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("facility:-");
        facility = input.nextLine();

        System.out.print("cost:-");
        lab_cost = input.nextInt();

    }

    void feci_list()
    {
        System.out.println(facility + "\t\t" + lab_cost);

    }
}

class facility

{
    
}

public class HospitalManagement

{
    public static void main(String args[])
    {
        
    }
}