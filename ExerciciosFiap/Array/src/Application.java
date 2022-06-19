import model.Produto;

public class Application {
    public static void main(String[] args) {

        // UNIDIMENSIONAL

//        float[] valores = new float[5];
//        valores[0] = 10;
//        valores[1] = 20;
//        valores[2] = 30;
//        valores[3] = 40;
//        valores[4] = 50;
//        System.out.println(valores[1]);

        byte bytes[] = new byte[4];
        short shorts[] = new short[8];
        double doubles[] = new double[7];
        float floats[] = new float[3];
        String strings[] = new String[10];


        Produto[] produtos = new Produto[2];
        Produto prod1 = new Produto();
        prod1.setNome("Limão");
        prod1.setDescricao("Galego");
        prod1.setValor(3.30f);

        Produto prod2 = new Produto();
        prod2.setNome("Maça");
        prod2.setDescricao("Gala");
        prod2.setValor(5f);

        produtos[0] = prod1;
        produtos[1] = prod2;

        for (int i=0; i< produtos.length; i++){
            System.out.println(produtos[i].toString());
        }

        for(Produto j: produtos){
            System.out.println(j.toString());
        }

        // FOR EACH EXAMPLE

        // for (<tipo> <variavelqualquer> : <array>){Instruções}

        // MULTIDIMENSIONAL

        Produto[][] localizacaoProduto = new Produto[10][3];

        localizacaoProduto[0][1] = prod1;
        localizacaoProduto[1][1] = prod2;

        System.out.println(localizacaoProduto[0][1].getNome());
    }
}
