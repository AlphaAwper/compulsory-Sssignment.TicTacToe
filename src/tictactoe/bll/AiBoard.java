/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.bll;

import javafx.scene.control.Button;
import java.util.Random;

/**
 *
 * @author nedas
 */
public class AiBoard implements IAiModel {
int[] AvailabeNumbers = new int[]{0,1,2,3,4,5,6,7,8};
    
    @Override
    public int AIMove(int AI) {
        if(AI == 0){
            return RandomIA();
        }else if (AI == 1){
            return MediumAI();
        }else{
            return HardAI();
        }
    }
    private int RandomIA() {
            int rnd = new Random().nextInt(AvailabeNumbers.length);
            if(AvailabeNumbers[rnd] != 0){
              int newButton = AvailabeNumbers[rnd];
              AvailabeNumbers[rnd]= 0 ;
              return newButton;
            }else{
              return  RandomIA();
            }
    }
        private int MediumAI() {
        return -1;
    }
            private int HardAI() {
        return -1;
    }

    @Override
    public void reset() {
        AvailabeNumbers = new int[]{0,1,2,3,4,5,6,7,8};
    }
}
