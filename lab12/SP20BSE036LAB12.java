/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp20.bse.pkg036.lab12;
public class SP20BSE036LAB12 {
    public static void main(String[] args) {
     //   HumanResources h= new HumanResources();
        HumanResources <Association> resources_array= new HumanResources<>();
        Association Student1= new student();
         Association Student2= new student(8,6,"Saad","ABC-09");
         Association Teacher1= new teacher();
         Association Teacher2= new teacher("Head of IT","Computer Science","Prof.Qasim","FA09-09");
         System.out.println("enter student 1");
         Student1.assosiate();
         System.out.println("enter Teacher 1");
         Teacher1.assosiate();
       
         
         resources_array.add(Student1);
          resources_array.add(Student2);
           resources_array.add(Teacher1);
           resources_array.add(Teacher2);
         
         System.out.println(resources_array);
         System.out.println("After deletion the array is:");
         resources_array.Delete(Teacher2);
         System.out.println(resources_array);
        /*//used when array code use
         h.add(Student1);
         h.add(Student2);
         h.add(Teacher1);
         h.add(Teacher2);
         
         System.out.println(h);
         System.out.println("After deletion the array is:");
         h.Delete(Teacher2);
         System.out.println(h);
        */
    }
    
}
