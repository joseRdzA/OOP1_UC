package com.Presupuesto.repo;

public interface InterfaceRepository {
    boolean save (String text) throws ErrorMuyPocaData;

    void read ();
}
