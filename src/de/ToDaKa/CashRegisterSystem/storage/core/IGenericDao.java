package de.ToDaKa.CashRegisterSystem.storage.core;

import java.util.Collection;
import java.util.List;


/**
    Class: DataController
    @author Daniel Albrecht

    Common Interface for all of our Dao classes

    Completely hides all the JPA/Database related stuff.

    Always use this interface as the reference type wherever you
    need to use the Dao!
*
 */
public interface IGenericDao<T extends AbstractDatabaseEntity>
{
    T findById( Long id );
    Collection<T> findAll();

    void create( T entity );
    void createAll( Collection<T> newEntities );

    T update( T entity );

    void delete( Long id );
    void delete( T entity );
    void delete( List<T> entries );
}
