/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.ModelTem;
import views.ViewTem;

/**
 *
 * @author mark
 */
public class ControllerTem {
         ViewTem   viewtem;
    ModelTem  modeltem;
    
public ControllerTem(ModelTem modeltem, ViewTem viewtem){
    this.viewtem = viewtem;
    this.modeltem = modeltem;

    initView();
}//contructor

    
  public void initView(){
   viewtem.jtfvalor.setText(String.valueOf(modeltem.getValor()));
   viewtem.jtfpromedio.setText(String.valueOf(modeltem.getPromedio()));
   
   viewtem.setVisible(true);
  
  }
  
  public void jbtnvalor_click(){
 // modelpro.setValor(Integer.parseInt(viewpro.jtfvalor.getText()));
 //  modelpro.setValor(Integer.parseInt(viewpro.jtfvalor.getText()));
  }

    
}//class
