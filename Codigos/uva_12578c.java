/*
    UVa Online Judge
    12578 - 10:6:2
    Javier Diego-Fernández
*/
import java.util.*; // Necesitamos el Scanner

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        /*
            t: numero de casos de prueba.
            l: longuitud de la bandera.
            w: ancho de la bandera.
            r: radio del circulo.
            a_c: área del círculo.
            a_b: área de la porción verde.
        */ 
        int t,l;
        double w, r, a_c, a_b;
        t = sc.nextInt();
        for(int i = 0; i < t; i++){
            l = sc.nextInt();
            w = (double) 6*l/10;
            r = (double) l/5;
            a_c = (Math.acos(-1) * Math.pow(r,2));
            a_b = l*w - a_c;
            System.out.format("%.2f %.2f\n",a_c, a_b);
        }
    }
}