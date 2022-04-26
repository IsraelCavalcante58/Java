package com.model;

import java.util.Calendar;

public class Conta {
    int numero;
    int agencia;
    double saldo;
    Calendar dataAbertura;
    String tipo;

    Cliente cliente = new Cliente();
}
