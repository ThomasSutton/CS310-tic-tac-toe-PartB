package edu.jsu.mcis;

public class TicTacToeView {

    private TicTacToeModel model;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
        
    }
	
    public void viewModel() {
        
        /* Print the board to the console (see examples) */
        
        /* INSERT YOUR CODE HERE */
        
        for (int p = 0; p < model.getWidth(); p++) {
            System.out.print(p);
            System.out.println();
            for (int i = 0; i < model.getWidth(); i++) {
                System.out.print(p + " ");
                for (int j = 0; j < model.getWidth(); j++){
                   System.out.print(model.getMark(i,j)); 
                }
                System.out.println();
            }
        }      
        

    }

    public void showNextMovePrompt() {

        /* Display a prompt for the player's next move (see examples) */

        /* INSERT YOUR CODE HERE */
        if (model.isXTurn()){
            System.out.println("Player 1 (X) Move:\n" +
            "Enter the row and column numbers, separated by a space: ");
        }
        else {
            System.out.println("Player 2 (O) Move:\n" +
            "Enter the row and column numbers, separated by a space: ");
        }

    }

    public void showInputError() {

        /* Display an error if input is invalid (see examples) */

        /* INSERT YOUR CODE HERE */
        System.out.println("Invalid Input");

    }

    public void showResult(String r) {

        /* Display final winner */

        System.out.println(r + "!");

    }
	
}