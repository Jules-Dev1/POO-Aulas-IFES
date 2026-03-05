public class Banco {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Jules";
        p1.idade = 20;
        p1.sexo = 'F';
        p1.CPF = "123.456.789-00";

        Pessoa p2 = new Pessoa();
        p2.nome = "Pedro";
        p2.idade = 18;
        p2.sexo = 'M';
        p2.CPF = "987.654.321-00";

        Conta c1 = new Conta();
        c1.numero = "1234-5";
        c1.titular = p1;
        c1.limite = 200;
        c1.saldo = 100;

        Conta c2 = new Conta();
        c2.numero = "5432-1";
        c2.titular = p2;
        c2.limite = 200;
        c2.saldo = 150;

        System.out.println(c1.saldo);
        System.out.println(c1.titular.nome);
        System.out.println("Saldo da conta " + c2.numero + ": " + c2.saldo);
    }
}
