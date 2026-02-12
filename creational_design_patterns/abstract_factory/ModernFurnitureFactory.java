public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair fetchChair(){
        return new ModernChair();
    }

    @Override
    public Table fetchTable(){
        return new ModernTable();
    }
}
