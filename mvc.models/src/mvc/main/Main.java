package mvc.main;

import javax.swing.SwingUtilities;

import mvc.models.*;
import mvc.views.*;
import mvc.controllers.*;

public class Main
{
    public static void main(String[] args) {           
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {                                           
                Model model = new Model(0);
                View view = new View("This the view. Now push the button!"); 
                Controller controller = new Controller(model,view);
                controller.contol();
            }
        });  
    }
}