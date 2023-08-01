
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        this.numbers = new ArrayList<>();
        
        Random random = new Random();
        
        for (int i = 1; i <= 7; i++) {
            int randomNumber = random.nextInt(40) + 1;
            if (containsNumber(randomNumber)) {
                i--;
            } else {
                this.numbers.add(randomNumber);
            }
        }

    }

    public boolean containsNumber(int number) {
        
        if (this.numbers.contains(number)) {
            return true;
        }
        return false;
    }
}

