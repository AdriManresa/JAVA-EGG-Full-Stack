package colecciones;

import java.util.ArrayList;

public class Colecciones {

    public static void main(String[] args) {
        //Array
        //objeto de tipo string un array de una dimencion
        String[] nombresArray = new String[5]; //crear array

        for (int i = 0; i < nombresArray.length; i++) { //llenar array
            nombresArray[i] = "Chiquito " +(i + 1);
        }
        
        for (String var : nombresArray) { //mostrar array
            System.out.println(var);
        }
        
        
        //Colections
        ArrayList<String> nombresArrayList = new ArrayList();
        
        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");
        
        
        System.out.println(nombresArrayList.size());
        
        nombresArrayList.remove("Chiquito");
        
        System.out.println(nombresArrayList.size());
    }

}
