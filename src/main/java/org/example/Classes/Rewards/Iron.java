package org.example.Classes.Rewards;

import org.example.Classes.iGameItem;

public class Iron implements iGameItem {
    @Override
    public void open() {
        System.out.println("Iron!");
    }
}
