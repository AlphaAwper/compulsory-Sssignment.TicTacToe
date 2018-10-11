/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.bll;

/**
 *
 * @author nedas
 */
public interface IAiModel {
    public int AIMove(int AI);

    public void reset();
}
