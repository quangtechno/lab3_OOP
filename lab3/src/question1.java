
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
public class question1 {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int menu;
        list.add(new CD("20", "game", "audio", "the day before20", 2000, 2003));
        list.add(new CD("21", "game", "audio", "the day before21", 2000, 2006));
        list.add(new CD("22", "game", "audio", "the day before22", 2000, 2001));
        list.add(new CD("23", "game", "audio", "the day before23", 2000, 2008));
        list.add(new CD("24", "game", "audio", "the day before24", 2000, 2023));
        list.add(new CD("25", "game", "audio", "the day before25", 2000, 2012));
        do {
            System.out.print("1. Add CD (ArrayList)\n"
                    + "2. Search CD by CD title\n"
                    + "3. Search CDs by collection (game/movie/music)\n"
                    + "4. Search CDs by type (audio/video)\n"
                    + "5. Delete CD by CD Id\n"
                    + "6. Edit CD information by Id\n"
                    + "7. Display all CDs\n"
                    + "8. Sort the CD list ascending by year of release\n"
                    + "9. Exit \n Input : ");
            menu = reader.nextInt();
            switch (menu) {
                case 1:
                    addCD();
                    break;
                case 2:
                    displayCD(searchByTitle());
                    break;
                case 3:
                    displayCD(searchByCollection());
                    break;
                case 4:
                    displayCD(searchByType());
                    break;
                case 5:
                    deleteCD();
                    break;
                case 6:updateCD();
                    break;
                case 7:
                    displayAllCD();
                    break;
                case 8:sort();
                    break;
                case 9:
                    System.out.println("exit");
                    break;
                default:
                    System.out.println("wrong Input");
            }
        } while (menu != 9);
    }
    static ArrayList<CD> list = new ArrayList<>();

    public static void addCD() {
        
        list.add(inputCD());
    }

    public static CD inputCD() {
        //String cd_ID, String collection, String type, String title, double Price, int yearOfRelease
        System.out.println("CD ID : ");
        String id = reader.next();
        System.out.println("CD Collection : ");
        String collection = reader.next();
        System.out.println("CD type : ");
        String type = reader.next();
        System.out.println("CD title : ");
        String first=reader.next();
        String title = reader.nextLine();
        title=first+title;
        System.out.println("CD Price : ");
        double price = reader.nextDouble();
        System.out.println("CD yearOfRelease : ");
        int year = reader.nextInt();
        return new CD(id, collection, type, title, price, year);
    }

    public static void displayCD(ArrayList<CD> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).toString());
        }
    }

    public static void displayAllCD() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    public static ArrayList<CD> searchByTitle() {

        System.out.println("Enter the title");
        String first=reader.next();
        String title = reader.nextLine();
        title=first+title;
//        System.out.println(title);
        ArrayList<CD> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            CD temp = list.get(i);
            if (temp.getTitle().equalsIgnoreCase(title)) {
                result.add(temp);
            }
        }
        return result;
    }

    public static ArrayList<CD> searchByCollection() {
          
        System.out.println("Enter the Collection");
      String first=reader.next();
        String collection = reader.nextLine();
        collection=first+collection;
//        System.out.println(collection);
        ArrayList<CD> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            CD temp = list.get(i);
            if (temp.getCollection().equalsIgnoreCase(collection)) {
                result.add(temp);
            }
        }
        return result;
    }

    public static ArrayList<CD> searchByType() {
        
        System.out.println("Enter the Type");
        String first=reader.next();
        String type = reader.nextLine();
        type= first+type;
        ArrayList<CD> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            CD temp = list.get(i);
            if (temp.getType().equalsIgnoreCase(type)) {
                result.add(temp);
            }
        }
        return result;
    }
    public static void deleteCD(){
         System.out.println("Enter the ID");
        String id = reader.next();
        for (int i = 0; i < list.size(); i++) {
            CD temp = list.get(i);
            if (temp.getCd_ID().equalsIgnoreCase(id)) {
                System.out.println("remove :"+temp.toString());
              list.remove(temp);
            }
        }
    }
     public static void updateCD() {
        //String cd_ID, String collection, String type, String title, double Price, int yearOfRelease
        System.out.println("CD ID : ");
        String id = reader.next();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getCd_ID().equalsIgnoreCase(id)){
                CD temp=list.get(i);
                System.out.println(" before Update : "+temp.toString());
        System.out.println("Update CD Collection : ");
        String collection = reader.next();
        temp.setCollection(collection);
        System.out.println("Update CD type : ");
        String type = reader.next();
        temp.setType(type);
        System.out.println("Update CD title : ");
        String first=reader.next();
        String title = reader.nextLine();
        title=first+title;
        temp.setTitle(title);
        System.out.println("Update CD Price : ");
        double price = reader.nextDouble();
        temp.setPrice(price);
        System.out.println("Update CD yearOfRelease : ");
        int year = reader.nextInt();
        temp.setYearOfRelease(year);
        System.out.println("after Update : "+temp.toString());
        }
        }
    }
     public static void sort(){
    Comparator<CD> com=new Comparator<CD>(){
             public int compare(CD s1,CD s2){
                 return s1.getYearOfRelease()-s2.getYearOfRelease();
             }
     };
    list.sort(com);
     }
}
     

