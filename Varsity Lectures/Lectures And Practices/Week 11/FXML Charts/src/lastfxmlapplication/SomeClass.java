/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lastfxmlapplication;

/**
 *
 * @author Subrata Kumar Dey
 */
class SomeClass {
    private int x;
    private class NestedClass{
        void doAnother(){
            x++;
        }
        
    }
    //here private class is usable to methods of someClass
    
    public void doSome(){
        NestedClass nc = new NestedClass();
        nc.doAnother();
    }
}
