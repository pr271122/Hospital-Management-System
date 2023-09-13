import java.io.*;
import java.util.*;
import java.util.Calendar;
import java.io.IOException;
import java.io.FileWriter;
class Hospital{
    int id;
    String name,gender;
    Hospital(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter ID in numerical form: ");
        id=sc.nextInt();
        System.out.print("Enter name: ");
        name=sc.nextLine();
        name=sc.nextLine();
        System.out.print("Enter gender: ");
        gender=sc.nextLine();

    }
}
class Doctor extends Hospital{
    String speciality;
    String workingtime;
    Doctor(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Working time: ");
        workingtime=sc.nextLine();
        System.out.println("Enter your specialisation from the following:");
        System.out.println("mbbs");
        System.out.println("gynaecologist");
        System.out.println("psychiatrist");
        System.out.println("pediatrician");
        System.out.println("dhms");
        System.out.println("bhms");
        boolean flag=true;
        while(flag){
            speciality =sc.nextLine();

            if(speciality.equals("mbbs") || speciality.equals("gynaecologist") ||speciality.equals("psychiatrist") ||speciality.equals("pediatrician") ||speciality.equals("dhms") ||speciality.equals("bhms")){
                flag=false;
            }else{
                System.out.println("Invalid choice.");
                System.out.println("Enter valid specialisation:\n");
            }
        }
    }
}
class Specialization extends Doctor{
    float salaryd;
    Specialization(){
        if(speciality.equals("mbbs"))
            salaryd=350000;
        else if(speciality.equals("gynaecologist"))
            salaryd=230000;
        else if(speciality.equals("psychiatrist"))
            salaryd=140000;
        else if(speciality.equals("pediatrician"))
            salaryd=125000;
        else if(speciality.equals("dhms"))
            salaryd=100000;
        else if(speciality.equals("bhms"))
            salaryd=160000;

    }
    void display(){
        System.out.println(id+"\t"+name+"\t"+gender+"\t"+speciality+"\t"+workingtime+"\t"+salaryd);
        System.out.println("---------------------------------------------------------------------------------");
    }
}
class Staff extends Hospital{
    String designations;
    String workingtime;
    //int n;
    Staff(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Working time: ");
        workingtime=sc.nextLine();
        System.out.println("Enter your designation from the following:");
        System.out.println("worker");
        System.out.println("peon");
        System.out.println("nurse");
        System.out.println("accountant");

        boolean flag1=true;
        while(flag1){
            designations =sc.nextLine();

            if( designations.equals("worker") ||  designations.equals("peon") || designations .equals("nurse") || designations .equals("accountant")){
                flag1=false;
            }else{
                System.out.println("Invalid choice");
                System.out.println("Enter valid designation");
            }

        }
    }
}
class Designation extends Staff{
    float salarys;
    Designation(){
        if(designations.equals("worker"))
            salarys=4000;
        else if(designations.equals("peon"))
            salarys=12000;
        else if(designations.equals("nurse"))
            salarys=40000;
        else if(designations.equals("accountant"))
            salarys=65000;
    }
    void display(){
        System.out.println(id+"\t"+name+"\t"+gender+"\t"+designations+"\t"+workingtime+"\t"+salarys);
        System.out.println("---------------------------------------------------------------------------------");
    }
}
class Patient
{
    String pid, pname, disease, sex, admit_status;

