/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Movimento;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Suporte4
 */
public class MovimentacaoEJB {

    private EntityManager em;
    private EntityManagerFactory emf=Persistence.createEntityManagerFactory("MoneyPU");

    public void salvar(Movimento movimento) {
        em.persist(movimento);
    }

    public void alterar(Movimento movimento) {
        em.merge(movimento);
    }

    public void excluir(Movimento movimento) {
        em.remove(movimento);
    }
    public List<Movimento> listaMovimentacao() {
        Query query = em.createNamedQuery("Movimento.findAll");
        return query.getResultList();
    }
    

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public EntityManagerFactory getEmf() {
        return emf;
    }

    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }
}
