package com.Presupuesto.repo;

import java.util.List;

public interface InterfaceRepository {
    boolean save (String text) throws ErrorMuyPocaData;

    List<String> read ();
}
