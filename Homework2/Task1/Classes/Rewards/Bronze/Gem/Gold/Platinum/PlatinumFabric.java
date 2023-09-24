package Homework2.Task1.Classes.Rewards.Bronze.Gem.Gold.Platinum;

import Homework2.Task1.Classes.IGameItem;
import Homework2.Task1.Classes.ItemGenerator;

public class PlatinumFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Platinum();
    }
}
