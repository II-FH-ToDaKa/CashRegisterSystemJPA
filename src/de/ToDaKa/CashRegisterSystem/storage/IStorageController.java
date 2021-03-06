package de.ToDaKa.CashRegisterSystem.storage;

import de.ToDaKa.CashRegisterSystem.model.*;
import de.ToDaKa.CashRegisterSystem.storage.exception.StorageException;
/**
 Class: IStorageController
 @author Daniel Albrecht

 **/

public interface IStorageController
{
    void saveCashRegisterSystem( CashRegisterSystem _CashRegisterSystem ) throws StorageException;

    CashRegisterSystem loadCashRegisterSystem() throws StorageException;
}
