
package br.senac.si.pi3.modelagemtendencia.factory;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Singleton
public class EMFactory {
    
    private EntityManagerFactory emf;

    private EntityManager fabrica() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("derbypi3");//pi3 ou derbypi3//aqui é o nome da persistencia...
        }
        return emf.createEntityManager();
    }

    private void fecha(EntityManager em) {
        em.close();
    }
    
    public EntityManager getEntityManager(){
        return fabrica();
    }
}
