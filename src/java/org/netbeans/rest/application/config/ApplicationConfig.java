/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Lotus
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        try{
            Class JsonProvider = Class.forName("org.glassfish.jersey.jackson.JacksonFeature");
            resources.add(JsonProvider);
        }
        catch (ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(getClass().getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        addRestResourceClasses(resources);
        return resources;
    }

   

    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(blog.service.ArticleFacadeREST.class);
        resources.add(blog.service.PersonneFacadeREST.class);
        resources.add(blog.service.RoleFacadeREST.class);
        resources.add(blog.service.UtilisateurFacadeREST.class);
        resources.add(org.netbeans.rest.application.config.RequestFilter.class);
    }
}

