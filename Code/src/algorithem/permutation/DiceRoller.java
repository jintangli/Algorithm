package algorithem.permutation;

public class  DiceRoller{


    public static void main(String[] args){
        diceRolls(2);
    }

    public static void diceRolls(int dice){
        //array need to be reachable by all recursive calls
        Integer[] chosen = new Integer[dice];
        diceHelper(dice, chosen, 0);
    }

    public static void diceHelper(int dice, Integer[] chosen, int level){
        if (dice == 0){
            //base case, print out chosen array
            for(int i=0; i< level; ++i){
                System.out.print(chosen[i]);
            }
            System.out.println("");
        }else{
            //some dice left to roll
            //handle one die in current recursive call

            //for each value that die could have
            for (int i = 1; i<=6; i++){
                //	choose
                chosen[level] = i;
                //	explore
                diceHelper(dice-1, chosen, ++level);
                //	unchoose
                --level;
                chosen[level] = null;
            }
        }
    }




}