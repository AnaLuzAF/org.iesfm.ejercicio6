package org.iesfm.ejercicio6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class Ejercicio6 {

    private final static Logger log = LoggerFactory.getLogger(Ejercicio6.class);

    public static void main(String[] args) {
        // Obtener el nombre de un archivo:
        String sFichero = args[0];


        File f = new File(sFichero);
       log.info(f.getName());


        // Camino absoluto:
        log.info(f.getAbsolutePath());


        // Tamano:
        log.info(String.valueOf(f.length()));


        //Para saber si es un fichero, primero compruebo si existe:
        if (f.exists()) {
            log.info("El fichero " + sFichero + " existe");
        }else
            log.error("No existe");


        //Saber si es un fichero:
        if (f.isFile()){
            log.info("Es un fichero");
        }else{
            log.error("No es un fichero");
        }


        //Si es Directorio:
        if (f.isDirectory()){
            log.info("Es un directorio");
        }else{
            log.error("No es un directorio");
        }


        // Ultima modificacion:
        log.info(String.valueOf(f.lastModified()));

        // Si tiene permiso de escritura: boolean
        log.info(String.valueOf(f.canWrite()));

        // Si tiene permiso de lectura: boolean
        log.info(String.valueOf(f.canRead()));

        // Si tiene permiso de ejecucion: boolean
        log.info(String.valueOf(f.canExecute()));
    }
    }

