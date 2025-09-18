import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //CONSTRUCTOR VACIO

        Animal a1 = new Animal();

        a1.setNombre("LULU");
        a1.setEspecie("MAMIFERO");
        a1.setTamano(2.8);
        a1.setGenero("FEMENINO");


        System.out.println(a1.toString());

        System.out.println(a1.calcularTamano(a1.getTamano()));



      /*
        Animal a2 = new Animal("THOMAS", "CANINO", 1.3, "MASCULINO");

        System.out.println(a2.toString());


        Animal a3 = new Animal("COCO", "MASCULINO");
        System.out.println(a3.toString());


        System.out.println("LOS NOMBRES DE LOS ANIMALES SON");
        System.out.println(a1.getNombre());
        System.out.println(a2.getNombre());
        System.out.println(a3.getNombre());


*/

    }

}