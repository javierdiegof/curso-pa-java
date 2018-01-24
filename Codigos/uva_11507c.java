/*
    UVa Online Judge
    11507 - Bender B. Rodríguez
    Javier Diego-Fernández
*/
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        /*
            dir: dirección a la que apunta el tubo.
            len : longuitud del tubo.
            mov: movimiento en la lectura actual.
        */
        StringBuilder dir; // Dirección inicial
        int len;
        String mov;
        while(true){
            dir = new StringBuilder("+x");
            len = sc.nextInt();
            if(len == 0) break;
            for(int i = 0; i < len-1; i++){
                mov = sc.next();
                switch(mov.charAt(1)){
                    case 'y':
                        if(dir.charAt(1) == 'x'){
                            if(mov.charAt(0) == '+'){
                                swap(dir, 'y', false);
                            }
                            else{
                                swap(dir, 'y', true);
                            }
                        }
                        else if(dir.charAt(1) == 'y'){
                            if(mov.charAt(0) == '+'){
                                swap(dir, 'x', true);
                            }
                            else{
                                swap(dir, 'x', false);
                            }
                        }
                        break;
                    
                    case 'z':
                        if(dir.charAt(1) == 'x'){
                            if(mov.charAt(0) == '+'){
                                swap(dir, 'z', false);
                            }
                            else{
                                swap(dir, 'z', true);
                            }
                        }
                        else if(dir.charAt(1) == 'z'){
                            if(mov.charAt(0) == '+'){
                                swap(dir, 'x', true);
                               }
                            else{
                                swap(dir, 'x', false);
                            }
                        } 
                }
            }
            System.out.println(dir);
        }
    }


    static void swap(StringBuilder act, char nueva, boolean signo){
        act.setCharAt(1, nueva);
        if(signo == true){
            if(act.charAt(0) == '+'){
                act.setCharAt(0, '-');
            }
            else{
                act.setCharAt(0, '+');
            }
        }
    }
    /*
        La posición después de un momento depende de la posición actual y el movimiento:
        Dependiendo del movimiento
            +y{
                +-x => +-y
                +-y => -+x
                z no cambia
            }

            -y{
                +-x => -+y
                +-y => +-x
                z no cambia
            }
    
            +z{
                +-x => +-z
                y no cambia
                +-z => -+x
            }
    

            -z{
                +-x => -+z
                y no cambia
                +-z => +-x
            }
    */
}