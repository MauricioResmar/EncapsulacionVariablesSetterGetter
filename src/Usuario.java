public class Usuario {
    public static void main(String[] args){
        //4). Instanciamos la clase Personax en la variable personax como un nuevo objeto.
        Persona persona = new Persona();

        //5). Invocamos nuestro objeto personax.RespectivoMetodo y le pasamos parametros.
        persona.setNombre("Mauricio");
        persona.setEdad(31);
        persona.setTelefono("3505730699");

        /*6). Por último, procedemos a imprimir en consola, la respectiva data
              asignada a las variables privadas de la clase Personax,
              mediante tecnica de encapsulación y haciendo uso de los
              metodos getter y setter aprendidos en clase. Muchas gracias!.*/

        System.out.println("El nombre con (Tipo de dato private) es:" + " " + persona.getNombre());
        System.out.println("La edad con (Tipo de dato private) es:" + " " + persona.getEdad());
        System.out.println("El telefono con (Tipo de dato private) es:" + " " + persona.getTelefono());

    }
}
class Persona {
    /*1). Declaramos las variables privadas dentro de la clase Personax*/
    private String nombre;
    private int edad;
    private String telefono;

    /*2). Usamos metodo setTer para asignarle un nuevo valor a las variables
     * mediante data enviada, desde el programa principal (main) donde se instancio la clase.
     *
     * 3). Usamos el respectivo metodo getTer para retornar los valores asignados a las variables privadas.
     *
     * */
    public void setNombre(String nombre){this.nombre = nombre;}
    public String getNombre() {return this.nombre;}

    public void setEdad(int edad){this.edad = edad;}
    public int getEdad() {return this.edad;}

    public void setTelefono(String telefono){this.telefono = telefono;}
    public String getTelefono() {return this.telefono;}
}
