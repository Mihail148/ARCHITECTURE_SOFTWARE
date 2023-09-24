package Homework2.Task1.Classes.Rewards.Bronze;

import Homework2.Task1.Classes.IGameItem;

public class Bronze implements IGameItem {
    @Override
    public void open() {
        System.out.println("Bronze!");
    }
}
