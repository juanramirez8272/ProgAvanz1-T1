// eLABORADO POR KAREN LORENA MOLANO ARIAS CC 1002543562 Y JUAN JOSE RAMIREZ GUTIERREZ CC 1002543562
// LENGUAJE DE PROGRAMACION AVANZADA 1 - 2023-2 UNIREMINGTON
package modelo;

import bean.Vehiculo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class ArregloVehiculo {

    private ArrayList<Vehiculo> lista;

    public ArregloVehiculo() {
        lista = new ArrayList<Vehiculo>();
        cargar();
    }

    public String adicionar(Vehiculo v) {
        String mensaje;
        Vehiculo x = buscar(v.getCodigo());
        if (x == null) {
            lista.add(v);
            mensaje = "Vehículo guardado correctamente";
        } else {
            mensaje = "El vehículo ya existe";
        }
        return mensaje;
    }

    public void eliminar(Vehiculo v) {
        lista.remove(v);
    }

    public Vehiculo obtener(int posicion) {
        return lista.get(posicion);
    }

    public ArrayList<Vehiculo> obtTipov(String tipov) {
        ArrayList<Vehiculo> listVehiTipo = new ArrayList<Vehiculo>();
        Vehiculo v;
        for (int i = 0; i < lista.size(); i++) {
            if (obtener(i).getTipov().equalsIgnoreCase(tipov)) {
                v = obtener(i);
                listVehiTipo.add(v);
            }
        }
        return listVehiTipo;
    }

    public Vehiculo buscar(int codigo) {
        Vehiculo v = null;

        for (int i = 0; i < lista.size(); i++) {
            if (obtener(i).getCodigo() == codigo) {
                v = obtener(i);
                i = lista.size();
            }
        }
        return v;
    }

    public int buscarPosicion(int codigo) {
        int posicion = -1;
        for (int i = 0; i < lista.size(); i++) {
            if (obtener(i).getCodigo() == codigo) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    public void actualizar(Vehiculo v) {
        lista.set(buscarPosicion(v.getCodigo()), v);
    }

    public int totalVehi() {
        return lista.size();
    }

    private void cargar() {
        try {
            File archivo = new File("./archivos/vehiculos.txt");
            if (archivo.exists()) {
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("./archivos/vehiculos.txt"), "CP1252"));
                String linea;

                while ((linea = br.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(linea, ",");

                    int cod = Integer.parseInt(st.nextToken().trim());
                    String tipov = st.nextToken().trim();

                    double costo = Double.parseDouble(st.nextToken().trim());

                    Vehiculo v = new Vehiculo(cod, tipov, costo);
                    adicionar(v);
                }
                br.close();
            } else {
                JOptionPane.showMessageDialog(null, "El archivo vehiculos.txt no existe");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al cargar txt: " + e.toString());
        }

    }

    public void grabar() {
        try {
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("./archivos/vehiculos.txt"), "CP1252"));
            for (int i = 0; i < totalVehi(); i++) {
                pw.println(obtener(i).getCodigo() + "," + obtener(i).getTipov() + ","
                        + obtener(i).getCosto());
            }
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al grabar txt: " + e.toString());
        }
    }
}
