package mx.edu.cesba;


public class AlumnosMain {
    public static void main (String[]arg){
        ControlEscolar alumno1=new ControlEscolar();
        ControlEscolar alumno2=new ControlEscolar();
        
        alumno1.matricula=(263242);
        alumno1.nombre="Mauricio";
        alumno1.apellidoPaterno="Alavaraz";
        alumno1.apellidoMaterno="Gonazales";
        alumno1.Edad=18;
        alumno1.carrera="ISC";
        alumno1.telefono=442114;
        
        alumno1.imprimirAlumno();
        
        
        alumno2.matricula=(2410504);
        alumno2.nombre="Estefania";
        alumno2.apellidoPaterno="Villegas";
        alumno2.apellidoMaterno="Barcenas";
        alumno2.Edad= 19;
        alumno2.carrera="ISC";
        alumno2.telefono=44281052;
        
        alumno1.imprimirAlumno();
        
        
   }
}
