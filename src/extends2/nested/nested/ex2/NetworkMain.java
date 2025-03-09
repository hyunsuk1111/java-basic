package extends2.nested.nested.ex2;

import extends2.nested.nested.ex1.Network;

public class NetworkMain {

    public static void main(String[] args) {
        Network network = new Network();

        network.sendMessage("hello java");
    }
}
