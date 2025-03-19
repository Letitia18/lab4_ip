package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Client u1 = new Client(123,"Matei", "manmat2004@gmail.com", "asd123", "Str. Copou, nr14", "0724569595");
            Produs produs = new Produs(452);
            Comanda comanda = new Comanda(1);
            u1.CreeazaCont();
            u1.Autentificare("manmat2004@gmail.com", "asd123");
            u1.cautaProduse("MacBook Pro");
            u1.adaugaInCos(produs);
            u1.stergeDinCos(produs);
            u1.finalizeazaComanda(comanda);
            u1.adaugaRecenzie(produs, "Foarte bun, s-a stricat in prima zi", 2);
            u1.stergeRecenzie(produs);
            u1.platesteInRate();
            u1.plateste();




        }



}
