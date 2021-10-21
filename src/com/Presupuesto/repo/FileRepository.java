package com.Presupuesto.repo;

import java.io.*;
import java.util.stream.Collectors;

public class FileRepository implements InterfaceRepository{

    private final String FILE_PATH = "db.txt"; //En el momento que le de un valor, no lo puedo cambiar... Ahí queda x ser private

    @Override
    public boolean save(String text) {
        try (FileWriter fileWriter = new FileWriter(this.FILE_PATH, true);
             BufferedWriter writer = new BufferedWriter(fileWriter)) {
            writer.append(text).append("\n");
            return true;
        }catch (IOException e){
            e.printStackTrace();
            return false;
        }
    }
    @Override
    public void read() {
        try {
            FileReader fileReader = new FileReader(this.FILE_PATH);
            BufferedReader reader = new BufferedReader(fileReader);
            for (String linea :  reader.lines().collect(Collectors.toList())){
                System.out.println(linea);
            }
            fileReader.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
