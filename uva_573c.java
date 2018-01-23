import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        /*
            h: altura del pozo.
            u: distancia  que el caracol avanza por día.
            d; distancia que el caracol baja durante la noche.
            f: fatiga, expresada como porcentaje.
            pos: posición actual del caracol.
            av: avance del día.
        */ 
        int h,u,d,f;
        float pos, av;
        while(true){
            h = sc.nextInt();
            if(h == 0) break;
            u = sc.nextInt();
            d = sc.nextInt();
            f = sc.nextInt();
            pos = 0;
            for(int i = 0; i < Integer.MAX_VALUE; i++){
                av = u*(1-((float)i)*f/100); // Avance del dia
                if(av > 0){
                    pos += av;
                }
                if(pos > h){
                    System.out.format("success on day %d\n", i+1);
                    break;
                }
                pos -= d;
                if(pos < 0){
                    System.out.format("failure on day %d\n", i+1);
                    break;
                }
            }
        }
    }
}