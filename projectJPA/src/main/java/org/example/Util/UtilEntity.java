package org.example.Util;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class UtilEntity {

    private static final EntityManagerFactory entityManagerFactory = buildEntityManagerFactory(); //Abre posibilidad de entrar a BD
    private static  EntityManagerFactory buildEntityManagerFactory(){
        return Persistence.createEntityManagerFactory("myPersistenceUnit");
    }

    public static EntityManager getEntityManager (){ //Permite realizar operaciones
        return entityManagerFactory.createEntityManager();
    }

}
