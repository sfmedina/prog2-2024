// Atributos: nombre, edad, fecha de nacimiento, DNI, sexo, peso y altura
// Valores por defecto:
// ● El DNI es un valor obligatorio, no posee valor por defecto.
// ● En caso de la fecha de nacimiento será el 1 de enero de 2000.
// ● Sexo será Femenino por defecto.
// ● El nombre por defecto es N y el apellido es N.
// ● El peso y la altura son 1 por defecto.
// Acorde a lo anterior se deben crear los constructores. Con DNI, con DNI nombre y
// apellido, con DNI nombre apellido y Fecha de nacimiento…..
// La responsabilidad de la clase es la siguiente:
// ● Cálculo del índice de masa Corporal. Una persona sabe calcular cuál es su índice
// de masa corporal el cual es peso / altura2

// ● Saber si está en forma. Está en forma si el índice de masa corporal se encuentra
// entre 18,5 y 25 (esto es solo un ejemplo para probar la funcionalidad).
// ● Saber si está cumpliendo años.
// ● Saber si es mayor de edad. Una persona es mayor de edad si es mayor de 18
// años
// ● Métodos set de cada parámetro, excepto de DNI.
// ● Saber si puede votar. Es necesario ser mayor de 16 años.
// ● Saber si es coherente. Que la fecha de nacimiento coincida con la edad.
// ● Mostrar toda la información del objeto.

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Period;
import java.util.Date;

public class Persona{
    String nombre;
    String apellido;
    int dni;
    int edad;
    double peso;
    int altura;    
    LocalDate nacimiento;
    String sexo;
    

 public Persona()    {
    nombre ="n";
    apellido ="n";
    nacimiento = LocalDate.of(2004,8,14);
    peso=1;
    altura = 1;
    sexo = "fem";





}
public  static void main(String[]args) {

Persona P = new Persona();
System.out.println(datosPersona(P));
System.out.println("es su cumple hoy?"+P.cumpleHoy(P.nacimiento));




}
public Persona(int dni){
    this.dni = dni;

}

public Persona(int dni, String nombre, String apellido){
    this.dni = dni;
    this.nombre = nombre;
    this.apellido = apellido;


}

public Persona(int dni, String apellido, LocalDate nacimiento){
    this.dni = dni;
    this.apellido = apellido;
    this.nacimiento = nacimiento;

}


public void setNombre(String nombre){
    this.nombre = nombre;
    

}
public double imc(double peso, int altura){
double imc =0;
imc= peso/(altura*altura);
return imc;
}

public boolean enForma(double imc){
    return(imc>18.5 &&imc<25);
}
public boolean cumpleHoy(LocalDate nac){
     LocalDate hoy = LocalDate.now();
        
        // Comparar mes y día, ignorando el año
        MonthDay cumpleanos = MonthDay.of(nac.getMonth(), nac.getDayOfMonth());
        MonthDay hoyMesDia = MonthDay.from(hoy);
        
        // Verificar si hoy es el cumpleaños
        return (cumpleanos.equals(hoyMesDia));


}
public boolean esMayor(LocalDate nac){
     // Fecha actual
        LocalDate hoy = LocalDate.now();
        
        // Calcular la edad
        Period edad = Period.between(nac, hoy);
        
        // Verificar si es mayor de 18 años
        return (edad.getYears() >= 18);

}
public boolean esvotante(LocalDate nac){
    // Fecha actual
       LocalDate hoy = LocalDate.now();
       
       
       Period edad = Period.between(nac, hoy);
       
       
       return (edad.getYears() >= 16);

}
public boolean esMayor(LocalDate nac, int edad){
    // Fecha actual
       LocalDate hoy = LocalDate.now();
       
       
       Period edadReal = Period.between(nac, hoy);
       
       
       return (edadReal.getYears() == edad);


    }

    public  static String datosPersona(Persona P){
        String Pers = "Nombre "+ P.nombre+ " Apellido "+P.apellido+" DNI "+P.dni+" Edad "+P.edad+" Sexo "+P.sexo+"fecha "+ P.nacimiento+ " peso"+P.peso+ "altura "+P.altura+ "IMC "+ P.imc(P.peso, P.altura)+"Puede votar?"+P.esvotante(P.nacimiento);  
        return Pers;
    }


}