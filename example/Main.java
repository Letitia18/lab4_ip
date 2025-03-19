package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produs ciocolata = new Produs(1, "Ciocolată Milka", 7.5f,
                "Ciocolată gustoasă cu lapte cremos si alune de pădure", 50);
        Produs liptonPiersici = new Produs(2, "Lipton Piersici", 5.0f,
                "Ceai răcoritor cu aromă de piersici", 100);

        ciocolata.actualizeazaStoc(-20);
        liptonPiersici.aplicaReducere(50);

        ciocolata.afiseazaDetalii();
        liptonPiersici.afiseazaDetalii();

        Cos cos = new Cos();
        cos.adaugaProdus(ciocolata, 10);
        cos.adaugaProdus(liptonPiersici);

        cos.afiseazaProduse();
        float total = cos.calculeazaTotal();
        System.out.println("Total: " + total + " RON");
    }
}