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
public enum ArticleStatus {
 PUBLISHED (1), 
  REPORTASABUSED (-1),
  WAITFORVALIDATION (0);
  
  ArticleStatus(int status){
        this.status = status;
    }
     int status; 
}

