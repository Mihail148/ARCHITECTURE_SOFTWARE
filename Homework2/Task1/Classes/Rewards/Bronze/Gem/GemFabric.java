package Homework2.Task1.Classes.Rewards.Bronze.Gem;

import Homework2.Task1.Classes.IGameItem;
import Homework2.Task1.Classes.ItemGenerator;

public class GemFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Gem();
    }
}
