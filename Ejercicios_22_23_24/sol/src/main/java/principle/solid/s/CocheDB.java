package principle.solid.s;

import java.util.ArrayList;

public class CocheDB {
    public ArrayList<Coche> CocheDataBase = new ArrayList<>();
        void saveCocheDB(Coche coche){
            CocheDataBase.add(coche);
        }
        void deleteCocheDB(Coche coche){
            CocheDataBase.remove(coche);
        }
}
