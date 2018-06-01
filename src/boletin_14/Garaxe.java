/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_14;

/**
 *
 * @author Marcos
 */
public class Garaxe {
    int numeroCoches;
    String matricula;    
    double tiempo;
    double prezo;    

    public void setNumeroCoches(int numeroCoches) {
        this.numeroCoches = numeroCoches;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public void setPrezo(double prezo) {
        this.prezo = prezo;
    }

    public int getNumeroCoches() {
        return numeroCoches;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getTiempo() {
        return tiempo;
    }

    public double getPrezo() {
        return prezo;
    }
    
    
    
    
    public void ocupado(int numeroCoches){
        if (numeroCoches==5){
            System.out.println("OCUPADO");
    }else if(numeroCoches<5){
        System.out.println("PLAZAS DISPOÑIBLES");
    }
    }
    public void factura(double cartos){
        if (tiempo<=3){
            prezo = 1.5*tiempo;       
            
        }else if(tiempo>3){
            prezo = 1.5*3 + 0.20*(tiempo-3);
        }
         System.out.println("FACTURA");
            System.out.println("MATRICULA COCHE: "+matricula);
            System.out.println("TIEMPO: "+tiempo);
            System.out.println("PRECIO: "+prezo);
            System.out.println("CARTOS RECIVIDOS: "+cartos);
            System.out.println("CARTOS DEVOLTOS: "+(cartos-prezo));
            System.out.println("GRAZAS POR USAR O NOSO APARCADOIRO");
            
    }

}
