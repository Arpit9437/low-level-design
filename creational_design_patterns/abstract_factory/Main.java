public class Main {
    public static void main(String[] args) {
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.fetchChair();
        Table modernTable = modernFactory.fetchTable();

        modernChair.sitOn();
        modernTable.use();

        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.fetchChair();
        Table victorianTable = victorianFactory.fetchTable();

        victorianChair.sitOn();
        victorianTable.use();
    }
}
