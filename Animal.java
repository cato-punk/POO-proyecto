import java.time.LocalDateTime;

public class Animal {
    private String especie;  //especificamos si es gato, perro,etc
    private String raza;
    private String sexo;
    private String estado;
    private String lugar;
    private LocalDateTime fechaHoraRescate;
    private int edad;

    //vamos creando el objeto
    public Animal(String especie, String raza, String sexo, String estado, String lugar, LocalDateTime fechaHoraRescate, int edad) {
        this.especie = especie;
        this.raza = raza;
        this.sexo = sexo;
        this.estado = estado;
        this.lugar = lugar;
        this.fechaHoraRescate = fechaHoraRescate;
        this.edad = edad; // this es similar al self de phyton
    }

  //para obtener los valores que se dan en la otra clase por eso son public
    public String getEspecie() {
        return especie;
    }

    public String getRaza() {
        return raza;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEstado() {
        return estado;
    }

    public String getLugar() {
        return lugar;
    }

    public LocalDateTime getFechaHoraRescate() {
        return fechaHoraRescate;
    }

    public int getEdad() {
        return edad;
    }

    //esto es para que el veterinario pueda editar esta info (estado,raza,edad)
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // este es el como se ve la info (este fue recomenado, y lo quisiera cambiar mas adelante)
    @Override // indica que este metodo se sobreescribe en tostring
    public String toString() {
        return "Especie: " + especie + "\n" +
                "Raza: " + raza + "\n" +
                "Sexo: " + sexo + "\n" +
                "Estado: " + estado + "\n" +
                "Lugar: " + lugar + "\n" +
                "Fecha y Hora: " + fechaHoraRescate + "\n" +
                "Edad: " + edad;
    }
}