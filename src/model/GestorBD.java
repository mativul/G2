/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author Usuario
 */
public class GestorBD {

    public String cadena = "jdbc:sqlserver://MatiPC:1433;databaseName=MuseoDB";
    public String user = "sa";
    public String pass = "2016";
    private Connection conn;
    private int ss = 0;

    private void abrirConexion() throws SQLException {
        conn = DriverManager.getConnection(cadena, user, pass);
    }

    private void cerrarConexion() throws SQLException {
        conn.close();
    }

    ////////// MOSTRAR ARTISTA /////////
    public ArrayList<Obra> mostrarObra() {
        ArrayList<Obra> listitaA = new ArrayList<>();

        try {
            abrirConexion();
            Statement stmt = conn.createStatement();
            ResultSet query = stmt.executeQuery("SELECT o.id_Obra, a.nombre, o.nombreObra, o.genero, o.valuacion, o.descripcion, o.alto, o.ancho, o.ingreso FROM Obras o JOIN Artistas a ON o.id_artista = a.id_artista ORDER BY 1");
            while (query.next()) {
                int id_obra = query.getInt("id_Obra");
                String nombre = query.getString("nombre");
                String nombreObra = query.getString("nombreObra");
                String genero = query.getString("genero");
                float valuacion = query.getFloat("valuacion");
                String descripcion = query.getString("descripcion");
                int alto = query.getInt("alto");
                int ancho = query.getInt("ancho");
                String ingreso = query.getString("ingreso");

                Obra a = new Obra(id_obra, nombre, nombreObra, genero, valuacion, descripcion, alto, ancho, ingreso);
                listitaA.add(a);
            }
            query.close();
            stmt.close();
            cerrarConexion();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return listitaA;

    }

    public ArrayList<Artista> mostrarArtista() {
        ArrayList<Artista> listaArtista = new ArrayList<>();

        try {
            abrirConexion();
            Statement stmt = conn.createStatement();
            ResultSet query = stmt.executeQuery("SELECT a.id_artista, a.nombre, a.apellido,c.descripcion FROM Artistas a JOIN Ciudades c ON a.id_ciudad = c.id_ciudad");
            while (query.next()) {
                int id_artista = query.getInt("id_artista");
                String nombreArtista = query.getString("nombre");
                String apellidoArtista = query.getString("apellido");
                String ciudad = query.getString("descripcion");

                Artista aa = new Artista(id_artista, nombreArtista, apellidoArtista, ciudad);
                listaArtista.add(aa);
            }
            query.close();
            stmt.close();
            cerrarConexion();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return listaArtista;

    }
    ////////// MOSTRAR EXPOCICION /////////

    public ArrayList<Expocicion> mostrarExpocicion() {
        ArrayList<Expocicion> listitaE = new ArrayList<>();

        try {
            abrirConexion();
            Statement stmt = conn.createStatement();
            ResultSet query = stmt.executeQuery("SELECT e.id_exposicion,e.nombre ,v.descripcion, e.fecha_Inicio, e.fecha_Fin, e.horario FROM exposiciones e JOIN visitas v ON e.id_visita = v.id_visita");
            while (query.next()) {
                int id_expocicion = query.getInt("id_exposicion");
                String nombre = query.getString("nombre");
                String visita = query.getString("descripcion");
                String fechaInicio = query.getString("fecha_Inicio");
                String fechaFin = query.getString("fecha_Fin");
                String horario = query.getString("horario");

                Expocicion e = new Expocicion(id_expocicion,visita, fechaInicio, fechaFin,nombre  ,horario);
                listitaE.add(e);
            }
            query.close();
            stmt.close();
            cerrarConexion();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return listitaE;

    }

    public loginPersona Login(String nombres, int dni) {
        int id = 0;
        loginPersona e = new loginPersona();
        e = null;
        try {
            abrirConexion();
            Statement stmt = conn.createStatement();
            String cadena = "select id_empleado , e.nombre, c.descripcion  from Empleados e join Cargos c on e.id_cargoEmpleado = c.id_cargoEmpleado where nombre = '" + nombres + "' and dni = " + dni + "";
            ResultSet query = stmt.executeQuery(cadena);

            while (query.next()) {
                id = query.getInt("id_empleado");
                String nombre = query.getString("nombre");
                String descripcion = query.getString("descripcion");

                e = new loginPersona(id, nombre, descripcion);

            }
            if (id == 0) {
                query.close();
                stmt.close();
                cerrarConexion();
                e = new loginPersona(0, "", "");
                return e;
            }

            query.close();
            stmt.close();
            cerrarConexion();
            abrirConexion();

            abrirConexion();
            PreparedStatement stmt1 = conn.prepareStatement("update Empleados set bandera = 1 where id_empleado=?");

            stmt1.setInt(1, id);

            stmt1.executeUpdate();
            stmt1.close();
            cerrarConexion();

        } catch (SQLException ex) {
            System.out.println(ex);

        }
        return e;

    }

    public ArrayList<Restauracion> mostarResta() {
        ArrayList<Restauracion> listitaE = new ArrayList<>();

        try {
            abrirConexion();
            Statement stmt = conn.createStatement();
            ResultSet query = stmt.executeQuery("select o.id_obra, r.restauracionObra , r.restauracion,o.nombreObra   , e.nombre , e.apellido\n"
                    + "from RestauracionObras r join Obras o on r.id_obra=o.id_obra join "
                    + "Restauradores rr on r.id_encargadoRestauracion = rr.id_restauracion join Empleados e on rr.id_empleado= e.id_empleado\n"
                    + "where r.restauracionObra like 'si'");
            while (query.next()) {
                int id = query.getInt("id_obra");
                String restauracionObra = query.getString("restauracionObra");
                String restauracion = query.getString("restauracion");
                String nombreObra = query.getString("nombreObra");
                String nombre = query.getString("nombre");
                String apellido = query.getString("apellido");

                Restauracion e = new Restauracion(id, restauracionObra, restauracion, nombreObra, nombre, apellido);
                listitaE.add(e);
            }
            query.close();
            stmt.close();
            cerrarConexion();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return listitaE;

    }

    public ArrayList<Ticket> mostrarTicket() {
        ArrayList<Ticket> listitaT = new ArrayList<>();

        try {
            abrirConexion();
            Statement stmt = conn.createStatement();
            ResultSet query = stmt.executeQuery("SELECT t.id_ticket, e.nombre, t.fecha, e.monto from tickets t join Exposiciones e on e.id_exposicion = t.id_exposiciones ");
            while (query.next()) {
                int id_ticket = query.getInt("id_ticket");
                String nombre = query.getString("nombre");
                String fecha = query.getString("fecha");
                double monto = query.getDouble("monto");

                Ticket t = new Ticket(id_ticket, nombre, fecha, monto);
                listitaT.add(t);
            }
            query.close();
            stmt.close();
            cerrarConexion();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return listitaT;

    }

    public ArrayList<Artista> llenarCombo() {
        ArrayList<Artista> lista = new ArrayList<Artista>();
        try {
            abrirConexion();

            Statement stmt = conn.createStatement();

            ResultSet query = stmt.executeQuery("select * from Artistas");
            while (query.next()) {
                int id = query.getInt(1);
                String nombre = query.getString("nombre");

                Artista es = new Artista(id, nombre);

                lista.add(es);
            }
            stmt.close();

            query.close();

            cerrarConexion();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return lista;
    }

    public ArrayList<Ciudad> llenarComboCiudad() {
        ArrayList<Ciudad> lista = new ArrayList<Ciudad>();
        try {
            abrirConexion();

            Statement stmt = conn.createStatement();

            ResultSet query = stmt.executeQuery("select top(20)id_ciudad,descripcion from Ciudades");
            while (query.next()) {
                int id = query.getInt("id_ciudad");
                String descripcion = query.getString("descripcion");

                Ciudad es = new Ciudad(id, descripcion);

                lista.add(es);
            }
            stmt.close();

            query.close();

            cerrarConexion();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return lista;
    }

    public void RegistarObras(Obra o) {

        try {
            abrirConexion();
            PreparedStatement stmt = conn.prepareStatement("exec agregarobra ?,?,?,?,?,?,?,? ");

            stmt.setInt(1, o.id_artista);
            stmt.setString(2, o.getNombre());
            stmt.setString(3, o.getGenero());
            stmt.setFloat(4, o.getValuacion());
            stmt.setString(5, o.getDescripcion());
            stmt.setInt(6, o.getAncho());
            stmt.setInt(7, o.getAlto());
            stmt.setString(8, o.getIngreso());
            stmt.executeUpdate();

            stmt.close();
            cerrarConexion();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void ModificarObras(Obra o) {
        try {
            abrirConexion();
            PreparedStatement stmt = conn.prepareStatement("exec modificarObras ?,?,?,?,?,?,?,?,? ");

            stmt.setInt(1, o.id_obra);
            stmt.setInt(2, o.id_artista);
            stmt.setString(3, o.getNombre());
            stmt.setString(4, o.getGenero());
            stmt.setFloat(5, o.getValuacion());
            stmt.setString(6, o.getDescripcion());
            stmt.setInt(7, o.getAlto());
            stmt.setInt(8, o.getAlto());
            stmt.setString(9, o.getIngreso());
            stmt.executeUpdate();

            stmt.close();
            cerrarConexion();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void EliminarObra(int id) {
        try {
            abrirConexion();
            PreparedStatement stmt = conn.prepareStatement("delete from Obras where id_obra=? ");

            stmt.setInt(1, id);

            stmt.executeUpdate();

            stmt.close();
            cerrarConexion();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void RegistrarAutor(Artista a) {
        try {
            abrirConexion();
            PreparedStatement stmt = conn.prepareStatement("insert into Artistas (nombre,apellido,id_ciudad) values(?,?,?)");

            stmt.setString(1, a.getNombre());
            stmt.setString(2, a.getApellido());
            stmt.setInt(3, a.getCiudadd());
            stmt.executeUpdate();

            stmt.close();
            cerrarConexion();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void RegistarRestauracion(String a, String b, int c, int d) {

        try {
            abrirConexion();
            PreparedStatement stmt = conn.prepareStatement("agregarRestauracion ?,?,?,? ");

            stmt.setString(1, a);
            stmt.setString(2, b);
            stmt.setInt(3, c);
            stmt.setInt(4, d);

            stmt.executeUpdate();

            stmt.close();
            cerrarConexion();
        } catch (SQLException ex) {
            System.out.println(ex);

        }

    }

    public ArrayList<Restauradores> MostarRestauradores() {
        ArrayList<Restauradores> artista = new ArrayList<>();

        try {
            abrirConexion();
            Statement stmt = conn.createStatement();
            ResultSet query = stmt.executeQuery("select r.id_restauracion , e.nombre ,e.apellido from restauradores r inner join empleados e on r.id_empleado=e.id_empleado");
            while (query.next()) {
                int id_artista = query.getInt("id_restauracion");
                String nombre = query.getString("nombre");
                String nombreObra = query.getString("apellido");

                Restauradores a = new Restauradores(id_artista, nombre, nombreObra);
                artista.add(a);
            }
            query.close();
            stmt.close();
            cerrarConexion();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return artista;

    }

    public String versiono(int dni) {

        String e = "";
        try {
            abrirConexion();
            Statement stmt = conn.createStatement();
            String cadena = "select restauracionObra from RestauracionObras where id_obra = " + dni + "";
            ResultSet query = stmt.executeQuery(cadena);

            while (query.next()) {

                String nombre = query.getString("restauracionObra");

                e = nombre;

            }
            query.close();
            stmt.close();
            cerrarConexion();
        } catch (SQLException ex) {
            System.out.println(ex);

        }
        return e;

    }

    public void modificarRest(int id) {

        try {
            abrirConexion();
            PreparedStatement stmt = conn.prepareStatement(" UPDATE  RestauracionObras set restauracionObra = ?  where id_obra=? ");
            stmt.setString(1, "no");
            stmt.setInt(2, id);

            stmt.executeUpdate();

            stmt.close();
            cerrarConexion();
        } catch (SQLException ex) {
            System.out.println(ex);

        }

    }

    public void EliminarRest(int id) {

        try {
            abrirConexion();
            PreparedStatement stmt = conn.prepareStatement(" delete  RestauracionObras  where id_obra=? ");

            stmt.setInt(1, id);

            stmt.executeUpdate();

            stmt.close();
            cerrarConexion();
        } catch (SQLException ex) {
            System.out.println(ex);

        }
    }
    ////// CARGAR COMBO DE GUIAS  ////

    public ArrayList<Empleado> comboGuias() {
        ArrayList<Empleado> guias = new ArrayList<>();

        try {
            abrirConexion();
            Statement stmt = conn.createStatement();
            ResultSet query = stmt.executeQuery("select id_empleado ,nombre ,apellido from empleados e where id_cargoEmpleado = 4 ");
            while (query.next()) {
                int id_empleado = query.getInt("id_empleado");
                String nombre = query.getString("nombre");
                String apellido = query.getString("apellido");

                Empleado e = new Empleado(id_empleado, nombre, apellido);
                guias.add(e);
            }
            query.close();
            stmt.close();
            cerrarConexion();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return guias;

    }

    ///// Metodo para registrar  /////
    public void registrarExpocicion(int id_visita, int id_empleado, String monto, String fecha_i, String fecha_f,String nombre , String horario) {

        

        try {
            abrirConexion();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Exposiciones (id_visita, id_empleado, monto, fecha_inicio, fecha_fin, nombre ,horario) values ( ?,?,?,?,?,?,?)");

            stmt.setInt(1, id_visita);
            stmt.setInt(2, id_empleado);
            stmt.setString(3, monto);
            stmt.setString(4, fecha_i);
            stmt.setString(5, fecha_f);
            stmt.setString(6, nombre);
            stmt.setString(7, horario);

            stmt.executeUpdate();
            stmt.close();
            cerrarConexion();
        } catch (SQLException ex) {
            System.out.println(ex);

        }

    }

    public void eliminarArtista(int id) {

        try {
            abrirConexion();
            PreparedStatement ps = conn.prepareStatement("delete Artistas where id_artista = ?");
            ps.setInt(1, id);
            ps.executeQuery();
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void ModificarArtista(Artista a) {

        try {
            abrirConexion();
            PreparedStatement ps = conn.prepareStatement("update Artistas set nombre=? , apellido=? , id_ciudad=? where id_artista = ?");
            ps.setString(1, a.getNombre());
            ps.setString(2, a.getApellido());
            ps.setInt(3, a.getCiudadd());
            ps.setInt(4, a.getId_artista());
            ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    public ArrayList<ExposisionesCombo> mostrarExposision() {
        ArrayList<ExposisionesCombo> listitaT = new ArrayList<>();

        try {
            abrirConexion();
            Statement stmt = conn.createStatement();
            ResultSet query = stmt.executeQuery("select id_exposicion , nombre from Exposiciones ");
            while (query.next()) {
                ExposisionesCombo t = new ExposisionesCombo();
                t.setId( query.getInt("id_exposicion"));
                t.setNombre( query.getString("nombre"));

                
                listitaT.add(t);
            }
            query.close();
            stmt.close();
            cerrarConexion();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return listitaT;

    }

    public ArrayList<Obra> mostrarObraPorExpo(int id) {
        ArrayList<Obra> listitaA = new ArrayList<>();

        try {
            abrirConexion();
            Statement stmt = conn.createStatement();
            ResultSet query = stmt.executeQuery("select oe.id_obras, o.nombreObra  from Obras_Exposiciones oe inner join Obras o on oe.id_obras=o.id_obra  where id_exposicion =" + id + "order by 1");
            while (query.next()) {

                Obra a = new Obra();

                a.setId_obra(query.getInt("id_obras"));

                a.setNombre(
                        query.getString("nombreObra"));

                listitaA.add(a);
            }
            query.close();
            stmt.close();
            cerrarConexion();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return listitaA;

    }

    public ArrayList<Obra> mostrarObrasinExpo() {
        ArrayList<Obra> listitaA = new ArrayList<>();

        try {
            abrirConexion();
            Statement stmt = conn.createStatement();
            ResultSet query = stmt.executeQuery("select o.id_obra , o.nombreObra  from  Obras o   where  o.id_obra not in (select id_obras from Obras_Exposiciones)");
            while (query.next()) {
                Obra a = new Obra();

                a.setId_obra(query.getInt("id_obra"));

                a.setNombre(
                        query.getString("nombreObra"));
                listitaA.add(a);
            }
            query.close();
            stmt.close();
            cerrarConexion();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return listitaA;

    }

    public void EliminarObraExpo(int id, int idObra) {
        try {
            abrirConexion();
            PreparedStatement stmt = conn.prepareStatement("delete Obras_Exposiciones where id_obras=? and id_exposicion=?  ");

            stmt.setInt(1, id);
            stmt.setInt(2, idObra);

            stmt.executeUpdate();

            stmt.close();
            cerrarConexion();
        } catch (SQLException ex) {
            System.out.println(ex);

        }

    }

    public void AgregarObraExpo(int idobra, int idexpo) {
        try {
            abrirConexion();
            PreparedStatement stmt = conn.prepareStatement("insert into Obras_Exposiciones (id_obras,id_exposicion) values (?,?)");

            stmt.setInt(1,idobra);
            stmt.setInt(2,idexpo);

            stmt.executeUpdate();

            stmt.close();
            cerrarConexion();
        } catch (SQLException ex) {
            System.out.println(ex);

        }

    }

    public void EliminarExpo(int id) {
        try {
            abrirConexion();
            PreparedStatement stmt = conn.prepareStatement("delete Exposiciones where id_exposicion=?  ");

            stmt.setInt(1, id);

            stmt.executeUpdate();

            stmt.close();
            cerrarConexion();
        } catch (SQLException ex) {
            System.out.println(ex);

        }

    }

    public String LoginEmple() {
        String listitaA = "";

        try {
            abrirConexion();
            Statement stmt = conn.createStatement();
            ResultSet query = stmt.executeQuery("select e.id_empleado  , c.descripcion  from Empleados e inner join Cargos c on e.id_cargoEmpleado=c.id_cargoEmpleado where bandera = 1");
            while (query.next()) {
                Obra a = new Obra();

                ss = query.getInt("id_empleado");

                listitaA = query.getString("descripcion");

            }
            query.close();
            stmt.close();
            cerrarConexion();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return listitaA;

    }

    public void CerraEmple(int id) {

        try {

            abrirConexion();
            PreparedStatement stmt1 = conn.prepareStatement("update Empleados set bandera = 0 where id_empleado=?");

            if (id == 0) {

                stmt1.setInt(1, ss);
            } else {

                stmt1.setInt(1, id);
            }

            stmt1.executeUpdate();
            stmt1.close();
            cerrarConexion();

        } catch (SQLException ex) {
            System.out.println(ex);

        }

    }

}
