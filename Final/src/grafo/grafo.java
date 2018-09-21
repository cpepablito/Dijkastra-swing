/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package grafo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Pablo
 */
public class grafo {
    List<vertice> matrix = new ArrayList<vertice>();
    
    //Variaveis Djkastra
    List<vertice> menorCaminho = new ArrayList<vertice>();
    List<vertice> naoVisitados = new ArrayList<vertice>();
    vertice verticeCaminho = new vertice();
    vertice atual = new vertice();
    vertice vizinho = new vertice();
    int dist;
    //  
    
     public grafo()
    {
        
    }
     
    public int getDist()
    {
        return dist;
    }
    
    public List<vertice> getMatrix() {
        return matrix;
    }

    public void setMatrix(List<vertice> matrix) {
        this.matrix = matrix;
    } 
    
    //Adiciona vertice independente
    public boolean addVertice(String _id)
    {
        if(encontraVertice(_id) == null)
        {
            vertice v = new vertice(_id);
            matrix.add(v);
            return true;
        }
        else 
            showMessageDialog(null, "ID "+ _id + " já existente!");  
        return false;
    }
    
     public boolean addVertice(String _id, String _idf, int _peso)
    {
        if(encontraVertice(_id) == null)
        {
            vertice v = new vertice(_id);
            matrix.add(v);
            addAresta(_id,_idf,_peso); 
            return true;
        }
        else 
            showMessageDialog(null, "ID " +_id+ " já existente!");  
        return false;
    }
    //Adiciona aresta nova
    public boolean addAresta(String _idi, String _idf, int _peso)
    {
        if(encontraVertice(_idi) == null)
            showMessageDialog(null, "ID " + _idi + " inexistente!");   
        else if (encontraVertice(_idf) == null)
            showMessageDialog(null, "ID " + _idi + " inexistente!");   
        else
        {
            encontraVertice(_idi).aponta(encontraVertice(_idf), _peso);
            return true;
        }
        return false;
    }
    
    public void limpargrafo()
    {
        matrix = new ArrayList<vertice>();
        menorCaminho = new ArrayList<vertice>();
        naoVisitados = new ArrayList<vertice>();
        verticeCaminho = new vertice();
        atual = new vertice();
        vizinho = new vertice();
        dist = 0;
    }
    public vertice encontraVertice(String _id)
    {
        for (int i = 0; i < this.getMatrix().size(); i++) 
        {
			if (_id.equals(this.getMatrix().get(i).getId())) {

				return this.getMatrix().get(i);
			}
        }
        return null;
    }
    

    // Algoritmo de Dijkstra
    public List<vertice> Dijkstra(String id1, String id2) 
    {
        resetaMenorCaminho();
        vertice v1 = encontraVertice(id1);
        vertice v2 = encontraVertice(id2);
        if(v1 == null)
            showMessageDialog(null, "ID " + id1 + " inexistente!");   
        else if(v2 == null)
            showMessageDialog(null, "ID " + id2 + " inexistente!");   
        else
        {
            List<vertice> aux = this.getMatrix();
            // Adiciona a origem na lista do menor caminho
            menorCaminho.add(v1);
            v1.setVisitado(true);
            // Colocando a distancias iniciais
            for (int i = 0; i < this.getMatrix().size(); i++) 
            {
                // vertice atual tem distancia zero, e todos os outros,
                // 9999("infinita")
                if (this.getMatrix().get(i).getId().equals(v1.getId())) 
                {
                    this.getMatrix().get(i).setDistancia(0);
                } 
                else 
                {
                    this.getMatrix().get(i).setDistancia(9999);
                }
                // Insere o vertice na lista de vertices nao visitados
                this.naoVisitados.add(this.getMatrix().get(i));
            }
        
            Collections.sort(naoVisitados);
            // O algoritmo continua ate que todos os vertices sejam visitados
            while (!this.naoVisitados.isEmpty()) 
            {
		// Toma-se sempre o vertice com menor distancia, que eh o primeiro da lista
		atual = this.naoVisitados.get(0);
		System.out.println("Pegou esse vertice:  " + atual);
                
		for (int i = 0; i < atual.getList().size(); i++) 
                {
                    vizinho = atual.getList().get(i).getF();
                    System.out.println("Olhando o vizinho de " + atual + ": " + vizinho);
			if (!vizinho.isVisitado()) 
                        {
                            // Comparando a distância do vizinho com a possível distancia
                            if (vizinho.getDistancia() > (atual.getDistancia() + atual.getList().get(i).getPeso())) 
                            {
                                vizinho.setDistancia(atual.getDistancia() + atual.getList().get(i).getPeso());
				vizinho.setAnt(atual);
				/*
                                 * Se o vizinho eh o vertice procurado, e foi feita uma
				 * mudanca na distancia, a lista com o menor caminho
				 * anterior eh apagada, pois existe um caminho menor
				 * vertices pais, ateh o vertice origem.
				 */
                                if (vizinho == v2) 
                                {
				    menorCaminho.clear();
                                    verticeCaminho = vizinho;
                                    menorCaminho.add(vizinho);
                                    while (verticeCaminho.getAnt() != null) 
                                    {
                                        menorCaminho.add(verticeCaminho.getAnt());
					verticeCaminho = verticeCaminho.getAnt();
                                    }
                                    // Ordena a lista do menor caminho, para que ele
                                    // seja exibido da origem ao destino.
                                    Collections.sort(menorCaminho);
                                }
                            }
                        }
                    }
                    // Marca o vertice atual como visitado e o retira da lista de nao
                    // visitados
                    atual.visitar();
                    this.naoVisitados.remove(atual);
                    /*
                     * Ordena a lista, para que o vertice com menor distancia fique na
                     * primeira posicao
                     */
                    Collections.sort(naoVisitados);
                    System.out.println("Nao foram visitados ainda:"+naoVisitados);
        }
        dist = 0;
        this.setMatrix(aux);
        ImprimeCaminho(menorCaminho);
        for (int i = 0; i < menorCaminho.size() - 1; i++) {
                dist += menorCaminho.get(i).calculaDist(menorCaminho.get(i+1));
            }
            System.out.println("Distnância: " + dist);
        System.out.println(dist);
        return menorCaminho;
        }
        return null;
    }
    public void resetaMenorCaminho()
    {
        naoVisitados.clear();
        menorCaminho.clear();
        for(int i = 0; i< matrix.size();i++)
        {
            matrix.get(i).setVisitado(false);
        }        
    }
    public void ImprimeCaminho(List<vertice> lista)
    {
        int peso = 0;
        for (int i = 0; i < lista.size() - 1 ; i++) 
        {
            peso += lista.get(i).calculaDist(lista.get(i + 1));
        }
        
        for (int i = 0; i < lista.size(); i++) 
        {
            if(i==0)
                System.out.print(lista.get(i).getId());
            if(i>0)
                System.out.print(" ---> " + lista.get(i).getId());
        }
        System.out.println("\nDistancia: " + peso + " km");
    }
}