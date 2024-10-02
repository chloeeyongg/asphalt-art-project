import org.code.neighborhood.*;

public class RedPinkBow extends MuralPainter {

//constructor 
  public RedPinkBow() {
    
  } //end of constructor

  public void paintRedPinkBow(String mainColor,String secondColor, String thirdColor) {
  move();
  paintBow(mainColor, secondColor, thirdColor);
    
  } //end of paintRedPinkBow

  public void paintBow(String mainColor, String secondColor, String thirdColor) {

//This is the start of the bow 

    
    //1st Row
    paintLine(mainColor,4);
    paintLine(thirdColor,6);
    paintLine(mainColor,4);
    move(1);
   
    //2nd Row
    paintLine(mainColor,1);
    paintLine(secondColor,4);
    paintLine(mainColor,1);
    paintLine(thirdColor,1);
    paintLine(mainColor,2);
    paintLine(thirdColor,1);
    paintLine(mainColor,1);
    paintLine(secondColor,4);
    paintLine(mainColor,1);
    turnLeft();
    move();
    turnLeft();
  
    //3rd Row
    paintLine(mainColor,1);
    paintLine(secondColor,5);
    paintLine(mainColor,1);
    paintLine(secondColor,2);
    paintLine(mainColor,1);
    paintLine(secondColor,5);
    paintLine(mainColor,1);
    move(1);
   
    //4th Row
    paintLine(mainColor,1);
    paintLine(secondColor,3);
    paintLine(mainColor,3);
    paintLine(secondColor,2);
    paintLine(mainColor,3);
    paintLine(secondColor,3);
    paintLine(mainColor,1);
    turnLeft();
    move();
    turnLeft();
   
    //5th Row
    paintLine(mainColor,1);
    paintLine(secondColor,5);
    paintLine(mainColor,1);
    paintLine(secondColor,2);
    paintLine(mainColor,1);
    paintLine(secondColor,5);
    paintLine(mainColor,1);
    move(1);
   
    //6th Row
    paintLine(mainColor,1);
    paintLine(secondColor,4);
    paintLine(mainColor,1);
    paintLine(secondColor,1);
    paintLine(mainColor,2);
    paintLine(secondColor,1);
    paintLine(mainColor,1);
    paintLine(secondColor,4);
    paintLine(mainColor,1);
    turnLeft();
    move();
    turnLeft();
   
    //7th Row
    paintLine(thirdColor,1);
    paintLine(mainColor,4);
    paintLine(secondColor,1);
    paintLine(mainColor,1);
    paintLine(thirdColor,2);
    paintLine(mainColor,1);
    paintLine(secondColor,1);
    paintLine(mainColor,4);
    move(1);
   
    //8th row
    paintLine(thirdColor,2);
    paintLine(mainColor,1);
    paintLine(secondColor,3);
    paintLine(mainColor,1);
    paintLine(thirdColor,2);
    paintLine(mainColor,1);
    paintLine(secondColor,3);
    paintLine(mainColor,1);
    turnLeft();
    move();
    turnLeft();
   
    //9th row
    paintLine(mainColor,1);
    paintLine(secondColor,3);
    paintLine(mainColor,1);
    paintLine(thirdColor,4);
    paintLine(mainColor,1);
    paintLine(secondColor,3);
    paintLine(mainColor,1);
    move(1);
   
    //10th row
    paintLine(mainColor,1);
    paintLine(secondColor,4);
    paintLine(mainColor,1);
    paintLine(thirdColor,4);
    paintLine(mainColor,1);
    paintLine(secondColor,4);
    paintLine(mainColor,1);
    turnLeft();
    move();
    turnLeft();
   
    //11th row
    paintLine(thirdColor,1);
    paintLine(mainColor,2);
    paintLine(secondColor,1);
    paintLine(mainColor,1);
    paintLine(thirdColor,6);
    paintLine(mainColor,1);
    paintLine(secondColor,1);
    paintLine(mainColor,2);
    move(1);

//This is the last part of the bow
    
    //12th row
    paintLine(thirdColor,3);
    paintLine(mainColor,1);
    paintLine(thirdColor,8);
    paintLine(mainColor,1);  



//This is the end of the code where the painter finishes off into the bottom right corner
//This part just turns the Painter to the end of the picture so you can see the full bow


    
    move();
    move();
    turnLeft();
    turnLeft();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();     
    turnRight();
    move();
    move();
    move();
    move();
    }
    
  } // end of paint bow



  
//end of class