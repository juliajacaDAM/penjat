package com.jaume.penjat;

public class Tauler {
      private char[] paraulaSecreta;
      private String[] palabraEndevinada;
      private int intentos;
      private int totalIntentos;

      public char[] getParaulaSecreta() {
          return paraulaSecreta;
      }

      public void setParaulaSecreta(char[] paraulaSecreta) {
          this.paraulaSecreta = paraulaSecreta;
      }

      public String[] getPalabraEndevinada() {
          return palabraEndevinada;
      }

      public void setPalabraEndevinada(String[] palabraEndevinada) {
          this.palabraEndevinada = palabraEndevinada;
      }

      public int getIntentos() {
          return intentos;
      }

      public void setIntentos(int intentos) {
          this.intentos = intentos;
      }

      public int getTotalIntentos() {
          return totalIntentos;
      }

      public void setTotalIntentos(int totalIntentos) {
          this.totalIntentos = totalIntentos;
      }
      public Tauler(){
          paraulaSecreta = new char[0];
          palabraEndevinada = new String[0];
          intents = 0;
          totalIntents = 0;
      }
}
