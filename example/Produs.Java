package org.example;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Produs {
    private int id;
    private String nume;
    private float pret;
    private String descriere;
    private int stoc;

    public void afiseazaDetalii() {
        System.out.println(this);
    }

    public void actualizeazaStoc(int cantitate) {
        if (cantitate < 0 && Math.abs(cantitate) > stoc) {
            System.out.println("Stoc insuficient!");
        } else {
            stoc += cantitate;
            System.out.println("Stoc actualizat: " + stoc);
        }
    }

    public void aplicaReducere(float procent) {
        if (procent > 0 && procent <= 100) {
            pret -= pret * (procent / 100);
            System.out.println("Preț redus la: " + pret + " RON");
        } else {
            System.out.println("Reducere invalidă!");
        }
    }
}
