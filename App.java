import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;
 

public class App {
    public static void main(String[] args) throws Exception{
        //vetores (usa int)
        //Arraylist
        // linkedlist (usa Linkedlist)
        //pilhes (usa Stack)
        //conjutos ( Usa HashSet[Estruturas não é ordenado de dados])
        //mapas
        arraylist();
        linkedlist();
        pilhes();
        conjuntos();
        mapas();
    }

    public static void vetores () {
        int tamanho = 5;
        int[] arrayInteiros = new int[tamanho];
        System.out.println(arrayInteiros);

        String[] letras = {"a","e","f","k"};
        System.out.println(letras);
        System.out.println(letras.length);
        

        System.out.println(letras[2]);
        letras[2] = "r";
        System.out.println(letras[2]);

        arrayInteiros[3] = 4;
        System.out.println("-------------");


        //pecorrendo todos os elementos do array 
        for(int i = 0; i < tamanho; i++){
            System.out.println(arrayInteiros[i]);

        }

        // for letra in letra 
        for(String letra : letras){
            System.out.println(letra);
        
        }

        System.out.println("----------------");
        letras = aumentarVetor(letras);
        System.out.println(letras.length);

    }

    public static String [] aumentarVetor(String[] vetor){
        String[] novoVetor = new String[vetor.length + 1];

        for (int i  = 0; i < vetor.length; i++) {
            novoVetor[i] = vetor[i];
        }

        return novoVetor;
    }

    public static void arraylist(){
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println(numeros);

        numeros.add(8); // adiciona elemento ao final da lista
        numeros.add(3);
        System.out.println(numeros);
        System.out.println(numeros.size());
        System.out.println(numeros.get(1));

        numeros.remove(0);
        System.out.println(numeros);

        for(Integer numero : numeros){
            System.out.println(numero);

        }
        // verifica se o elemento está contido no ArrayList
        System.out.println(numeros.contains(8));

        // remove o elemnto está contido no ArrayList
       System.out.println(numeros.remove(0));
       numeros.add(1);
       numeros.add(2);
       numeros.add(3);
       System.out.println(numeros);

        // adicina um elemento novo no índice 0 (usar o add)
        numeros.add(0,16);
        System.out.println(numeros);

        // modifica o elemento no índice 0 (usar o set)
        numeros.set(0, 999);
        System.out.println(numeros);

        //limpou o ArrayList (usar o clear)
        numeros.clear();
        System.out.println(numeros.size());

    }

    public static void linkedlist(){
        LinkedList<String> carros = new LinkedList<>();
        System.out.println(carros);

        carros.add("gol");
        carros.add(0, "corsa");

        System.out.println(carros);

        System.out.println(carros.indexOf("gol"));

        //remove o primeiro elemento da lista (usar o pop)
        carros.pop();
        System.out.println(carros);

        //adicionar um elemento no início[primeiro] da lista (usar push)
        carros.push("palio");
        System.out.println(carros);
      
        // remove o elemento que for indicado no index ou seja o que for colocado entre ()
        carros.remove(1);
        System.out.println(carros);

    }

    public static void pilhes(){
        Stack<Double> notas = new Stack<>();

        notas.push(4.5);
        notas.push(8.8);
        System.out.println(notas.peek());  

        notas.push(8.7);
        System.out.println(notas.peek());

        notas.pop();
        System.out.println(notas.peek());
        System.out.println(notas);

        for (Double nota : notas){
            System.out.println(nota);

        }

    }

    public static void conjuntos(){
        HashSet<String> frutas = new HashSet<>();

        frutas.add("maçã");
        frutas.add("laranja");
        frutas.add("melancia");
        System.out.println(frutas);

        for(String fruta : frutas){
            System.out.println(fruta);
        }

        frutas.remove("laranja");
        System.out.println(frutas);

    }

    public static void mapas(){
        HashMap<String, String > alunos = new HashMap<>();

        alunos.put("1234", "João");
        alunos.put("5678", "Arthur");

        System.out.println(alunos);
        System.out.println(alunos.get("1234"));
        System.out.println(alunos.get("5678"));

        alunos.remove("1234");
        alunos.remove("1235"); // não fará nada
        System.out.println(alunos);

        System.out.println(alunos.containsKey("1111"));
        System.out.println(alunos.containsKey("Maria"));
        System.out.println(alunos.containsKey("Joana"));

        System.out.println(alunos.size());

        for( String matricula : alunos.keySet()){
            System.out.println(matricula);
            System.out.println(alunos.get(matricula));

        }

        for (String nome : alunos.values()){
            System.out.println(nome);

        }


    }
}
