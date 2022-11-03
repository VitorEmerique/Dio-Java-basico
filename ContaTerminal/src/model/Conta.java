package model;

public class Conta {
    private int numero;
    private String agencia;
    private String nome;
    private Double saldo;

    public Conta(int numero, String agencia, String nome, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Conta numero(int numero) {
        setNumero(numero);
        return this;
    }

    public Conta agencia(String agencia) {
        setAgencia(agencia);
        return this;
    }

    public Conta nome(String nome) {
        setNome(nome);
        return this;
    }

    public Conta saldo(Double saldo) {
        setSaldo(saldo);
        return this;
    }

    public String toString() {
        return "Ola " + nome + ", obrigado por criar uma conta em nossa banco, sua agencia é" + agencia + ", conta "
                + numero + " e saldo " + saldo;

    }
}
