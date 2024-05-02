import java.util.Scanner;

class Sanduiche {
    private String nome;

    public Sanduiche(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Sobremesa {
    private String nome;

    public Sobremesa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Bebida {
    private String nome;

    public Bebida(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Combo {
    private Sanduiche sanduiche;
    private Sobremesa sobremesa;
    private Bebida bebida;

    public void criarCombo(int tipo) {
        switch (tipo) {
            case 1:
                sanduiche = new Sanduiche("Hamburguer Master");
                sobremesa = new Sobremesa("Sundae");
                bebida = new Bebida("Coca-Cola");
                break;
            case 2:
                sanduiche = new Sanduiche("Super Burguer");
                sobremesa = new Sobremesa("Torta de Maçã");
                bebida = new Bebida("Suco de Laranja");
                break;
            default:
                System.out.println("Tipo de combo inválido");
        }
    }

    public void mostrarItensDoCombo() {
        if (sanduiche != null && sobremesa != null && bebida != null) {
            System.out.println("Sanduíche: " + sanduiche.getNome());
            System.out.println("Sobremesa: " + sobremesa.getNome());
            System.out.println("Bebida: " + bebida.getNome());
        } else {
            System.out.println("Combo não criado ainda.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Selecione seu combo:");
        System.out.println("1. Combo Master");
        System.out.println("2. Super Combo");
        System.out.print("Sua escolha: ");

        Scanner input = new Scanner(System.in);
        int tipo = input.nextInt();

        Combo combo = new Combo();
        combo.criarCombo(tipo);
        combo.mostrarItensDoCombo();
    }
}
