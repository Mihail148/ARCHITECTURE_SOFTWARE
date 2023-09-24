package Homework2.Task1.Classes.Rewards.Bronze.Gem;

import Homework2.Task1.Classes.IGameItem;

public class Gem implements IGameItem {
    @Override
    public void open() {
        System.out.println("Gem!");
    }
}
