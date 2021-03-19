/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lamda.testes;

import edu.lamda.entities.Evenement;
import edu.lamda.services.EvenementCRUD;
import edu.lamda.tools.MyConnextion;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Calendar;

//import java.text.SimpleDateFormat;
//import java.util.Date;
/**
 *
 * @author arfaoui
 */
public class MainClass {

    public static void main(String[] args) {

        //Evenement e1 = new Evenement("ali", "hglkjhg", "15h", 7);
        MyConnextion mc = MyConnextion.getInstance();

        EvenementCRUD evc = new EvenementCRUD();

        // evc.ajouterPersonne(ev);
        //evc.supprimerPersonne(2);
        // evc.ajouterPersonne(ev);
        //evc.supprimerEvenement(e);
        //evc.ajouterEvenement(e1);
        //evc.supprimerEvenement(5);
        //evc.modifierPersonne(e1);
        //evc.supprimerEvenementParNom("rahma");
       // Evenement ev2 = new Evenement("cccc", "cccc", "cccc", 15);

        //evc.ajouterEvenement(ev2);
        //evc.supprimerEvenementParId(7);
        //evc.supprimerEvenementParNom("aa");
        // DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        // Date d = new Date("2021-05-20") ;
        //String dateInString = "2021-05-18";
        // Date date = dateFormat.parse(dateInString);
        //System.out.println(d.toString());
        //System.out.println(date);
        // Evenement ev7 = new Evenement("testf", "testf", "12h", 20 ,date  );
        //evc.ajouterEvenement(ev1);
        // evc.modifierPersonne2(8, "test", "test", "11h", 3);
        // System.out.println( evc.chercherParNom("cccc"));
        //  Evenement ev3 = new Evenement("bbb", "ddd", "15h", 20);
        //  Evenement ev4 = new Evenement("zzzz", "dqdsf", "5h", 50);
        // Evenement ev = new Evenement("ddd", "dqdf", "qsd", 80);
//        evc.ajouterEvenement(ev);
//        evc.ajouterEvenement(ev3);
//        evc.ajouterEvenement(ev4);
        // System.out.println(evc.listEvenement());
        // System.out.println(evc.triEvenementParNom());
        // System.out.println(evc.triEvenementParNbpart());
        //evc.ajouterEvenementD(ev7);
//       evc.supprimerEvenementParId(1);
//              evc.supprimerEvenementParId(9);
//       evc.supprimerEvenementParId(10);
//       evc.supprimerEvenementParId(11);
//       evc.supprimerEvenementParId(40);
//       evc.supprimerEvenementParId(41);
//       evc.supprimerEvenementParId(42);
        //System.out.println(evc.chercherParNom("test"));
        // evc.supprimerEvenementParNom("test");
        //System.out.println(evc.triEvenementParNom());
        
                
//
//        String str1 = "2021-07-05";
//        java.sql.Date date1 = java.sql.Date.valueOf(str1);//converting string into sql date
//
//        String str2 = "2020-01-03";
//        java.sql.Date date2 = java.sql.Date.valueOf(str2);//converting string into sql date
//
//        String str3 = "2021-02-16";
//        java.sql.Date date3 = java.sql.Date.valueOf(str3);//converting string into sql date 
//
//        String str4 = "2021-03-30";
//        java.sql.Date date4 = java.sql.Date.valueOf(str4);//converting string into sql date
//
//        
//        Evenement e1 = new Evenement("bbb", "douz", "15h", 50, date1);
//        Evenement e2 = new Evenement("ccc", "nabeul", "8h", 60, date2);
//        Evenement e3 = new Evenement("zzz", "beja", "8h", 100, date3);
//        Evenement ev = new Evenement("test", "ariana", "17h", 150, date4);

//        
//        evc.ajouterEvenementD(e3);
//        evc.ajouterEvenementD(e);
//        evc.ajouterEvenementD(e2);
//        evc.ajouterEvenementD(e1);
//        evc.ajouterEvenementD(ev);

        //System.out.println(evc.triEvenementParDate());
        //System.out.println(evc.chercherParNom("ahmed"));
        // System.out.println(evc.listEvenement2());
        //evc.supprimerEvenementTerminer();
        // System.out.println(evc.listEvenement());
        //evc.ajouterEvenementD(ev);
        //evc.supprimerEvenementParId(68);
        //evc.supprimerEvenementParNom("aaa");
        //evc.modifierPersonne(55, ev);
        //evc.modifierPersonne2(51, "ali", "rh", "12h", 30);
        //System.out.println(evc.listEvenement());
        //System.out.println(evc.chercherParNom("med"));
        //System.out.println(evc.chercherParid(59));
        //System.out.println(evc.triEvenementParDate());
        
        //evc.modifierPersonneAvecDate(71, "mmm", "marsa", "9h", 70, date);
        
         String str = "2021-05-12";
        java.sql.Date date = java.sql.Date.valueOf(str);//converting string into sql date 
        
        //Evenement e = new Evenement("esprit", "esprit", "12h", 20, date);
        
        Evenement e1 = new Evenement("aaaaaaaaa", "aaaaaaaa", "12h", 20, date);
        //evc.ajouterEvenementD(e);
        
        //evc.modifierEvenement(71, e1);
        //evc.ajouterEvenementD(e1);
        
        //evc.supprimerEvenementParNom("aaaaaaaaa");
        //evc.supprimerEvenementParId(79);
        //System.out.println(evc.chercherParid(69));
        
        //System.out.println(evc.triEvenementParDate());
        
       // System.out.println(evc.triEvenementParNbpart());
       
        //System.out.println(evc.chercherParNom("test"));
        //System.out.println(evc.listEvenement());
       // evc.chercherParNom("hhhh");
        evc.supprimerEvenementParId(1);
    }

}
