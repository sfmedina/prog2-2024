// 2 Electrodomésticos
// Crear una clase Electrodoméstico con las siguientes características:
// Atributos son nombre, precio base, color, consumo energético y peso.
// Valores por defecto:
// ● El color por defecto es gris plata.
// ● El consumo energético 10 Kw.
// ● Precio base 100 pesos.
// ● El peso es 2 kg.
// Implementar todos los constructores.
// La funcionalidad de la clase es la siguiente:
// ● Todos los métodos get y set.
// ● Comprobar si el electrodoméstico es de bajo consumo (menor que 45 Kw)
// ● Calcular el balance, el mismo es el resultado de dividir el costo por el peso
// ● Indicar si un producto es de alta gama, el balance es mayor que 3
public class Electrodomestico {
    String nombre;
    double precioBase ;
    String color ;
    double consumo;
    double  peso;

    public Electrodomestico(){

      color ="gris plata";
      consumo = 10;
      precioBase=100;
      peso = 2;
  
   }   

 public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public double getPrecioBase() {
      return precioBase;
   }

   public void setPrecioBase(double precioBase) {
      this.precioBase = precioBase;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public double getConsumo() {
      return consumo;
   }

   public void setConsumo(double consumo) {
      this.consumo = consumo;
   }

   public double getPeso() {
      return peso;
   }

   public void setPeso(double peso) {
      this.peso = peso;
   }

   public boolean esBajoConsum(double consumo){
      return(consumo<45);
   }
   public double balance(double precioBase, double peso){
      return precioBase/peso;
   }

   public boolean esAltaGama(){
      double balance = balance(precioBase,peso);
      return (balance>3);
   }

    
}
