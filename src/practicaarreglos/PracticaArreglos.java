package practicaarreglos;
import javax.swing.JOptionPane;
public class PracticaArreglos {
public static void main(String[] args) {
   
    
    int login = 0;
        String usuarios [][]= {
            //email, contraseña
            {"david@uniceba.edu.mx","25"},
            {"pamela@uniceba.edu.mx","19"},
            {"regina@uniceba.edu.mx","18"}
        };
        String email = 
               JOptionPane.showInputDialog("Ingresa el correo");
        String password =
               JOptionPane.showInputDialog("Ingresa la contraseña");
          
       for (int contador = 0;
                contador < usuarios.length;
                contador++)   
          
         if (email.equals(usuarios [contador][0])&& password.equals(usuarios[contador][1])){   
              login = 1;    
        }
       
       if(login == 1){
           
    JOptionPane.showMessageDialog(null, "Bienvenido");
}else{
       
       JOptionPane.showMessageDialog(null, "Error de Usuario");}
       
      }
    }