    int age;
    Patient()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        pid = input.nextLine();
        System.out.print("name:-");
        pname = input.nextLine();
        System.out.println("1.diabetes");
        System.out.println("2.Thyroid");
        System.out.println("3.Infertility drugs");
        System.out.println("4.Irregular menstruation drugs");
        System.out.println("5.antidepressant");
        System.out.println("6.anti-anxiety");
        System.out.println("7.mood stabiliser");
        System.out.println("8.amoxicillin");
        System.out.println("9.pain and aches");
        System.out.println("10.fever");
        System.out.println("11.cough and cold");
        System.out.println("Enter your chioce between 1 to 11:-");
        int c=input.nextInt();
        int a=1;
        while(a>0)
        {
            switch(c)
            {
                case 1:
                    disease="diabetes";
                    a=0;
                    break;
                case 2:
                    disease="Thyroid";
                    a=0;
                    break;
                case 3:
                    disease="Infertility drugs";
                    a=0;
                    break;
                case 4:
                    disease="Irregular menstruation drugs";
                    a=0;
                    break;
                case 5:
                    disease="antidepressant";
                    a=0;
                    break;
                case 6:
                    disease="anti-anxiety";
                    a=0;
                    break;
                case 7:
                    disease="mood stabiliser";
                    a=0;
                    break;
                case 8:
                    disease="amoxicillin";
                    a=0;
                    break;
                case 9:
                    disease="pain and aches";
                    a=0;
                    break;
                case 10:
                    disease="fever";
                    a=0;
                    break;
                case 11:
                    disease="cough and cold";
                    a=0;
                    break;
                default :
                    System.out.println("Incorrect choice !! Enter correct choice");
            }
        }
        System.out.print("gender:-");
        String s=input.nextLine();
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
public class Main {

    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        Specialization d[]=new Specialization[50];
        Designation s[]=new Designation[50];
        Patient[] p = new Patient[50];
        File a=new File("doctor_file.txt");
        a.createNewFile();
        File b=new File("patient_file.txt");
        b.createNewFile();
        File c=new File("staff_file.txt");
        c.createNewFile();
        FileWriter aa=new FileWriter("doctor_file.txt");
        FileWriter bb=new FileWriter("patient_file.txt");
        FileWriter cc=new FileWriter("staff_file.txt");
        int choice,countd=0,counts=0,count2=0;
        int status=1;
        while (status==1) {
            System.out.println("\n                                    MAIN MENU");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1.Doctor  2. Staff  3.Patients 4.Exit");
            System.out.println("-----------------------------------------------------------------------------------");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                      DOCTOR SECTION");
                    System.out.println("--------------------------------------------------------------------------------");
                    int s1 = 1;
                    while (s1 == 1) {
                        System.out.println("1.Add New Entry\n2.Existing Doctors List");
                        int c1 = sc.nextInt();
                        switch (c1) {
                            case 1: {
                                d[countd] = new Specialization();
                                Doctor dd=d[countd];
                                aa.write("id = "+dd.id+"\n"+"name = "+dd.name+"\n"+"gender = "+dd.gender+"\n"+"\n"+"working time ="+dd.workingtime+"\n"+"speciality ="+dd.speciality+"\n");
                                countd++;

                                break;
                            }
                            case 2: {
                                System.out.println("---------------------------------------------------------------------------------");
                                for (int i = 0; i < countd; i++) {
                                    d[i].display();
                                }
                                break;
                            }

                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s1 = sc.nextInt();
                    }
                    break;
                }
                case 2: {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                      STAFF SECTION");
                    System.out.println("--------------------------------------------------------------------------------");
                    int s2 = 1;
                    while (s2 == 1) {
                        System.out.println("1.Add New Entry\n2.Existing Staff List");
                        int c2 = sc.nextInt();
                        switch (c2) {
                            case 1: {
                                s[counts] = new Designation();
                                Designation st= s[counts];
                                cc.write("id = "+st.id+"\nname = "+st.name+"\ngender = "+st.gender+"\nworking time = "+st.workingtime+"\ndesignation = "+st.designations+'\n');
                                counts++;
                                break;
                            }
                            case 2: {
                                System.out.println("---------------------------------------------------------------------------------");
                                for (int i = 0; i < counts; i++) {
                                    s[i].display();
                                }
                                break;
                            }

                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s2 = sc.nextInt();
                    }
                    break;
                }
                case 3:
                {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                     PATIENT SECTION");
                    System.out.println("--------------------------------------------------------------------------------");

                    int s2 = 1;
                    while (s2 == 1)
                    {
                        System.out.println("1.Add New Entry\n2.Existing Patients List");
                        int  c1 = sc.nextInt();

                        switch (c1)
                        {
                            case 1:
                            {
                                p[count2]=new Patient();
                                Patient k=p[count2];
                                bb.write("id= "+k.pid+"\n"+"name = "+k.pname+ "\n"+"disease = "+k.disease+"\n"+"sex = "+k.sex+"\n"+"admit status = "+k.admit_status+"\n"+"age = "+k.age+"\n");
                                // if(k.disease.equals(""))
                                String r=k.disease;
                                bb.write("medicines : \n");
                                switch(r)
                                {
                                    case "diabetes":
                                        bb.write("Tolbutamide\nGlimepiride\nRepaglinide\ncost=1000 rupees\n");
                                        break;
                                    case "Thyroid":
                                        bb.write("Levoxyl\nUnithroid\nLevothroid\nWP Thyroid \nCOST= 2000 rupees\n ");
                                        break;
                                    case "Infertility drugs":
                                        bb.write("Bravelle (follicle stimulating hormone)\nCetrotide (gonadotropin-releasing hormone antagonist)\nClomid (clomiphene citrate)\nCrinone (progesterone)\nDostinex (prolactin reducing)\nFactrel (gonadotropin-releasing hormone)\nCOST = 10,000 rupees\n");

                                        break;
                                    case "Irreguler menstruation drugs":
                                        bb.write("Prometrium (progesterone) Drug Class: Progesterones\nProvera (medroxyprogesterone) Drug Class: Progestins\nAygestin (norethindrone acetate)Drug Class: Progestins\nCrinons Drug Class: Progesterones\nCOST = 7,700 rupees\n");
                                        break;
                                    case "antidepressant":
                                        bb.write("sertraline (Zoloft)fluoxetine (Prozac, Sarafem)\nCOST =5,000 rupees\n");
                                        break;
                                    case "anti-anxiety":
                                        bb.write("alprazolam (Xanax)\n clonazepam (Klonopin)\nchlordiazepoxide (Librium)\n diazepam (Valium)\nand lorazepam (Ativan)\nCOST = 9,500 rupees\n");
                                        break;
                                    case "mood stabiliser":
                                        bb.write(" Lithium. \nValproate\nLamotrigine\n COST = 3,400 rupees\n");
                                        break;
                                    case "amoxicillin":
                                        bb.write("Amoxicillin/Clavulanic Acid,Albuterol,Cephalexin\n COST= 5,100 rupees\n");
                                        break;
                                    case "pain and aches":
                                        bb.write("dolo 65\n COST = 400 rupees\n");
                                        break;
                                    case "fever":
                                        bb.write("paracetamol, ibuprofen\n COST =350 rupees\n");
                                        break;
                                    case "cough and cold":
                                        bb.write("Delsym,Aleve,Echinacea\n COST =450 rupees\n");
                                        break;

                                }
                                count2++;
                                break;
                            }
                            case 2:
                            {

                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name \t Disease \t Gender \t Admit Status \t Age");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (int j = 0; j < count2; j++) {
                                    p[j].patient_info();

                                }
                                break;
                            }
                        }

                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s2 = sc.nextInt();
                    }
                    break;
                }
                case 4:
                    break;
            }
            if(choice!=4) {
                System.out.println("\nReturn to MAIN MENU Press 1");
                status = sc.nextInt();
            }
            else
            {
                status=0;
                aa.close();
                bb.close();
                cc.close();
            }
        }

    }
}