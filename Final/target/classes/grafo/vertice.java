/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pablo
 */
public class vertice implements Comparable<vertice>{
    List<aresta> list;
    List<vertice> vizinhos;
    vertice ant;
    String id;
    boolean visitado;
    int distancia;

    
    //Getters
    public List<aresta> getList() 
    {
        return list;
    }
    
    public boolean isVisitado()
    {
        return visitado;
    }
    
    public vertice getAnt()
    {
        return ant;
    }
    
    public int getDistancia() 
    {
        return distancia;
    }
    
    public List<aresta> getA() 
    {
        return list;
    }

    public String getId() 
    {
        return id;
    }
    
    public List<vertice> getVizinhos() 
    {
        return vizinhos;
    }
    
    //Setters
    public void setList(List<aresta> _list) 
    {
        list.addAll(_list);
    }

    public void setVisitado(boolean _visitado) 
    {
        visitado = _visitado;
    }

    public void setAnt(vertice _ant) 
    {
        ant = _ant;
    }

    public void setDistancia(int _distancia) 
    {
        distancia = _distancia;
    }

    public void setVizinhos(List<vertice> _vizinhos) 
    {
        vizinhos.addAll(_vizinhos);
    }
    
    public void setId(String _id) 
    {
        id = _id;
    }
      
    //Métodos
    public vertice()
    {
        
    } 
    public vertice(String _id)
    {
        id = _id;
        list = new ArrayList<aresta>();
        vizinhos = new ArrayList<vertice>();
        visitado = false;
    }
 
    public void aponta(vertice f, int _peso)
    {
        aresta a = new aresta(this,f,_peso);
        aresta b = new aresta(f,this,_peso);
        vizinhos.add(f);
        f.getVizinhos().add(this);
        list.add(a);
        f.getList().add(b);
    }
    
    public int comparaDist(vertice vertice)
    {
        if(this.getDistancia() < vertice.getDistancia()) return -1;
        else if(this.getDistancia() == vertice.getDistancia()) return 0;         
        return 1;            
    } 
    
    public int calculaDist(vertice v)
    {
        return achaAresta(this,v).getPeso();
    }
    
    public aresta achaAresta(vertice v1, vertice v2)
    {
        String id1 = v1.getId();
        String id2 = v2.getId();
         for (int i = 0; i < list.size(); i++) 
        {
                if (list.get(i).getI().getId().equals(id1) && list.get(i).getF().getId().equals(id2))
                {
				return list.get(i);
                }
        }
        System.out.println("Não Encontrado Aresta" + id1 + "--> " + id2);
        return null;
    }
    public void visitar()
    {
        visitado = true;
    }
    
    @Override
        public boolean equals(Object obj) {
                if(obj instanceof vertice){
                        vertice vRef = (vertice) obj;
                        if(this.getId().equals(vRef.getId())) return true;
                }
                return false;
        }
        
        @Override
        public String toString() {
                String s = " ";
                s+= this.getId();
                return s;
        }

    @Override
     public int compareTo(vertice vertice) {
                  if(this.getDistancia() < vertice.getDistancia()) return -1;
          else if(this.getDistancia() == vertice.getDistancia()) return 0;
          
          return 1;
    }
}
