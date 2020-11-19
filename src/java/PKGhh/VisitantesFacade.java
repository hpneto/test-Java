/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PKGhh;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Henrique
 */
@Stateless
public class VisitantesFacade extends AbstractFacade<Visitantes> {

    @PersistenceContext(unitName = "TesteHopiHariPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VisitantesFacade() {
        super(Visitantes.class);
    }
    
}
