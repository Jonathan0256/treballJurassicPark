/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.boscdelacoma.connection.impl.files;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDades {
    public static void main (String args[]){
        new BaseDades();
    }
    public BaseDades(){

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jurassicpark", "root", "")) {
            System.out.println("Connectat");
        }catch(SQLException e){
            System.out.println("Excepcio: " +e.getMessage());
        }
    }
}
