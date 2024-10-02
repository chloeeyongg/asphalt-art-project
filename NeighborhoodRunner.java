import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    //paints the background white
    MuralPainter bg = new MuralPainter();
    bg.paintBackground("white",16);

    //makes the Red and Pink Bow Ribbon
    RedPinkBow painting = new RedPinkBow();
    painting.paintRedPinkBow("red", "pink","white");

    
  }
}