package numeros;

public class Principal {

    public static void main(String[] args) {
        int x = 128;
        int y = 128;

        Integer a = 128; /* Integer - variaveis de tipo de classe (Wrappers )*/
        Integer b = 128;

        System.out.println(x == y); /* comparando a referencia */
//        System.out.println(a == b);
        System.out.println(a.equals(b)); /* comparando o conteudo */
    }

}
