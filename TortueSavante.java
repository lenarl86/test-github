
/**
* Write a description of class TortueSavante here.
*
* @author (your name)
* @version (a version number or a date)
*/
public class TortueSavante extends TortueG
{
    /**
    * Constructor for objects of class Tortue
    */
    public TortueSavante()
    {
        // initialise uniquement la direction et la trace
        direction = 3;
        trace = true;
    }

    /**
     * Affichage de l'Žtat de la tortue
     */
    public void afficherEtat()
    {
        System.out.println("La tortue est en x:" + x + ", y:" + y + ", et en direction : " + direction);
        super.afficherTortue();
    }

    /**
     * MŽthode utilitaire d'affichage de segment
     *
     * @param  ox oy   coordonn?s initiales du segment
     * @param  x y   coordonn?s finales du segment
     */
    public void afficherSegment(int ox, int oy, int x, int y)
    {
        System.out.println("segment (" + ox + "," + oy + "),(" + x + "," + y + ")");
    }

    /**
     * Pour parler
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public void parler(String s)
    {
        System.out.println(s);
    }

}
