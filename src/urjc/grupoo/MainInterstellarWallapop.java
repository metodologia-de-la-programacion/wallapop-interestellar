package urjc.grupoo;

import urjc.grupoo.data.ClaseDePueba;
import urjc.grupoo.system.backend.Database;

public class MainInterstellarWallapop {

    
    public static void main(String[] args) {
        Database db = new Database();
        ClaseDePueba p = new ClaseDePueba();
        p.propiedad = "La primera Prueba";
        db.loadFolder();
        
        
        System.out.println(((ClaseDePueba)db.get("Prueba")).propiedad);
        //((ClaseDePueba)db.get("Prueba")).propiedad = "La segunda prueba";
        //db.setDirty("Prueba");
        //db.addContainer("Prueba", p);
        db.save();
    }
}