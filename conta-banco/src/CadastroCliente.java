class CadastroCliente {
    
    private String nome;
    private String agencia;
    private int numero;
    private double saldo;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void imprimirDadosCliente() {
        System.out.print("Olá " + nome + ", obrigado por criar uma conta em nosso banco. ");
        System.out.print("Agência: " + agencia + " ");
        System.out.print("Conta: " + numero + " ");
        System.out.print("Saldo: " + saldo + " ");
        System.out.println("Seu saldo já está disponível para saque.");    
    }
}