
package javapractise;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Izan
 */
public class EmployeeRep {

    public static void main(String[] args) {
        
        ArrayList<Employee> lEmployees = new ArrayList<Employee>();
        
        boolean exit = false;
        int choice = 0;
        
        do{

            Scanner sc = new Scanner(System.in);
            
            System.out.println("Welcome to the employee manager");
            System.out.println("--------------------------");
            System.out.println("Select your operation:");
            System.out.println("1)New employee");
            System.out.println("2)Seatch");
            System.out.println("3)Update info");
            System.out.println("4)Delete");
            System.out.println("5)Show all");
            System.out.println("6)Exit");
            
            String tChoice = sc.nextLine();
            
            try{
                choice = Integer.parseInt(tChoice);
            }catch(Exception e){
                System.out.println("Error, introduce a valid number");
            }
            
            System.out.println(choice);
            
            switch(choice){
            
                case 1:
                    
                    boolean valid = false;
                    
                    System.out.println("Employee name:");
                    String name = sc.nextLine();
                    do{
                        if(name.isEmpty() || name.isBlank()){
                            System.out.println("Name cant be empty, introduce a valid name");
                            name = sc.nextLine();
                        }else{
                            valid = true;
                        }
                        
                    }while(valid == false);
                    
                    valid= false;
                    
                    System.out.println("Employee department?(Engineering, Martketing, Finance, HR)");
                    String dept = sc.nextLine();
                    dept = dept.toUpperCase();
                    do{
                        if(dept.isEmpty() || dept.isBlank() || (!dept.equals("ENGINEERING") && !dept.equals("MARKETING") && !dept.equals("FINANCE") && !dept.equals("HR"))){
                                System.out.println("Invalid departament, introduce a valid one: Engineering, Martketing, Finance, HR");
                                dept = sc.nextLine();
                                dept = dept.toUpperCase();
                        }else{
                           
                            valid = true;
                        }
                        
                    }while(valid == false);
                    
            }    
            exit=true;
            
        }while(exit == false);
    }
    
    public static void create(String name, Department department, double salary, boolean active){
        
        try{
            
        }catch(Exception e){
            
        }
        
    }
    
}
