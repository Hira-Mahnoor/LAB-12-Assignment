/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp20.bse.pkg036.lab12;

import java.util.Scanner;


public class teacher extends person implements Association {
      protected String designation;
    protected String department;

    public teacher() {
        super("NULL","NULL");
    }
 

    public teacher(String designation, String department, String name, String id) {
        super(name, id);
        this.designation = designation;
        this.department = department;
    }
    @Override
    public String toString() {
        return "\n----Teacher---"+ super.toString() + "\ndesignation=" + designation + "\ndepartment=" + department;
    }

      @Override
    public void assosiate() {
        Scanner input= new Scanner(System.in);
        System.out.println("enter you name");
        this.name=input.nextLine();
        System.out.println("enter your ID");
        this.id=input.nextLine();
        System.out.println("enter your Department");
        this.department=input.nextLine();
        System.out.println("enter your Designation");
        this.designation=input.nextLine();
        
    }
    
}


