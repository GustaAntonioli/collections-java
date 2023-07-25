import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo:
(nome - idade - cor);
Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo
*/

class exemploGato {
    public static void main(String [] args) {
        List<gato> meusGatos = new ArrayList<>(){{
            add(new gato( "Jon", 18 , "preto"));
            add(new gato( "Simba", 6 , "tigrado"));
            add(new gato( "Jon", 12 , "amarelo"));
        }}; 

        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);

        System.out.println("--\tOrdem aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Natural (Nome)\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Idade\t---");
//        Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem cor\t---");
//        Collections.sort(meusGatos, new ComparatorCor());
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
//        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }   
}

class gato implements Comparable<gato>{
    
    private String nome;
    private Integer idade;
    private String cor;
    
    
    public gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
        
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }
        
    @Override
        public String toString() {
            return "{" +
                    "nome='" + nome + '\'' +
                    ",idade=" + idade +
                    ",cor='" + cor + '\'' + 
                    '}';   
        }

    @Override
    public int compareTo(gato Gato) {
        return this.getNome().compareToIgnoreCase(Gato.getNome());
    }
}

class ComparatorIdade implements Comparator<gato> {
    @Override
    public int compare(gato g1, gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<gato> {

    @Override
    public int compare(gato g1, gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<gato> {

    @Override
    public int compare(gato g1, gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor !=0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());

    }
}