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
public class PoligonalFechada extends Poligonal {

    public PoligonalFechada(int n_vertices) {
        super(n_vertices);
    }
    
    @Override
    public double getComprimento(){
        double soma = 0;
        int j;
        Ponto p;
        for(j = 0; j < vertices.length - 1; j++){
            p = vertices[j];
            soma += p.dist(vertices[j+1]);                    
        }
        soma += vertices[0].dist(vertices[vertices.length-1]);
        return soma;
    }
}
