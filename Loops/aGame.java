public class aGame {
    public static void main (String [] args){
        int Score = 0;
        int lifePoints = 5;

        while (lifePoints > 0){
            boolean isAlienHit = Math.random() > 0.5;

            if(isAlienHit){
                Score += 10;
                System.out.println("points gained");
            }
            else{
                System.out.println("life lost");
                lifePoints -= 1;
            }
            
        }
        System.out.println(Score);
    }
}