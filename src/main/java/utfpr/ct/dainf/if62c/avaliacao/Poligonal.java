/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.avaliacao;

/**
 *
 * @author allan
 */
public class Poligonal {
    public int n_vertices;

    public Poligonal(int n_vertices) {
        if(n_vertices < 2){
            throw new RuntimeException("Poligonal deve ter ao menos 2 vértices");
        }
        this.n_vertices = n_vertices;
    }

    public int getN() {
        return n_vertices;
    }

    public void setVertices(int n_vertices) {
        this.n_vertices = n_vertices;
    }
    
    Ponto2D [] vertices = new Ponto2D[n_vertices];
    
    public Ponto2D get(int i){
        if(i < 0 || i > n_vertices){
            return null;
        }
        return vertices[i];
    }
    
    public void set(int i, Ponto2D p){
        if( ! (i < 0 || i > vertices.length)){
            int j = 0;
            for (Ponto2D vertice : vertices) {
                if( (vertices[j].getX() == 0 && p.getX() != 0) || (vertices[j].getY() == 0 && p.getY() != 0) || (vertices[j].getZ() == 0 && p.getZ() != 0))
                    throw new RuntimeException("Vértices devem estar no mesmo plano");
                j++;
            }
        }
    }
    
    public double getComprimento(){
        double soma = 0;
        int j;
        Ponto p;
        for(j = 0; j < vertices.length - 1; j++){
            p = vertices[j];
            soma += p.dist(vertices[j+1]);                    
        }
        //System.out.println("soma =" + soma);
        return soma;
    }
    
    
    
}
