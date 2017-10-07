/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import views.ViewTem;
import models.ModelTem;
import controllers.ControllerTem;

/**
 *
 * @author mark
 */
public class Main {
    public static void main(String mar[]){
        
        ModelTem modeltem = new ModelTem();
        ViewTem viewtem = new ViewTem();
        ControllerTem controllertem = new ControllerTem(modeltem, viewtem);
    }//main
    
}//class
