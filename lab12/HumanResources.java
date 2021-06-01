/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp20.bse.pkg036.lab12;
import java.util.ArrayList;
public class HumanResources<T> {
 // private Association array[];
   // private static int i=0;
  private  ArrayList<Association> resources= new ArrayList<>();
   
 /* public void add(Association a){
        extend();
        array[i]=a;
        i++;   
    
    }
   */
    public void add(Association o){
        resources.add(o);                
    }
    
    /* private void extend(){
       Association[] array2 = new Association[i+1];
     
        if(i>0){
            for(int i=0;i<array.length;i++){
                 array2[i]=array[i];
                }           
        }
        array=array2;
    }*/
    
    public boolean Delete(Association o){
        for(int i=0;i<resources.size();i++){
            if(resources.get(i).equals(o)){
              resources.remove(o);
              return true;
            }
    }
        return false;
    }
    
  /* public boolean Delete(Association o){
        for(int i=0;i<array.length;i++){
            if(array[i].equals(o)){
                array[i]=null;
                return true;
            }
        }
        return false;    
        }*/
    
  
    public String toString(){
        String s=" ";
        for(int i=0;i<resources.size();i++){
            s +=resources.get(i)+"\n";
        }
        return s;
     }
     
   /* public String toString(){
      String s=" ";
        for(int i=0;i<array.length;i++){
            s +=array[i]+"\n";
        }
        return s;
     }*/
   
    
}
