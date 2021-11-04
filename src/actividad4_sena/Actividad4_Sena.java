package actividad4_sena;
import java.util.Scanner;
public class Actividad4_Sena {

    public static void main(String[] args) {
        int materia, estudiantes ,i=1;
        double notaestudiante, notapromedio = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("---Promedio de notas por materia---");
        System.out.println("Digite la materia a calcular promedio: 1.Matematicas -- 2.Español -- 3.Inglés");
        materia = sc.nextInt();
       
        switch(materia){
            case(1):
                System.out.println("--Ha digitao la materia de Matematicas--");
                System.out.println("Digite la cantidad de estudiantes a registrar: ");
                estudiantes = sc.nextInt();
                System.out.println("--Nota: Recuerde utilizar coma ',' y no punto '.' al registrar la nota del estudiante.--");
                for ( i =1; i<=estudiantes; i++){
                    System.out.println("Digite la nota del estudiante "+i+": ");
                    notaestudiante = sc.nextDouble();
                    if(notaestudiante>5.0 || notaestudiante<1.0){
                       System.out.println("¡La nota ingresada no es valida!");
                       i--;
                    }else{
                         notapromedio = notapromedio + notaestudiante; 
                    }
                }
                notapromedio = notapromedio / estudiantes;
                System.out.println("Promedio de la materia: "+notapromedio);
                break;
            case(2):
                System.out.println("--Ha digitao la materia de Español--");
                System.out.println("Digite la cantidad de estudiantes a registrar: ");
                estudiantes = sc.nextInt();
                System.out.println("--Nota: Recuerde utilizar coma ',' y no punto '.' al registrar la nota del estudiante.--");
                while(i<=estudiantes){
                    System.out.println("Digite la nota del estudiante "+i+": ");
                    notaestudiante = sc.nextDouble();
                    if(notaestudiante>5.0 || notaestudiante<1.0){
                       System.out.println("¡La nota ingresada no es valida!"); 
                       i--;
                    }else{
                         notapromedio = notapromedio + notaestudiante; 
                    }
                    i++;
                }
                notapromedio = notapromedio / estudiantes;
                System.out.println("Promedio de la materia: "+notapromedio);  
                break;
            case(3):
                System.out.println("--Ha digitao la materia de Inglés--");
                System.out.println("Digite la cantidad de estudiantes a registrar: ");
                estudiantes = sc.nextInt();
                System.out.println("--Nota: Recuerde utilizar coma ',' y no punto '.' al registrar la nota del estudiante.--");
                do{
                    System.out.println("Digite la nota del estudiante "+i+": ");
                    notaestudiante = sc.nextDouble();
                    if(notaestudiante>5.0 || notaestudiante<1.0){
                       System.out.println("¡La nota ingresada no es valida!"); 
                       i--;
                    }else{
                         notapromedio = notapromedio + notaestudiante; 
                    }
                    i++;   
                }while(i<=estudiantes);
                notapromedio = notapromedio / estudiantes;
                System.out.println("Promedio de la materia: "+notapromedio);
                break;
        }
    }   
}
