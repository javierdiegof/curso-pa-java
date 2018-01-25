import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        /*
            m: número de casos de prueba.
            n: numero de monedas.
            k: numero de pesajes.
            p: numero de monedas en un pesaje particular.
            coin: set de posibles candidatos.
            w: set de monedas en el pesaje actual.
            sig: caracter que leemos de la balanza.
        */
        int m,n,k,p;
        Set<Integer> coin, w;
        char sig;
        m = sc.nextInt();
        for(int i = 0; i < m; i++){
            n = sc.nextInt();
            k = sc.nextInt();
            coin = new HashSet<>(n); // HashSet es más rapido que TreeSet para la busqueda e inserción

            // En un inicio, todas las monedas son candidatas.
            for(int j = 0; j < n; j++){
                coin.add(j+1);
            }

            // Procesamos los pesajes
            for(int j = 0; j < k; j++){
                p = sc.nextInt();
                w = new HashSet<>(2*p);
                
                for(int l = 0; l < 2*p; l++){
                    w.add(sc.nextInt());
                }
                sig = sc.next().charAt(0);

                if(sig == '='){
                    coin.removeAll(w);
                }
                else if(sig == '<' || sig == '>'){
                    coin.retainAll(w);
                }
            }

            if(i > 0) System.out.println();
            if(coin.size() == 1){
                System.out.print(coin.toArray()[0]);
            }
            else{
                System.out.print(0);
            }
            System.out.print("\n");
        }
    }
}