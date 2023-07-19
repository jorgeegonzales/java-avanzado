package principle.solid.l;

import java.util.ArrayList;

public class CocheDB {
    public ArrayList<CombustionCar> CocheDataBase = new ArrayList<>();
        void saveCocheDB(CombustionCar coche){
            CocheDataBase.add(coche);
        }
        void deleteCocheDB(CombustionCar coche){
            CocheDataBase.remove(coche);
        }
}
