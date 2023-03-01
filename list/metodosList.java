import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class metodosList {
     public static void main(String[] args){

// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

/*
[] Crie uma lista e adicione as sete notas.                --> Use LIST para criar novo array.   
[] Exiba a lista.                                          --> Use toString().
[] Exiba a posição da nota 5.0.                            --> Use indexOf().
[] Adicione na lista a nota 8.0 na posição 4.              --> Use add().
[] Substitua a nota 5.0 pela nota 6.0.                     --> Use set() e indexOf().
[] Confira se a nota 5.0 está na lista.                    --> Use contains().
[] Exiba todas as notas na ordem em que foram informados.  --> Use o método for.
[] Exiba a terceira nota adicionada.                       --> Use get() e toString.
[] Exiba a menor nota.                                     --> Use Collections.min()
[] Exiba a maior nota.                                     --> Use Collections.max()
[] Exiba a soma dos valores.                               --> Use iterator(), iterator.hasNext(), iterator.next()
[] Exiba a média das notas.                                --> Use size().
[] Remova a nota 0.                                        --> Use remove().
[] Remova a nota da posição 0.                             --> Use remove().
[] Remova as notas menores que 7 e exiba a lista.          --> Use iterator(), hasNext(), next() e remove().
[] Apague toda a lista.                                    --> Use clear().
[] Confira se a lista está vazia.                          --> Use isEmpty().
 */


//      Para criar uma lista um array dinâmico numérico tipo duble.
//      ArrayList<Double> notas = new ArrayList<>(); 

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<>(); // Diamond Operator
        notas.add(7.0); //Posição [0]
        notas.add(8.5); //Posição [1]
        notas.add(9.3); //Posição [2]
        notas.add(5.0); //Posição [3]
        notas.add(7.0); //Posição [4]
        notas.add(0.0); //Posição [5]
        notas.add(3.6); //Posição [6]
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        
        /* 
        Neste trecho do cód.  o loop continuará a executar enquanto houver mais elementos 
        na sequência a serem percorridos.
        A cada iteração do loop, o código chama o método iterator.next() para obter o próximo 
        valor da sequência e armazená-lo na variável next do tipo Double.
        Em seguida, o valor de next é adicionado à variável soma usando o operador +=. Isso significa 
        que o valor atual de soma é somado ao valor de next, e o resultado é armazenado de volta em soma.
        */
                
        Double soma = 0d;                 
        while(iterator.hasNext()){        
            Double next = iterator.next();
            soma += next;                               
        }
            System.out.println("Exiba a soma dos valores: " + soma);

            System.out.println("Exiba a média das notas: " + (soma/notas.size()));

            System.out.println("Remova a nota 0: ");
            notas.remove(0d);
            System.out.println(notas);

            System.out.println("Remova a nota da posição 0");
            notas.remove(0);
            System.out.println(notas);
    
            System.out.println("Remova as notas menores que 7 e exiba a lista: ");
            Iterator<Double> iterator1 = notas.iterator();
            while(iterator1.hasNext()) {
                Double next = iterator1.next();
                if(next < 7) iterator1.remove();
            }
            System.out.println(notas);

            System.out.println("Apague toda a lista");
            notas.clear();
            System.out.println(notas);

            System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
               
            /*
            Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:
            System.out.println("Crie uma lista chamada notas2 " +
            "e coloque todos os elementos da list Arraylist nessa nova lista: ");
            System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
            System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
            */

            System.out.println("Crie uma lista chamada notas2 e coloque todos os elementos da list Arraylist nessa nova lista: ");    
            List<Double> notas2 = new LinkedList<>();
            notas2.add(6.0); //Posição [0]
            notas2.add(7.5); //Posição [1]
            notas2.add(8.3); //Posição [2]
            notas2.add(4.0); //Posição [3]
            notas2.add(6.0); //Posição [4]
            notas2.add(0.0); //Posição [5]
            notas2.add(2.6); //Posição [6]
            System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
            System.out.println(notas2.toString());
            notas2.indexOf(0d);

            System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
            notas2.remove(0);
            System.out.println(notas2);
     }
}