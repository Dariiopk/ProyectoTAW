/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taw18.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import taw18.entity.Estadisticas;

/**
 *
 * @author Dani
 */
@Stateless
public class EstadisticasFacade extends AbstractFacade<Estadisticas> {

    @PersistenceContext(unitName = "taw18PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstadisticasFacade() {
        super(Estadisticas.class);
    }
    
}
