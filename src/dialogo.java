import javax.swing.JOptionPane;

public class dialogo {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null,"Bienvenio\na\nJAVA");
        //JOptionPane.showMessageDialog(null,"Hola Mundo");


        String nombre=
                JOptionPane.showInputDialog("¿Cuál es su nombre?:");
        String mensaj=
                String.format("Bienbenido, %s,  a la progrmcion en Java!",nombre);

        JOptionPane.showMessageDialog(null,mensaj);


        try{

        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,"\n\tEROR");
        }



    }
}
