package Homework2.Task1.Classes.Rewards.Bronze.Gem.Gold.Platinum.Ruby;

import Homework2.Task1.Classes.IGameItem;
import Homework2.Task1.Classes.ItemGenerator;

public class RubyFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Ruby();
    }
}
