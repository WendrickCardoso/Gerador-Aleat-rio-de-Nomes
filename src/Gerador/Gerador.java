package Gerador;

import java.util.Random;


/**
 *
 * @author Wendrick
 */
public class Gerador {
    
    
    Random rd = new Random();
    int list[] = new int[26];
    String letras[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m"
                      ,"n","o","p","q","r","s","t","u","v","w","x","y","z"};
   
    public int pegarNumeros(int lista[]){
        int aux = 0;
        for (int i = 0; i < 26; i++) {
            if(lista[i] != list[i]){
                aux++;
            }
        }
        return aux;
    }
    
    public String[] pegarLetras(int lista[], String letrasUsar[]){
        int aux = 0;
        for (int i = 0; i < lista.length; i++) {
            if(lista[i] != list[i]){
                letrasUsar[aux] = letras[i];
                aux++;
            }
        }
        return letrasUsar;
    }
    
    public String gerarNome(String letrasUsar[]){
        int lista[] = new int[letrasUsar.length];
        String end = null;
        for (int i = 0; i < letrasUsar.length; i++) {
            lista[i] = rd.nextInt(letrasUsar.length);
        }
        for (int i = 0; i < letrasUsar.length; i++) {
            if(i == 0){end = letrasUsar[lista[i]];
                end = letrasUsar[lista[i]];
            }else if(i == letrasUsar.length - 1){
                end = letrasUsar[lista[i]].toUpperCase()+end;
            }else{
                end = letrasUsar[lista[i]]+end;
            }
        }
        return end;
    }
}
