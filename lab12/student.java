/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp20.bse.pkg036.lab12;

import java.util.Scanner;

public class student extends person implements Association{
     private int rollno;
    private int semester;

    public student() {
        super("NULL","NULL");
    }
    

    public student(int rollno, int semester, String name, String id) {
        super(name, id);
        this.rollno = rollno;
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "\n---student---"+ super.toString() + "\nrollno=" + rollno + "\n semester=" + semester;
    }

     @Override
    public void assosiate() {
        Scanner input= new Scanner(System.in);
        System.out.println("enter you name");
        this.name=input.next();
        System.out.println("enter your roll no");
        this.rollno=input.nextInt();
        System.out.println("enter your semester");
        this.semester=input.nextInt();
        System.out.println("enter your id");
        this.id=input.next();
        
    }

   
    
    
}
