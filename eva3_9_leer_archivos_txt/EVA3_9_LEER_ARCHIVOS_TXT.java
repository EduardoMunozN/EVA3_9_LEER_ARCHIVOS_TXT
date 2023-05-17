/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva3_9_leer_archivos_txt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author eduar
 */
public class EVA3_9_LEER_ARCHIVOS_TXT {
     final static String RUTA = "c:\\ARCHIVOS\\PRUEBA.txt";
    public static void main(String[] args) {
        try{
        readUsingFiles(RUTA);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
    
    //FILES: Se lee todo el contenido del archivo y se transfiere a memoria principal (RAM)
    //Es útil con archivos pequeños
    
    public static void readUsingFiles(String ruta) throws IOException{
        //CONSTRUIMOS UNA RUTA EN BASE A LA CADENA DE TEXTO.
        Path path = Paths.get(ruta);
        
        //List<String> todasLineas = Files.readAllLines(path);
        //System.out.println("RESULTADOS");
        //System.out.println(todasLineas.toString());
        //for (int i = 0; i < todasLineas.size(); i++) {
        //System.out.println(todasLineas.get(i));
        //}
        
        byte[]bytes = Files.readAllBytes(path);
        System.out.println(new String(bytes));
    }
}
