/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionsql;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

/**
 *
 * @author fer
 */
public class ConexionSql {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException{
        // TODO code application logic here
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Introduzca nombre:");
        String nombre = entrada.readLine();
        System.out.println("Introduzca contraseña:");
        String passw = entrada.readLine();
        System.out.println("Introduzca direccion:");
        String direccion = entrada.readLine();
        System.out.println("Introduzca telefono (solo numeros):");
        int telefono = Integer.parseInt(entrada.readLine());
        
        try{
            Connection cn;
            Statement st;
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas?", "root", "MySQL_2016");
            st = cn.createStatement();
            
            String tsql = "insert into agenda values ('"+nombre+"', '"+passw+"', '"+direccion+"', '"+telefono+"')";
            
            st.execute(tsql);
            cn.close();
            
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
