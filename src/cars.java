import java.util.Scanner;
public class cars extends showroom implements utility{
    String car_name;

    String car_color;

    String car_fuel_type;

    int car_price ;

    String car_type;

    String car_transmission;

    @Override
    public void get_details(){
        System.out.println("NAME: "+car_name);
        System.out.println("COLOR: "+car_color);
        System.out.println("FUEL TYPE: "+car_fuel_type);
        System.out.println("PRICE : "+car_price);
        System.out.println("CAR TYPE: "+car_type);
        System.out.println("TRANSMISSION: "+car_transmission);
    }
    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("====================== *** ENTER CAR DETAILS *** ===========================");
        System.out.println();
        System.out.println("CAR NAME : ");
        car_name = sc.nextLine();
        System.out.println("CAR COLOR :");
        car_color = sc.nextLine();
        System.out.println("CAR FUEL TYPE (PETROL / DIESEL) :");
        car_fuel_type = sc.nextLine();
        System.out.println("CAR PRICE :");
        car_price= sc.nextInt();
        System.out.println("CAR TYPE (SEDAN / SUV / HATCHBACK) :");
        car_type= sc.nextLine();
        System.out.println("CAR TRANSMISSION (MANNUAL / AUTOMATIC) :");
        car_transmission =sc.nextLine();
        total_cars_in_stock++;

    }

}
