
import utfpr.ct.dainf.if62c.avaliacao.Poligonal;
import utfpr.ct.dainf.if62c.avaliacao.Ponto;
import utfpr.ct.dainf.if62c.avaliacao.PontoXZ;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Segunda avaliação parcial 2014/2.
 * @author 
 */
public class Avaliacao2 {

    public static void main(String[] args) {
        // (x, z), (-3,2), (-3,6) e (0,2)
        PontoXZ a = new PontoXZ(-3, 2);
        PontoXZ b = new PontoXZ(-3, 6);
        PontoXZ c = new PontoXZ(0, 2);
        
        Poligonal pol = new Poligonal(3);
        pol.set(0, a);
        pol.set(1, b);
        pol.set(2, c);
        // "Comprimento da poligonal = 123,456". 
        System.out.println("Comprimento da poligonal = " + pol.getComprimento());
        System.out.println("a= " + a);
        System.out.println("a = b ?:" + a.equals(c));
    }
    
}
