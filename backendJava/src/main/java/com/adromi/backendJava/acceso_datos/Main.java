package com.adromi.backendJava.acceso_datos;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        generarExcel();
    }

    private static void generarExcel() {
        List<Datos> lista = new ArrayList<>(List.of(new Datos(1,
                        "Proyector averiado en Sala de Reuniones B",
                        "El proyector principal no da imagen y la luz de estado parpadea en rojo tras encenderlo.",
                        "https://midominio.com/archivos/img_incidencia_001.jpg",
                        "Alta",
                        "Abierta",
                        LocalDateTime.of(2026, 11, 9, 9, 15),
                        LocalDateTime.of(2026, 11, 10, 12, 0),
                        102,
                        4,
                        23,
                        0,
                        0),

                new Datos(2,
                        "Fuga de agua en lavabos de la planta baja",
                        "El lavabo número 3 tiene un goteo constante en la tubería inferior, creando un charco.",
                        "https://midominio.com/archivos/img_incidencia_002.jpg",
                        "Media",
                        "En progreso",
                        LocalDateTime.of(2026, 11, 9, 11, 30),
                        LocalDateTime.of(2026, 11, 9, 18, 0),
                        45,
                        2,
                        12,
                        7,
                        3)));

        //Creamos el libro de excel
        try (XSSFWorkbook libro = new XSSFWorkbook(); FileOutputStream archivo_excel = new FileOutputStream("docs/excel_BDD.xlsx")) {

            //Creamos una hoja en excel
            Sheet hoja = libro.createSheet("Incidencias");

            //Creamos la fila donde se empezara a colocar valores, en este caso al ser la row 0 son los titulos
            Row row = hoja.createRow(0);
            row.createCell(0).setCellValue("id_incidencia");
            row.createCell(1).setCellValue("titulo");
            row.createCell(2).setCellValue("descripcion");
            row.createCell(3).setCellValue("foto_url");
            row.createCell(4).setCellValue("prioridad");
            row.createCell(5).setCellValue("estado");
            row.createCell(6).setCellValue("fecha_creacion");
            row.createCell(7).setCellValue("fecha_objetivo");
            row.createCell(8).setCellValue("id_espacio");
            row.createCell(9).setCellValue("id_categoria");
            row.createCell(10).setCellValue("id_usuario");
            row.createCell(11).setCellValue("id_usuario_tecnico");
            row.createCell(12).setCellValue("id_proveedor");

            //Bucle para leer toda la lista e implementar los datos dentro del Excel
            for (int i = 0; i < lista.size(); i++) {

                row = hoja.createRow(1+i); // Le sumamos 1 para que escoga la fila 1, ya que la 0 tiene los titulos
                row.createCell(0).setCellValue(lista.get(i).getIdIncidencia());
                row.createCell(1).setCellValue(lista.get(i).getTitulo());
                row.createCell(2).setCellValue(lista.get(i).getDescripcion());
                row.createCell(3).setCellValue(lista.get(i).getFotoUrl());
                row.createCell(4).setCellValue(lista.get(i).getPrioridad());
                row.createCell(5).setCellValue(lista.get(i).getEstado());
                row.createCell(6).setCellValue(lista.get(i).getFechaCreacion());
                row.createCell(7).setCellValue(lista.get(i).getFechaObjetivo());
                row.createCell(8).setCellValue(lista.get(i).getIdEspacio());
                row.createCell(9).setCellValue(lista.get(i).getIdCategoria());
                row.createCell(10).setCellValue(lista.get(i).getIdUsuario());
                row.createCell(11).setCellValue(lista.get(i).getIdUsuarioTecnico());
                row.createCell(12).setCellValue(lista.get(i).getIdProveedor());

                //Aqui implementar log para cada usuario agregado, con contador para agregados correctamente.
            }

            // Codigo para ejecutar y crear libro
            libro.write(archivo_excel);

        } catch (IOException e) {
            //Aqui implementar log para cada usuario que falla al agregar , con contador para no agregados.
            throw new RuntimeException(e);
        }

    }
}
