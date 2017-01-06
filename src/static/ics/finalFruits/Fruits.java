public class Fruits
{
    private String[] fruits;
    
    public Fruits() {
        fruits = new String[]{
            "apple",
            "banana"
        };
    }
    
    public int getFruitByIndex(int i) {
        if (i >= 0 && i < fruits.length) {
            return fruits[i];
        } else {
            return null;
        }
    }
}