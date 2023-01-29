package io.oops.pizza;

public class pizza {
    String bread;
    String sauce;
    String cheeze;
    String topping;

    public pizza() {
        bread = "No bread";
        sauce = "No sauce";
        cheeze = "No cheeze";
        topping = "No topping";
    }

    public pizza(String bread, String sauce, String cheeze, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheeze = cheeze;
        this.topping = topping;
    }

    public pizza(String bread, String sauce, String cheeze) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheeze = cheeze;
        this.topping = "No topping";
    }

    public pizza(String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheeze = "No cheeze";
        this.topping = "No topping";
    }

    public pizza(String bread) {
        this.bread = bread;
        this.sauce = "No sauce";
        this.cheeze = "No cheeze";
        this.topping = "No topping";
    }

    @Override
    public String toString() {
        return this.bread + "\t" + this.cheeze + "\t" + this.sauce + "\t" + this.topping + "\n";
    }

}