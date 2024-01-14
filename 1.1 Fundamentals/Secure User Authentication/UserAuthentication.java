import java.util.Scanner;

public class UserAuthentication {
    public static void main(String[] args) {
        System.out.println("Welcome to user authentication!");
        menu();
    }

    public static void menu(){
        System.out.println("You can have following roles : ");
        System.out.println("1. Admin");
        System.out.println("2. Teacher");
        System.out.println("3. Student");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Admin ad = new Admin("Admin");
                break;

            case 2 : 
                Teacher teach = new Teacher("Teacher");
                break;

            case 3 : 
                Student stud = new Student("Student");
                break;
        
            default:
                System.out.println("Please enter a valid choice");
                menu();
                break;
        }
    }
}


class Admin{
    Admin(String type){
        System.out.println("This is the " + type);
    }

    public String username;
    public int uid;
    protected int studentCount;
    private int employeeCount;
    Scanner sc = new Scanner(System.in);

    public void userLogin(){
        System.out.println("Enter your username : "); 
        username = sc.next();
        System.out.println("Enter your UID : ");
        uid = sc.nextInt();
    }

    protected void setStudentCount(){
        System.out.println("1. View Student Count \n2. Set Student Count ");
        int choice = sc.nextInt();
        if(choice == 1) System.out.println(studentCount);
        else{
            studentCount = sc.nextInt();
            System.out.println("You set the employee count to : " + studentCount);
        }
    }

    private void setEmployeeCount(){
        System.out.println("1. View Employee Count \n2. Set Employee Count ");
        int choice = sc.nextInt();
        if(choice == 1) System.out.println(employeeCount);
        else{
            employeeCount = sc.nextInt();
            System.out.println("You set the employee count to : " + employeeCount);
        }
    }
}

class Teacher extends Admin{

    Teacher(String type) {
        super(type);
    } 



}

class Student extends Teacher{
    Student (String type){
        super(type);
    }
}