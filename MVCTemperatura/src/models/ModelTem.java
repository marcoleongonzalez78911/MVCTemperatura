/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author mark
 */
public class ModelTem {
    private  String valor = "";
    private String promedio = "";
    
    public String getValor(){
        return valor;
    }    
    public void setValor(String valor){
        this.valor = valor;
     
     }
    public String getPromedio(){
        return promedio;
    }
    public void setPromedio(){
        this.promedio = promedio;
    }
   public void lista(){
       int ax[] = {};
       int i,j,tem;
       for(i=0;i<100;i++){
           for(j=0;j<100;j++){
               if(ax[j]>ax[j+1]){
                   tem = ax[j];
                   ax[j] = ax[j+1];
                   ax[j+1] = tem;
               
               }
           
           }
       
       
       }
   
   
   }
    
}
