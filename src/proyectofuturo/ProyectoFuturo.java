/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofuturo;

/**
 *
 * @author SERGIO VAQUERO GARCIA
 */
public class ProyectoFuturo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String vere;
        
        vere=veredicto(args[1], args[2]);
        System.out.println("Estudiante " + args[0] + " : " + vere);
    }
    
    private static String veredicto(String valor1, String valor2) {
        String vere;
        
        if (valor1.equals(valor2)) {
            vere = valor1 +" horas creo que no es suficiente para " + valor1 + " Modulos";
        }
        else if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
            vere= "PERFECTO. Dedicas " + valor2 + " horas para " + valor1 + " Modulos. Sigue así APROBARAS";
        }
        else {
            vere= "MUY MAL. Así no vas a aprobar estudiando " + valor2 + " horas para " + valor1 + " Modulos";
        }
        return (vere);
    }
}
