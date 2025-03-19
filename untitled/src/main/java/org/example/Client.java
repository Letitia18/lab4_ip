package org.example;

import jdk.jshell.execution.Util;
import lombok.AllArgsConstructor;

import java.util.List;

public class Client extends Utilizator{
    private List<Comanda> istoricComenzi;
    private List<Produs> favorite;
    private Cos cosCumparaturi;

    public Client(int id, String nume, String email, String parola, String adresa, String NrTelefon) {
        super(id, nume, email, parola, adresa, NrTelefon);
    }

    public void cautaProduse(String cautare){
        System.out.println("Clientul " + this.nume + " a cautat: " + cautare);
    }

    public void adaugaInCos(Produs produs){
        System.out.println("Clientul " + this.nume + " a adaugat produsul cu id: " + produs);
    }
    public void stergeDinCos(Produs produs){
        System.out.println("Clientul" + this.nume + " a sterge din produsul cu id: " + produs);
    }
    public void finalizeazaComanda(Comanda comanda){
        System.out.println("Clientul" + this.nume + " a finalizaza comanda cu id: " + comanda);
    }

    public void adaugaRecenzie(Produs produs, String text, int rating){
        System.out.println("Clientul" + this.nume + " a adaugat o recenzie la produsul cu id: " + produs + ", text: " + text + ", rating: " + rating);
    }

    public void stergeRecenzie(Produs produs){
        System.out.println("Clientul" + this.nume + " a sters o recenzie la produsul cu id: " + produs);
    }

    public void platesteInRate(){
        System.out.println("Clientul" + this.nume + " a platit in rate");
    }

    public void plateste(String card) {
        System.out.println("Clientul " + this.nume + " a platit cu cardul: " + card);
    }
    public void plateste(){
        System.out.println("Clientul " + this.nume + " plateste cash");
    }



}
