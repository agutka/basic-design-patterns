package flyweight;

public class UnitsStatsRepository {

    private static UnitStats destroyerStats = new UnitStats("Destroyer",150,50,50,50,250);
    private static UnitStats riflemanStats = new UnitStats("Rifleman",100,50,25,15,50);
    private static UnitStats telsaTankStats = new UnitStats("TeslaTank",200,100,50,25,500);

    private UnitsStatsRepository() {}

    public static UnitStats getDestroyerUnitStats() {

        return destroyerStats;
    }

    public static UnitStats getRiflemanUnitsStats() {

        return riflemanStats;
    }

    public static UnitStats getTeslaTankUnitStats() {

        return telsaTankStats;
    }
}
