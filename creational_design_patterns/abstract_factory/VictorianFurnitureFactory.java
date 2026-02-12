public class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair fetchChair(){
        return new VictorianChair();
    }

    @Override
    public Table fetchTable(){
        return new VictorianTable();
    }
}
