package Exerc_03;




public class Funcionario {
    private String nome;
    private String email;
    private double salarioBase;
    private Cargo cargo;

    public Funcionario(String nome, String email, double salarioBase, Cargo cargo) {
        this.nome = nome;
        this.email = email;
        this.salarioBase = salarioBase;
        this.cargo = cargo;
    }

    public double calcularSalarioLiquido() {
        switch (cargo) {
            case DESENVOLVEDOR:
                return salarioBase >= 3000.00 ? salarioBase * 0.8 : salarioBase * 0.9;
            case DBA:
            case TESTADOR:
                return salarioBase >= 2000.00 ? salarioBase * 0.75 : salarioBase * 0.85;
            case GERENTE:
                return salarioBase >= 5000.00 ? salarioBase * 0.7 : salarioBase * 0.8;
            default:
                throw new IllegalArgumentException("Cargo inválido");
        }
    }
}
