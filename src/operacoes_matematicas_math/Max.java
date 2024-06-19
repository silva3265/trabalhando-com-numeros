package operacoes_matematicas_math;

public class Max {

    public static void main(String[] args) {
        int x = 100;
        int y = 200;

//        int z = Math.max(x, y); /* o metodo vai retornar qual é o maior valor */
        int z = Integer.max(x, y);

        System.out.println(z);
    }

}