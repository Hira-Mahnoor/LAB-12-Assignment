/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp20.bse.pkg036.lab12;

/**
 *
 * @author Rehman Computer
 */
public class person {
     protected String name;
    protected String id;

   

    public person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return"\nname=" + name + "\nid=" + id;
    }
    
}
