package ec.edu.ups.poo.principal;
    import java.util.Calendar;
    import java.util.GregorianCalendar;
    import java.util.Scanner;
    import ec.edu.ups.poo.clases.Familia;
    import ec.edu.ups.poo.clases.Persona;
    //Colaborador: Juan Pablo Ortiz
    //LibretaDeContactos
    //Propietario: Mateo Molina
    //PruebaDeSeguridad

        public class Principal {
            public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);

                System.out.println("----------------------------Registro de personas-----------------------------");
                System.out.println("Cuantas personas ingresaran?: ");

                int x = leer.nextInt();
                Persona[] personas = new Persona[x];
                Familia[] familiares = new Familia[x];
                int cont = 0;
                int conP = 1;
                int conF = 0;
                int repDia = 0;
                int repMes = 0;

                Persona persona = new Persona();
                for (int i = 0; i < x; i++) {
                    repMes = 0;
                    repDia = 0;
                    System.out.println("Persona " + conP);
                    conP++;
                    System.out.println("Ingrese el numero de cedula: ");
                    String cedula = leer.next();
                    System.out.println("Ingrese el nombre: ");
                    String nombre = leer.next();
                    System.out.println("Ingrese el apellido: ");
                    String apellido = leer.next();
                    System.out.println("Ingrese el numero de telefono: ");
                    String numero = leer.next();
                    System.out.println("Ingrese la direccion: ");
                    String direccion = leer.next();
                    System.out.println("El contacto es familiar: (true/false)");
                    boolean familiar = leer.nextBoolean();
                    leer.nextLine();


                    if (familiar) {
                        System.out.println("Ingrese el parentesco: ");
                        String parentesco = leer.nextLine();
                        System.out.println("Ingrese su tipo de Sangre:");
                        String tipoSangre = leer.next();
                        System.out.println("Ingrese su fecha de nacimiento: ");
                        System.out.println("Ingrese el año: (No años con un cero delante)");
                        int ano = leer.nextInt();
                        int mes=1;
                        int dia=1;
                        while(repMes==0) {
                            System.out.println("Ingrese el mes: (1-12) ");
                            mes = leer.nextInt();
                            if (mes<1 || mes>12){
                                repMes=0;
                            }else{
                                repMes=10;
                            }
                        }
                        while(repDia==0) {
                            System.out.println("Ingrese el día: (1-31)");
                            dia = leer.nextInt();
                            if (dia<1 || dia>31){
                                repDia=0;
                            }else{
                                repDia=10;
                            }
                        }


                        //importar el gregorian fechaNac, un objeto de tipo GregorianCalendar
                        GregorianCalendar fechaNac = new GregorianCalendar(ano, mes, dia);


                        Familia fam = new Familia(cedula, nombre, apellido, direccion, numero, familiar, parentesco, tipoSangre, fechaNac, 0);
                        int edad = fam.calcularEdad();
                        fam.setEdad(edad);
                        personas[i] = fam;
                        familiares[cont] = fam;
                        cont++;

                    } else {
                        personas[i] = new Persona(cedula, nombre, apellido, direccion, numero, false);
                    }



                    persona.setCedula(cedula);
                    persona.setNombre(nombre);
                    persona.setApellido(apellido);
                    persona.setDireccion(direccion);
                    persona.setNumero(numero);
                    persona.setFamiliar(familiar);


                }
                for (int t = 0; t < x; t++) {
                    System.out.println(personas[t].getNombre());
                    System.out.println(personas[t].getApellido());
                    System.out.println(personas[t].getCedula());
                    System.out.println(personas[t].getDireccion());
                    System.out.println(personas[t].getNumero());
                    System.out.println(personas[t].getFamiliar());
                }

                System.out.println("--------------------Lista de Contactos---------------------");
                for (int i = 0; i < x; i++) {

                    conF++;
                    System.out.println("Persona " + conF + ":");
                    System.out.println("Nombre: " + personas[i].getNombre() + ", Apellido: " + personas[i].getApellido());
                    System.out.println("Cedula: " + personas[i].getCedula());
                    System.out.println("Direccion: " + personas[i].getDireccion());
                    System.out.println("Numero: " + personas[i].getNumero());
                    System.out.println(" ");

                }
                System.out.println("\n---------- Lista de Familiares ----------");
                for (int i = 0; i < cont; i++) {
                    System.out.println(familiares[i]);
                    System.out.println();

                }
            }
        }


                /*


                GregorianCalendar calendar = new GregorianCalendar();
                        calendar.set(ano, mes, dia);
                        familiares.setFechaNac(calendar);
                        */

                //De la clase persona


                /*
                System.out.println(persona.toString());
                */

                //INVESTIGAR CARACTERES DE ESCAPE PARA TEXTO SYSTEM OUT PRINT





                /*
                Persona persona1 = new Persona();
                System.out.println("Registro de Persona 1");
                System.out.print("Ingrese el nombre: ");
                persona1.setNombre(leer.nextLine());
                System.out.print("Ingrese el apellido: ");
                persona1.setApellido(leer.nextLine());
                System.out.print("Ingrese la dirección: ");
                persona1.setDireccion(leer.nextLine());
                System.out.print("Ingrese la cédula: ");
                persona1.setCedula(leer.nextLine());
                System.out.print("Ingrese el número de teléfono: ");
                persona1.setNumero(leer.nextInt());
                leer.nextLine(); // Consumir salto de línea
                // Persona 2
                Persona persona2 = new Persona();
                System.out.println("Registro de Persona 2");
                System.out.print("Ingrese el nombre: ");
                persona2.setNombre(leer.nextLine());
                System.out.print("Ingrese el apellido: ");
                persona2.setApellido(leer.nextLine());
                System.out.print("Ingrese la dirección: ");
                persona2.setDireccion(leer.nextLine());
                System.out.print("Ingrese la cédula: ");
                persona2.setCedula(leer.nextLine());
                System.out.print("Ingrese el número de teléfono: ");
                persona2.setNumero(leer.nextInt());
                leer.nextLine();
                // Persona 3
                Persona persona3 = new Persona();
                System.out.println("Registro de Persona 3");
                System.out.print("Ingrese el nombre: ");
                persona3.setNombre(leer.nextLine());
                System.out.print("Ingrese el apellido: ");
                persona3.setApellido(leer.nextLine());
                System.out.print("Ingrese la dirección: ");
                persona3.setDireccion(leer.nextLine());
                System.out.print("Ingrese la cédula: ");
                persona3.setCedula(leer.nextLine());
                System.out.print("Ingrese el número de teléfono: ");
                persona3.setNumero(leer.nextInt());
                leer.nextLine();
                // Persona 4
                Persona persona4 = new Persona();
                System.out.println("Registro de Persona 4");
                System.out.print("Ingrese el nombre: ");
                persona4.setNombre(leer.nextLine());
                System.out.print("Ingrese el apellido: ");
                persona4.setApellido(leer.nextLine());
                System.out.print("Ingrese la dirección: ");
                persona4.setDireccion(leer.nextLine());
                System.out.print("Ingrese la cédula: ");
                persona4.setCedula(leer.nextLine());
                System.out.print("Ingrese el número de teléfono: ");
                persona4.setNumero(leer.nextInt());
                leer.nextLine();
                // Persona 5
                Persona persona5 = new Persona();
                System.out.println("Registro de Persona 5");
                System.out.print("Ingrese el nombre: ");
                persona5.setNombre(leer.nextLine());
                System.out.print("Ingrese el apellido: ");
                persona5.setApellido(leer.nextLine());
                System.out.print("Ingrese la dirección: ");
                persona5.setDireccion(leer.nextLine());
                System.out.print("Ingrese la cédula: ");
                persona5.setCedula(leer.nextLine());
                System.out.print("Ingrese el número de teléfono: ");
                persona5.setNumero(leer.nextInt());
                leer.nextLine();
                // Persona 6
                Persona persona6 = new Persona();
                System.out.println("Registro de Persona 6");
                System.out.print("Ingrese el nombre: ");
                persona6.setNombre(leer.nextLine());
                System.out.print("Ingrese el apellido: ");
                persona6.setApellido(leer.nextLine());
                System.out.print("Ingrese la dirección: ");
                persona6.setDireccion(leer.nextLine());
                System.out.print("Ingrese la cédula: ");
                persona6.setCedula(leer.nextLine());
                System.out.print("Ingrese el número de teléfono: ");
                persona6.setNumero(leer.nextInt());
                leer.nextLine();
                // Persona 7
                Persona persona7 = new Persona();
                System.out.println("Registro de Persona 7");
                System.out.print("Ingrese el nombre: ");
                persona7.setNombre(leer.nextLine());
                System.out.print("Ingrese el apellido: ");
                persona7.setApellido(leer.nextLine());
                System.out.print("Ingrese la dirección: ");
                persona7.setDireccion(leer.nextLine());
                System.out.print("Ingrese la cédula: ");
                persona7.setCedula(leer.nextLine());
                System.out.print("Ingrese el número de teléfono: ");
                persona7.setNumero(leer.nextInt());
                leer.nextLine();
                // Persona 8
                Persona persona8 = new Persona();
                System.out.println("Registro de Persona 8");
                System.out.print("Ingrese el nombre: ");
                persona8.setNombre(leer.nextLine());
                System.out.print("Ingrese el apellido: ");
                persona8.setApellido(leer.nextLine());
                System.out.print("Ingrese la dirección: ");
                persona8.setDireccion(leer.nextLine());
                System.out.print("Ingrese la cédula: ");
                persona8.setCedula(leer.nextLine());
                System.out.print("Ingrese el número de teléfono: ");
                persona8.setNumero(leer.nextInt());
                leer.nextLine();
                // Persona 9
                Persona persona9 = new Persona();
                System.out.println("Registro de Persona 9");
                System.out.print("Ingrese el nombre: ");
                persona9.setNombre(leer.nextLine());
                System.out.print("Ingrese el apellido: ");
                persona9.setApellido(leer.nextLine());
                System.out.print("Ingrese la dirección: ");
                persona9.setDireccion(leer.nextLine());
                System.out.print("Ingrese la cédula: ");
                persona9.setCedula(leer.nextLine());
                System.out.print("Ingrese el número de teléfono: ");
                persona9.setNumero(leer.nextInt());
                leer.nextLine();
                // Persona 10
                Persona persona10 = new Persona();
                System.out.println("Registro de Persona 10");
                System.out.print("Ingrese el nombre: ");
                persona10.setNombre(leer.nextLine());
                System.out.print("Ingrese el apellido: ");
                persona10.setApellido(leer.nextLine());
                System.out.print("Ingrese la dirección: ");
                persona10.setDireccion(leer.nextLine());
                System.out.print("Ingrese la cédula: ");
                persona10.setCedula(leer.nextLine());
                System.out.print("Ingrese el número de teléfono: ");
                persona10.setNumero(leer.nextInt());
                leer.nextLine();

                System.out.println("\n------------------------ Contactos Registrados ------------------------");
                System.out.println("Persona 1: " + persona1.getNombre() + " " + persona1.getApellido() + ", " + persona1.getDireccion() + ", Cédula: " + persona1.getCedula() + ", Tel: " + persona1.getNumero());
                System.out.println("Persona 2: " + persona2.getNombre() + " " + persona2.getApellido() + ", " + persona2.getDireccion() + ", Cédula: " + persona2.getCedula() + ", Tel: " + persona2.getNumero());
                System.out.println("Persona 3: " + persona3.getNombre() + " " + persona3.getApellido() + ", " + persona3.getDireccion() + ", Cédula: " + persona3.getCedula() + ", Tel: " + persona3.getNumero());
                System.out.println("Persona 4: " + persona4.getNombre() + " " + persona4.getApellido() + ", " + persona4.getDireccion() + ", Cédula: " + persona4.getCedula() + ", Tel: " + persona4.getNumero());
                System.out.println("Persona 5: " + persona5.getNombre() + " " + persona5.getApellido() + ", " + persona5.getDireccion() + ", Cédula: " + persona5.getCedula() + ", Tel: " + persona5.getNumero());
                System.out.println("Persona 6: " + persona6.getNombre() + " " + persona6.getApellido() + ", " + persona6.getDireccion() + ", Cédula: " + persona6.getCedula() + ", Tel: " + persona6.getNumero());
                System.out.println("Persona 7: " + persona7.getNombre() + " " + persona7.getApellido() + ", " + persona7.getDireccion() + ", Cédula: " + persona7.getCedula() + ", Tel: " + persona7.getNumero());
                System.out.println("Persona 8: " + persona8.getNombre() + " " + persona8.getApellido() + ", " + persona8.getDireccion() + ", Cédula: " + persona8.getCedula() + ", Tel: " + persona8.getNumero());
                System.out.println("Persona 9: " + persona9.getNombre() + " " + persona9.getApellido() + ", " + persona9.getDireccion() + ", Cédula: " + persona9.getCedula() + ", Tel: " + persona9.getNumero());
                System.out.println("Persona 10: " + persona10.getNombre() + " " + persona10.getApellido() + ", " + persona10.getDireccion() + ", Cédula: " + persona10.getCedula() + ", Tel: " + persona10.getNumero());
            */

                // Persona 1-
                /*
                Persona persona1 = new Persona(); //Da el valor a la cedula
                persona1.setCedula("54654652");//Establece el valor nuevo a la cedula

                String cedula = persona1.getCedula();
                System.out.println(cedula);

                Persona persona2 = new Persona();
                persona2.setCedula("123456789");
                persona2.setNombre("Juan");
                persona2.setApellido("Perez");
                persona2.setDireccion("Calle 123");

                Persona persona3 = new Persona("65484980","MAteo");
                String ced=persona3.getCedula();
                String nom=persona3.getNombre();
                System.out.println(ced+ nom);
                /*
                 */

