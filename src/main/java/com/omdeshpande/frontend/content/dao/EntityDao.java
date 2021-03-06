/**
 * 
 */
package com.omdeshpande.frontend.content.dao;

import com.omdeshpande.lib.abstracts.HibernateDaoAbstract;
import com.omdeshpande.lib.interfaces.Entity;

/**
 * @author Om Deshpande
 *
 */
public class EntityDao extends HibernateDaoAbstract<Entity, Integer> {

	public EntityDao(Class<Entity> type) {
		super(type);
	}

}
