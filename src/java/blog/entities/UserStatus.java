/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog.entities;


/**
 *
 * @author Lotus
 */
public enum UserStatus {
  ENABLED (1), 
  DISABLED (0)  ;
  
  UserStatus(int val){
        this.val = val;
    }
     int val; 
}



    