abstract class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract void hacerSonido();

    public String getNombre() {
        return nombre;
    }
}

class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau guau!");
    }
}

class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau miau!");
    }
}

public class Ejercicio01 {
    public static void main(String[] args) {
        Animal[] animales = new Animal[4];
        animales[0] = new Perro("Rocky");
        animales[1] = new Gato("Michi");
        animales[2] = new Perro("Fido");
        animales[3] = new Gato("Luna");

        System.out.println("=== Sistema de Animales ===\n");

        for (Animal a : animales) {
            a.hacerSonido();
        }
    }
}