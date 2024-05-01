package pratica.alccolOugasolina;

public class AlcoolOuGasolina {
    private final float PRECO_GASOLINA;
    private final float PRECO_ALCOOL;

    public AlcoolOuGasolina (float precoGasolina, float precoAlcool) {
        this.PRECO_ALCOOL = precoAlcool;
        this.PRECO_GASOLINA = precoGasolina;
    }

    private float calculaDiferenca() {
         return this.PRECO_ALCOOL / this.PRECO_GASOLINA;
    }

    public void gasolinaOuAlcool() {
        float diferenca = calculaDiferenca();

        if( diferenca > 0.7) {
            System.out.println("Gasolina vale mais a pena");
        } else {
            System.out.println("Melhor abastecer com alcool");
        }
    }

}


