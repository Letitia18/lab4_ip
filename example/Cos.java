package org.example;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Cos {
    private Produs[] produseInCos;
    //adauga metode specifice clasei Cos, fara constructori
    public void adaugaProdus(Produs produs) {
        if (produseInCos == null) {
            produseInCos = new Produs[1];
            produseInCos[0] = produs;
        } else {
            Produs[] temp = new Produs[produseInCos.length + 1];
            for (int i = 0; i < produseInCos.length; i++) {
                temp[i] = produseInCos[i];
            }
            temp[produseInCos.length] = produs;
            produseInCos = temp;
        }
    }
    public void afiseazaProduse() {
        for (Produs produs : produseInCos) {
            produs.afiseazaDetalii();
        }
    }

    public float calculeazaTotal() {
        float total = 0;
        for (Produs produs : produseInCos) {
            total += produs.getPret();
        }
        return total;
    }

    public void adaugaProdus(Produs produs, int cantitate) {
        if (cantitate <= 0) {
            System.out.println("Cantitatea trebuie sa fie mai mare decat 0");
            return;
        }
        else if (cantitate > produs.getStoc()){
            System.out.println("Cantitatea depaseste stocul");
            return;
        }
        else for (int i = 0; i < cantitate; i++) {
            adaugaProdus(produs);
        }
    }

}
