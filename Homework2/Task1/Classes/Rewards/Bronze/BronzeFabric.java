package Homework2.Task1.Classes.Rewards.Bronze;

import Homework2.Task1.Classes.IGameItem;
import Homework2.Task1.Classes.ItemGenerator;

public class BronzeFabric extends ItemGenerator {
    
    @Override
    public IGameItem createItem() {
        return new Bronze();
    }
}
