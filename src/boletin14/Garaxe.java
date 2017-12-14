/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

/**
 *
 * @author pnocedalopez
 */
public class Garaxe {

    int numeroCoches = 0;
    String matricula1, matricula2, matricula3, matricula4, matricula5;

    public Garaxe() {
    }

    public Garaxe(String matricula1, String matricula2, String matricula3, String matricula4, String matricula5) {
        this.matricula1 = matricula1;
        this.matricula2 = matricula2;
        this.matricula3 = matricula3;
        this.matricula4 = matricula4;
        this.matricula5 = matricula5;
    }

    public int getNumeroCoches() {
        return numeroCoches;
    }

    public void setNumeroCoches(int numeroCoches) {
        this.numeroCoches = numeroCoches;
    }

    public String getMatricula1() {
        return matricula1;
    }

    public void setMatricula1(String matricula1) {
        this.matricula1 = matricula1;
    }

    public String getMatricula2() {
        return matricula2;
    }

    public void setMatricula2(String matricula2) {
        this.matricula2 = matricula2;
    }

    public String getMatricula3() {
        return matricula3;
    }

    public void setMatricula3(String matricula3) {
        this.matricula3 = matricula3;
    }

    public String getMatricula4() {
        return matricula4;
    }

    public void setMatricula4(String matricula4) {
        this.matricula4 = matricula4;
    }

    public String getMatricula5() {
        return matricula5;
    }

    public void setMatricula5(String matricula5) {
        this.matricula5 = matricula5;
    }
    
}
