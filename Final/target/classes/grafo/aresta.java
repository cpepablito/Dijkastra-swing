/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

/**
 *
 * @author Pablo
 */
public class aresta {
    int peso;
    vertice i,f;
    
    public aresta()
    {   
    } 
    public aresta(vertice _i, vertice _f, int _peso)
    {
        i = _i;
        f = _f;
        peso = _peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public vertice getI() {
        return i;
    }

    public void setI(vertice i) {
        this.i = i;
    }

    public vertice getF() {
        return f;
    }

    public void setF(vertice f) {
        this.f = f;
    }
    
    
}
