package Homework2.Task1.Classes.Rewards.Bronze.Gem.Gold.Platinum.Ruby.Sapphire.Silver;

import Homework2.Task1.Classes.IGameItem;
import Homework2.Task1.Classes.ItemGenerator;

public class SilverFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Silver();
    }
}
