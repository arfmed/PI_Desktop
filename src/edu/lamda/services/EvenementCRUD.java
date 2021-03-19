/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lamda.services;

import edu.lamda.entities.Evenement;
import edu.lamda.interfaces.Ievenement;
import edu.lamda.tools.MyConnextion;
//import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
//import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arfaoui
 */
public class EvenementCRUD implements Ievenement<Evenement> {

    @Override
    public void ajouterEvenement(Evenement ev) {
        try {

            String requete = "INSERT INTO evenement (nom, lieu , heure , nbpart )" + "values (? ,? ,? ,?  ) ";
            PreparedStatement pst = MyConnextion.getInstance().getCnx().prepareStatement(requete);
            pst.setString(1, ev.getNom());
            pst.setString(2, ev.getLieu());
            pst.setString(3, ev.getHeure());
            pst.setInt(4, ev.getNbpart());
            // pst.setString(5, ev.getDate().toString());
            pst.executeUpdate();
            System.out.println("personne inserer");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void ajouterEvenementD(Evenement ev) {
        try {

            String requete = "INSERT INTO evenement (nom, lieu , heure , nbpart , date )" + "values (? ,? ,? ,? ,?  ) ";
            PreparedStatement pst = MyConnextion.getInstance().getCnx().prepareStatement(requete);
            pst.setString(1, ev.getNom());
            pst.setString(2, ev.getLieu());
            pst.setString(3, ev.getHeure());
            pst.setInt(4, ev.getNbpart());
//            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
//            String strDate = dateFormat.format(ev.getDate());  
//            pst.setString(5, strDate );

            pst.setDate(5, ev.getDate());
            pst.executeUpdate();
            System.out.println("personne inserer");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void supprimerEvenementParId(int ide) {
        try {
            String requete = "DELETE FROM test.`evenement`where id=?";
            PreparedStatement pst = MyConnextion.getInstance().getCnx()
                    .prepareStatement(requete);
            pst.setInt(1, ide);
            pst.executeUpdate();
            System.out.println("Personne supprimée");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void supprimerEvenementParNom(String nom) {
        try {
            String requete = "DELETE FROM test.`evenement`where nom=?";
            PreparedStatement pst = MyConnextion.getInstance().getCnx()
                    .prepareStatement(requete);
            pst.setString(1, nom);
            pst.executeUpdate();
            System.out.println("Personne supprimée");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void supprimerEvenementTerminer() {
        try {
            String requete = "DELETE  FROM test.`evenement` WHERE date < NOW()";
            PreparedStatement pst = MyConnextion.getInstance().getCnx()
                    .prepareStatement(requete);

            pst.executeUpdate();
            System.out.println(" les produit terminé ont ete supprimé");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    @Override
    public void modifierEvenement(int ide, Evenement ev) {
        try {
            String requete = "UPDATE evenement SET nom=? ,  lieu =? , heure=? , nbpart=?  WHERE id=?";
            PreparedStatement pst = MyConnextion.getInstance().getCnx()
                    .prepareStatement(requete);
            pst.setString(1, ev.getNom());
            pst.setString(2, ev.getLieu());
            pst.setString(3, ev.getHeure());
            pst.setInt(4, ev.getNbpart());
            pst.setInt(5, ide);
            pst.executeUpdate();
            System.out.println("Personne modifiée");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    @Override
    public void modifierEvenement2(int ide, String nom, String lieu, String heure, int nbpart) {
        try {
            String requete = "UPDATE evenement SET nom=? ,  lieu =? , heure=? , nbpart=?  WHERE id=?";
            PreparedStatement pst = MyConnextion.getInstance().getCnx()
                    .prepareStatement(requete);
            pst.setString(1, nom);
            pst.setString(2, lieu);
            pst.setString(3, heure);
            pst.setInt(4, nbpart);
            pst.setInt(5, ide);

            pst.executeUpdate();
            System.out.println("Personne modifiée");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void modifierPersonneAvecDate(int ide, String nom, String lieu, String heure, int nbpart , Date date) {
        try {
            String requete = "UPDATE evenement SET nom=? ,  lieu =? , heure=? , nbpart=? , date = ? WHERE id=?";
            PreparedStatement pst = MyConnextion.getInstance().getCnx()
                    .prepareStatement(requete);
            pst.setString(1, nom);
            pst.setString(2, lieu);
            pst.setString(3, heure);
            pst.setInt(4, nbpart);
            pst.setDate(5, (java.sql.Date) date);
            pst.setInt(6, ide);

            pst.executeUpdate();
            System.out.println("Personne modifiée");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public List<Evenement> listEvenement() {
        List<Evenement> listEvenement = new ArrayList<>();
        try {
            //supprimerEvenementTerminer();
            String requete = "SELECT * FROM evenement";
            Statement st = MyConnextion.getInstance().getCnx()
                    .createStatement();
            ResultSet rs = st.executeQuery(requete);
            while (rs.next()) {
                Evenement ev = new Evenement();
                ev.setId(rs.getInt("id"));
                ev.setNom(rs.getString(2));
                ev.setLieu(rs.getString(3));
                ev.setNbpart(rs.getInt("nbpart"));
                ev.setDate(rs.getDate("date"));
                listEvenement.add(ev);

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return listEvenement;

    }

    @Override
    public List<Evenement> chercherParNom(String nom) {

        List<Evenement> listEvenement = new ArrayList<>();
        try {
            //asupprimerEvenementTerminer();
            String requete = "SELECT * FROM evenement WHERE nom= '" + nom + "'";
            Statement st = MyConnextion.getInstance().getCnx()
                    .createStatement();
            // PreparedStatement pst = MyConnextion.getInstance().getCnx()
            // .prepareStatement(requete);
            ResultSet rs = st.executeQuery(requete);
            while (rs.next()) {
                Evenement ev = new Evenement();
                ev.setId(rs.getInt("id"));
                ev.setNom(rs.getString(2));
                ev.setLieu(rs.getString(3));
                ev.setNbpart(rs.getInt("nbpart"));
                // pst.setString(1, nom);
                ev.setDate(rs.getDate("date"));
                listEvenement.add(ev);

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        if (listEvenement.isEmpty()) {
            System.out.println("événements n'existe pas");

        }
        return listEvenement;
    }

    @Override
    public List<Evenement> chercherParid(int id) {

        List<Evenement> listEvenement = new ArrayList<>();
        try {
            //supprimerEvenementTerminer();
            String requete = "SELECT * FROM evenement WHERE id= '" + id + "'";
            Statement st = MyConnextion.getInstance().getCnx()
                    .createStatement();
            // PreparedStatement pst = MyConnextion.getInstance().getCnx()
            // .prepareStatement(requete);
            ResultSet rs = st.executeQuery(requete);
            while (rs.next()) {
                Evenement ev = new Evenement();
                ev.setId(rs.getInt("id"));
                ev.setNom(rs.getString(2));
                ev.setLieu(rs.getString(3));
                ev.setNbpart(rs.getInt("nbpart"));
                // pst.setString(1, nom);
                ev.setDate(rs.getDate("date"));
                listEvenement.add(ev);

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        if (listEvenement.isEmpty()) {
            System.out.println("événements n'existe pas");

        }
        return listEvenement;
    }

    @Override
    public List<Evenement> triEvenementParNom() {
        List<Evenement> listEvenement = new ArrayList<>();
        try {
            String requete = "SELECT * FROM evenement ORDER BY nom";
            Statement st = MyConnextion.getInstance().getCnx()
                    .createStatement();
            ResultSet rs = st.executeQuery(requete);
            while (rs.next()) {
                Evenement ev = new Evenement();
                ev.setId(rs.getInt("id"));
                ev.setNom(rs.getString(2));
                ev.setLieu(rs.getString(3));
                ev.setNbpart(rs.getInt("nbpart"));
                ev.setDate(rs.getDate("date"));
                listEvenement.add(ev);

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return listEvenement;
    }

    @Override
    public List<Evenement> triEvenementParNbpart() {
        List<Evenement> listEvenement = new ArrayList<>();
        try {
            supprimerEvenementTerminer();
            String requete = "SELECT * FROM evenement ORDER BY nbpart ";
            Statement st = MyConnextion.getInstance().getCnx()
                    .createStatement();
            ResultSet rs = st.executeQuery(requete);
            while (rs.next()) {
                Evenement ev = new Evenement();
                ev.setId(rs.getInt("id"));
                ev.setNom(rs.getString(2));
                ev.setLieu(rs.getString(3));
                ev.setNbpart(rs.getInt("nbpart"));
                ev.setDate(rs.getDate("date"));
                listEvenement.add(ev);

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return listEvenement;
    }

    @Override
    public List<Evenement> triEvenementParDate() {
        List<Evenement> listEvenement = new ArrayList<>();
        try {
            supprimerEvenementTerminer();
            String requete = "SELECT * FROM evenement ORDER BY date ";
            Statement st = MyConnextion.getInstance().getCnx()
                    .createStatement();
            ResultSet rs = st.executeQuery(requete);
            while (rs.next()) {
                Evenement ev = new Evenement();
                ev.setId(rs.getInt("id"));
                ev.setNom(rs.getString(2));
                ev.setLieu(rs.getString(3));
                ev.setNbpart(rs.getInt("nbpart"));
                ev.setDate(rs.getDate("date"));
                listEvenement.add(ev);

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return listEvenement;
    }

//    public List<Evenement> listEvenement2() {
//        List<Evenement> listEvenement = new ArrayList<>();
//        try {
//            String requete = "SELECT * FROM evenement WHERE date > NOW()";
//            Statement st = MyConnextion.getInstance().getCnx()
//                    .createStatement();
//            ResultSet rs = st.executeQuery(requete);
//            while (rs.next()) {
//                Evenement ev = new Evenement();
//                ev.setId(rs.getInt("id"));
//                ev.setNom(rs.getString(2));
//                ev.setLieu(rs.getString(3));
//                ev.setNbpart(rs.getInt("nbpart"));
//                ev.setDate(rs.getDate("date"));
//                listEvenement.add(ev);
//
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//        return listEvenement;
//    }

   

}
