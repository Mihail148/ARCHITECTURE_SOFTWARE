package Homework2.Task1.Classes.Rewards.Bronze.Gem.Gold;

import Homework2.Task1.Classes.IGameItem;
import Homework2.Task1.Classes.ItemGenerator;

public class GoldFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Gold();
    }
}
