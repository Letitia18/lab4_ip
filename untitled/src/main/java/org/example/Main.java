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

            Client u1 = new Client(123,"Matei", "manmat2004@gmail.com", "asd123", "Str. Copou, nr14", "0724569595");

            Comanda comanda = new Comanda(1);
            u1.CreeazaCont();
            u1.Autentificare("manmat2004@gmail.com", "asd123");
            u1.cautaProduse("MacBook Pro");
            u1.adaugaInCos(ciocolata);
            u1.stergeDinCos(ciocolata);
            u1.finalizeazaComanda(comanda);
            u1.adaugaRecenzie(ciocolata, "Foarte bun, s-a stricat in prima zi", 2);
            u1.stergeRecenzie(ciocolata);
            u1.platesteInRate();
            u1.plateste();




        }



}
