/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.management.Query.and;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author MG
 */
public class PersonelIslemleri {
    private Connection con = null;
    private CallableStatement cst = null;

    private Statement statement = null;
    private PreparedStatement ps = null;

    public ArrayList<Personel> personelleriGetir() {

        ArrayList<Personel> sonuc = new ArrayList<Personel>();

        try {
            statement = con.createStatement();
            String sorgu = "Select * From personel";

            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                int sicilNo = rs.getInt("sicilNo");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String birim = rs.getString("subeNo");
                String durum = rs.getString("durum");
                String baslama = rs.getString("baslamaTarihi");
                String dob = rs.getString("DOB");

                sonuc.add(new Personel(sicilNo, ad, soyad, birim, durum, baslama, dob));


            }
            return sonuc;


        } catch (SQLException ex) {
            Logger.getLogger(PersonelIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        }
        
       


    }
    

    public void personelGuncelle( int sicilNo, String yeni_ad, String yeni_soyad, String yeni_subeNo, String yeni_durum, String yeni_baslamaTarihi, String yeni_dob) {
        String sorgu = "Update personel set ad = '?' , soyad = '?' , subeNo = '?' , durum = '?', baslamaTarihi = '?', dob = '?' where id = '?'";

        try {
            ps = con.prepareStatement(sorgu);


           /* ps.setString(1, yeni_ad);
            ps.setString(2, yeni_soyad);

            ps.setString(3, yeni_subeNo);
            ps.setString(4, yeni_durum);
            ps.setString(5, yeni_baslamaTarihi);
            ps.setString(6, yeni_dob);

            ps.setInt(7, sicilNo);
            
            ps.executeUpdate();*/

            ps.executeQuery("UPDATE personel SET ad ='"+yeni_ad+"', soyad ='"+yeni_soyad+"' , subeNo ='"+yeni_subeNo+"' , durum ='"+yeni_durum+"', baslamaTarihi ='"+yeni_baslamaTarihi+"', dob ='"+yeni_dob+"' where sicilNo ='"+sicilNo+"'");


        } catch (SQLException ex) {
            Logger.getLogger(PersonelIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

   public void personelSil(int sicilno) {

        String sorgu = "Delete from personel where sicilno = '?'";

        try {
            ps = con.prepareStatement(sorgu);
            //ps.setInt(1, sicilno);

            //ps.executeUpdate();
            ps.executeQuery("DELETE FROM personel WHERE sicilno ='"+sicilno+"'");

        } catch (SQLException ex) {
            Logger.getLogger(PersonelIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    public void personelEkle(int sicilNo, String ad, String soyad, String subeNo, String durum, String baslamaTarihi, String dob) {

        String sorgu = "Insert Into personel (sicilNo,ad,soyad,subeNo,durum,baslamaTarihi,dob) VALUES(?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sorgu);


            ps.setInt(1, sicilNo);
            ps.setString(2, ad);
            ps.setString(3, soyad);
            ps.setString(4, subeNo);
            ps.setString(5, durum);
            ps.setString(6, baslamaTarihi);
            ps.setString(7, dob);

            ps.executeUpdate();


        } catch (SQLException ex) {
            Logger.getLogger(PersonelIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
    
     public void userEkle(String ad, String passwd, int crd) {

        String sorgu = "Insert Into users (username,password,rol) VALUES(?,?,?)";

        try {
            ps = con.prepareStatement(sorgu);


            ps.setString(1, ad);
            ps.setString(2, passwd);
            ps.setInt(3, crd);
           
            ps.executeUpdate();


        } catch (SQLException ex) {
            Logger.getLogger(PersonelIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
     
     public void subeEkle(String sube_no, String sube_adi) {
         

       // String sorgu = "Insert Into subeler (subeno,subeadi) VALUES(?,?)";

        try {
            //String sorgu = "CALL sube_ekle(sube_no, 'sube_adi')";
            cst = con.prepareCall("{call sube_ekle(?,?)}");
            cst.setString(1, sube_no);
            cst.setString(2, sube_adi);

            cst.execute();
            
            //cst.executeQuery("{CALL sube_ekle(sube-no,sube_adi)}");
            /*ps = con.prepareStatement(sorgu);
            ps.setString(1, sno);
            ps.setString(2, sadi);
           
            ps.executeUpdate();*/


        } catch (SQLException ex) {
            Logger.getLogger(PersonelIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    public boolean girisYap(String kullanici_adi, String parola) {

        String sorgu = "SELECT * FROM users WHERE username = ? and password = ? ";

        try {
           ps = con.prepareStatement(sorgu);
           // ps.setString(2, kullanici_adi);
           // ps.setString(3, parola);

            ResultSet rs = ps.executeQuery("SELECT * FROM users WHERE username='"+kullanici_adi+"' AND password ='"+parola+"'");

            return rs.next();

        } catch (SQLException ex) {
            Logger.getLogger(PersonelIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public PersonelIslemleri() {

        try {
            Class.forName(JavaConnect.driver);
            con = DriverManager.getConnection(JavaConnect.jdbUrl, JavaConnect.user, JavaConnect.pass);
           /* java.sql.Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM PERSONEL");
            if (rs.next()) {
                System.out.println(rs.getString("SICILNO"));
                System.out.println(rs.getString("AD"));
                System.out.println(rs.getString("SOYAD"));

            }
            con.close();*/
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showInputDialog(null, e);

        }


    }
}

 

