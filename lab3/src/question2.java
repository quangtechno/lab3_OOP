
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class question2 {

    static ArrayList<FullTimeEmployee> fullTimeList = new ArrayList<>();
    static ArrayList<PartTimeEmployee> partTimeList = new ArrayList<>();
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int menu;
        fullTimeList.add(new FullTimeEmployee(2002, "23", "quang", 2002, "20312", "0914830278"));
        fullTimeList.add(new FullTimeEmployee(201, "24", "quang", 2007, "20312", "0914830278"));
        fullTimeList.add(new FullTimeEmployee(204, "25", "quang", 2003, "20312", "0914830278"));
        fullTimeList.add(new FullTimeEmployee(202, "26", "quang", 2002, "20312", "0914830278"));
        partTimeList.add(new PartTimeEmployee(20, 2, "20", "quang", 2002, "2033 ads", "203120005"));

        do {
            System.out.print("1. Add Full-time Employee (ArrayList)\n"
                    + "2. Add Part-time Employee (ArrayList)\n"
                    + "3. Show all Full-time Employee\n"
                    + "4. Show all Part-time Employee\n"
                    + "5. Show all Employee\n"
                    + "6. Search Employee by Id\n"
                    + "7. Delete Employee by Id\n"
                    + "8. Edit Employee information by Id\n"
                    + "9. Search Employee by payment\n"
                    + "10. Sort Full-time Employee and Part-Time employee in ascending order by age, payment.\n"
                    + "11. Exit\n input : ");
            menu = reader.nextInt();
            switch (menu) {
                case 1:
                    addFullTime();
                    break;
                case 2:
                    addPartTime();
                    break;
                case 3:
                    showFullTime();
                    break;
                case 4:
                    showPartTime();
                    break;
                case 5:
                    showAllEmployee();
                    break;
                case 6:
                    showList(searchByID());
                    break;
                case 7:
                    deleteByID();
                    break;
                case 8:
                    update();
                    break;
                case 9:
                     showList(searchByPayment());
                    break;
                case 10:
                   sort();
                    break;
                case 11:
                    System.out.println("exit");
                    break;
            }
        } while (menu != 11);

    }
    public static void update(){
        System.out.println("enter id : ");
        String id=reader.next();
    
        for(int i=0;i<fullTimeList.size();i++){
            if(fullTimeList.get(i).getEmployee_ID().equalsIgnoreCase(id)){
                FullTimeEmployee temp=fullTimeList.get(i);
                UpdateByIDFullTime(temp);
            }
    }
         for(int i=0;i<partTimeList.size();i++){
            if(partTimeList.get(i).getEmployee_ID().equalsIgnoreCase(id)){
                PartTimeEmployee temp=partTimeList.get(i);
                updateByIDPartTime(temp);
            }
    }
    }
    public static ArrayList<Employee> searchByPayment(){
        ArrayList<Employee> list=new ArrayList<>();
        System.out.println("enter payment : ");
        float payment=reader.nextFloat();
          for(int i=0;i<fullTimeList.size();i++){
            if(fullTimeList.get(i).getSalary()==payment){
               list.add(fullTimeList.get(i));
            }
    }
         for(int i=0;i<partTimeList.size();i++){
            if(partTimeList.get(i).getPayment()==payment){
               list.add(partTimeList.get(i));
            }
    }
         return list;
    }

    public static ArrayList<Employee> searchByID() {
        System.out.println("enter employee id : ");
        String id = reader.next();
        ArrayList<Employee> list = new ArrayList<>();
        for (int i = 0; i < fullTimeList.size(); i++) {
            FullTimeEmployee temp = fullTimeList.get(i);
            if (temp.getEmployee_ID().equalsIgnoreCase(id)) {
                list.add(temp);
            }
        }
        for (int i = 0; i < partTimeList.size(); i++) {
            PartTimeEmployee temp = partTimeList.get(i);
            if (temp.getEmployee_ID().equalsIgnoreCase(id)) {
                list.add(temp);
            }
        }
        return list;
    }

    public static void deleteByID() {
        System.out.println("enter employee id : ");
        String id = reader.next();
        for (int i = 0; i < fullTimeList.size(); i++) {
            FullTimeEmployee temp = fullTimeList.get(i);
            if (temp.getEmployee_ID().equalsIgnoreCase(id)) {
                System.out.println("delete : " + temp.toString());
                fullTimeList.remove(temp);
            }
        }
        for (int i = 0; i < partTimeList.size(); i++) {
            PartTimeEmployee temp = partTimeList.get(i);
            if (temp.getEmployee_ID().equalsIgnoreCase(id)) {
                System.out.println("delete : " + temp.toString());
                partTimeList.remove(temp);
            }
        }
    }

    public static void updateByIDPartTime(PartTimeEmployee temp) {
        //int workingHour, float payRate, String employee_ID, String employee_name, int yearOfBirth, String address, String phone) {
        System.out.println("before update : " + temp.toString());
        System.out.print("enter employee_name : ");
        String first = reader.next();
        String name = reader.nextLine();
        name = first + name;
        temp.setEmployee_name(name);
        System.out.print("enter yearOfBirth : ");
        int year = reader.nextInt();
        temp.setYearOfBirth(year);
        System.out.print("enter employee_address : ");
        String firstaddress = reader.next();
        String address = reader.nextLine();
        address = firstaddress + address;
        temp.setAddress(address);
        System.out.print("enter employee_phone : ");
        String phone = reader.next();
        temp.setPhone(phone);
        System.out.print("enter workinghour : ");
        int hour = reader.nextInt();
        temp.setWorkingHour(hour);
        System.out.print("enter payRate : ");
        float payRate = reader.nextFloat();
        temp.setPayRate(payRate);
        System.out.println("after update : " + temp.toString());
        //int workingHour, float payRate, String employee_ID, String employee_name, int yearOfBirth, String address, String phone) {

    }

    public static void UpdateByIDFullTime(FullTimeEmployee temp) {
        System.out.println("before update : " + temp.toString());
        System.out.print("enter employee_name : ");
        String first = reader.next();
        String name = reader.nextLine();
        name = first + name;
        temp.setEmployee_name(name);
        System.out.print("enter yearOfBirth : ");
        int year = reader.nextInt();
        temp.setYearOfBirth(year);
        System.out.print("enter employee_address : ");
        String firstaddress = reader.next();
        String address = reader.nextLine();
        address = firstaddress + address;
        temp.setAddress(address);
        System.out.print("enter employee_phone : ");
        String phone = reader.next();
        temp.setPhone(phone);
        System.out.print("enter salary : ");
        float salary = reader.nextFloat();
        temp.setSalary(salary);
        //float salary, String employee_ID, String employee_name, int yearOfBirth, String address, String phone
        System.out.println("after update : " + temp.toString());
    }

    public static void showFullTime() {
        for (int i = 0; i < fullTimeList.size(); i++) {
            System.out.println(fullTimeList.get(i).toString());
        }
    }

    public static void showPartTime() {
        for (int i = 0; i < partTimeList.size(); i++) {
            System.out.println(partTimeList.get(i).toString());
        }
    }

    public static void showList(ArrayList<Employee> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    public static void showAllEmployee() {
        System.out.println("full_Time_Employees");
        showFullTime();
        System.out.println("Part_Time_Employees");
        showPartTime();
    }

    public static void addFullTime() {
        System.out.print("enter employee_id : ");
        String id = reader.next();
        System.out.print("enter employee_name : ");
        String first = reader.next();
        String name = reader.nextLine();
        name = first + name;
        System.out.print("enter yearOfBirth : ");
        int year = reader.nextInt();
        System.out.print("enter employee_address : ");
        String firstaddress = reader.next();
        String address = reader.nextLine();
        address = firstaddress + address;
        System.out.print("enter employee_phone : ");
        String phone = reader.next();
        System.out.print("enter salary : ");
        float salary = reader.nextFloat();
        //float salary, String employee_ID, String employee_name, int yearOfBirth, String address, String phone
        fullTimeList.add(new FullTimeEmployee(salary, id, name, year, address, phone));
    }

    public static void addPartTime() {
        //int workingHour, float payRate, String employee_ID, String employee_name, int yearOfBirth, String address, String phone) {
        System.out.print("enter employee_id : ");
        String id = reader.next();
        System.out.print("enter employee_name : ");
        String first = reader.next();
        String name = reader.nextLine();
        name = first + name;
        System.out.print("enter yearOfBirth : ");
        int year = reader.nextInt();
        System.out.print("enter employee_address : ");
        String firstaddress = reader.next();
        String address = reader.nextLine();
        address = firstaddress + address;
        System.out.print("enter employee_phone : ");
        String phone = reader.next();
        System.out.print("enter workinghour : ");
        int hour = reader.nextInt();
        System.out.print("enter payRate : ");
        float payRate = reader.nextFloat();

        //int workingHour, float payRate, String employee_ID, String employee_name, int yearOfBirth, String address, String phone) {
        partTimeList.add(new PartTimeEmployee(hour, payRate, id, name, year, address, phone));
    }
    public static void  sort(){
         Comparator<Employee> com =new Comparator<Employee>(){ 
        @Override
        public int compare(Employee o1, Employee o2) {
          if(o2.yearOfBirth-o1.yearOfBirth==0){
              if(o1.getPayment()-o2.getPayment()>0){
                  return 1;
              }else  if(o1.getPayment()-o2.getPayment()==0){
                  return 0;
              }
                  return -1;
              
          }
          return o1.yearOfBirth-o2.yearOfBirth;
        }
    };
         fullTimeList.sort(com);
         partTimeList.sort(com);
}
}
