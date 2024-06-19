package operacoes_matematicas_math;

public class Min {

    public static void main(String[] args) {
        int x = 300;
        int y = 200;

//        int z = Math.min(x, y); /* o metodo vai retornar qual é o menor valor */
        int z = Integer.min(x, y);

        System.out.println(z);
    }

}