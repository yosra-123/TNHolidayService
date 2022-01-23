/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnholidayservice1;

import java.util.Scanner;

/**
 *
 * @author yosra BK
 */
public class TNHolidayService1 {
    int mois;
    public void getHolidaysForMonth(int mois){
        //choix du mois
             Scanner sc =new Scanner(System.in);
		
	       System.out.println(" Taper le mois : ");
	      mois=sc.nextInt();
       
      
        if (mois <=12 && mois>=1){
            //la liste des jours férier
		switch(mois) {
		case 1 :
			System.out.println("Les jours  fériés de janvier sont: 1 et 4");
                        break;
		case 2 :
			System.out.println("Pas des jours  fériés");
                        break;
		case 3 :
			System.out.println("Le jour férié de Mars est: 20");
                        break;
		case 4 :
			System.out.println("Le jour férié de Avril est: 9");
                        break;
		case 5 :
			System.out.println("Les jours  fériés de Mai sont: 1 ,3 et 25");
                        break;
		case 6 :
			System.out.println("Pas des jours  fériés");
                        break;
		case 7 :
			System.out.println("Le jour  fériés de Juillet est: 10 ");
                        break;
		case 8 :
			System.out.println("Le jour férié de Aout est: 13");
                        break;
		case 9 :
			System.out.println("Pas des jours  fériés");
                        break;
		case 10 :
			System.out.println("Le jour  férié d'octobre est: 15 ");
                        break;
		case 11 :
			System.out.println("Pas des jours  fériés");
                        break;
		case 12 :
			System.out.println("Pas des jours  fériés");
                        break;
		}
                }
                  //Erreur: si en passe l'intervalle de 12 mois
                else{
                    System.out.println("Faire attention le mois est entre 1 et 12 !!");
                }
        
         
    }
    
	public static void main(String[] args) {
            //Affichage: Appel du la methode getHolidayForMonth de la classe TNHolidayService1
          TNHolidayService1 service = new TNHolidayService1();
          service.getHolidaysForMonth(2);
             
              
              
		
	}
}