package org.example;

import lombok.AllArgsConstructor;


public abstract class Utilizator {
        protected int id;
        protected String nume;
        protected String email;
        protected String parola;
        protected String adresa;
        protected String NrTelefon;

        public Utilizator( int id, String nume, String email, String parola, String adresa, String NrTelefon) {
                this.id = id;
                this.nume = nume;
                this.email = email;
                this.parola = parola;
                this.adresa = adresa;
                this.NrTelefon = NrTelefon;
        }

        public void CreeazaCont(){
            System.out.println("Utilizatorul " + this.nume + " a creeat un cont cu parola " + this.parola + " si emailul " + this.email);
        }

        public void Autentificare(String emailIncercat,String parolaIncercata){
            if(parolaIncercata.equals(this.parola) && emailIncercat.equals(this.email)){
                    System.out.println("Utilizatorul " + this.nume + " s-a autentificatat cu mailul: " + this.email +  ", parola: " + this.parola);
            }
            else{
                    System.out.println("Parola sau email incorect!");
            }


        }


}
