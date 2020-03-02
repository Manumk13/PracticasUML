package practica5;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutador {

    public static void main(String[] args) {
        //Clase nombreObjeto = new Clase()
        Candidato c1 = new Candidato("Pedro Sanchez", "PSOE");
        Candidato c2 = new Candidato("Pablo Casado", "PP");
        Candidato c3 = new Candidato("Pablo Iglesias", "Unidas Podemos");
        Candidato c4 = new Candidato("Albert Rivera", "Ciudadanos");
        //crear lista
       
        ArrayList<Candidato> listaCandidatos =new ArrayList();
       //metemos los candidatos en la lista
       
       listaCandidatos.add(c1);
       listaCandidatos.add(c2);
       listaCandidatos.add(c3);
       listaCandidatos.add(c4);
       
       
      /* c3.agregarVoto();
       c3.agregarVoto();
       c3.agregarVoto();
       c3.agregarVoto();
       c4.agregarVoto();
       c2.agregarVoto();
       c1.agregarVoto();
       c1.agregarVoto();
     */  
        for (int i = 0; i < 10; i++) {
            
      
        Scanner sc = new Scanner(System.in);
        System.out.println("1.PSOE");
        System.out.println("2.PP");
        System.out.println("3.Unidas Podemos");
        System.out.println("4.Ciudadanos");
        System.out.println("OPCION:");
        int voto = sc.nextInt();
        listaCandidatos.get(voto-1).agregarVoto();
      
        }
      
        for (int i =0 ; i <listaCandidatos.size(); i++) {
            listaCandidatos.get(i).mostrarInfo();
            listaCandidatos.get(i).agregarVoto();
            
        }
    }

}