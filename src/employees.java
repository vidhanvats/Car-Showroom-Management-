import java.util.Scanner;
import java.util.UUID;


public class employees extends showroom implements utility {

    String emp_id;

    String emp_name;

    int emp_age;

    String emp_department;


    @Override
    public void get_details(){
        System.out.print("ID : "+ emp_id);
        System.out.print("Name : "+ emp_name);
        System.out.print("Age : "+ emp_age);
        System.out.print("Department : "+ emp_department);
        System.out.print("Showroom Name : "+ showroom_name);
    }
    @Override
    public void set_details(){
        Scanner sc= new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        emp_id = String.valueOf(uuid);
        System.out.println("====================== *** ENTER EMPLOYEE DETAILS *** ==========================");
        System.out.println();
        System.out.print("EMPLOYEE NAME : ");
        emp_name=sc.nextLine();
        System.out.print("EMPLOYEE AGE :");
        emp_age = sc.nextInt();
        System.out.print("EMPLOYEE DEPARTMENT :");
        emp_department = sc.nextLine();
        System.out.print("SHOWROOM NAME : ");
        showroom_name = sc.nextLine();

    }

}
