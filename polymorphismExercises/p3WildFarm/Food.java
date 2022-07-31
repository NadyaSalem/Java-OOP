package oop.polymorphismExercises.p3WildFarm;

public abstract class Food {

   public Integer quantity;

    public Food(Integer quantity) {
       setQuantity(quantity);
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
