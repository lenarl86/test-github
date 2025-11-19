
/**
 * Write a description of class TortueRapide here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TortueRapide extends TortueG
{
    // Vitesse de la tortue
    private int vitesse;
    
    /**
     * Constructor for objects of class Tortue
     */
    public TortueRapide()
    {
        // initialise uniquement la direction et la trace
        direction = 3;
        trace = true;
        vitesse = 1;
    }

    /**
     * Mthode permettant ˆ la tortue d'avancer dans la direction fixe
      */
    public void avancer()
    {   int ox, oy;
        ox=x;
        oy=y;
        for (int v=vitesse; v>0; v--)
            super.avancer();
    }
    
    /**
     * Affichage de l'tat de la tortue
     */
    public void afficherEtat()
    {
        System.out.println("La tortue est en x:" + x + ", y:" + y +
                            ", et en direction : " + direction + 
                            " de " + vitesse + " cases");
       super.afficherTortue(); 
            } 
    
    /**
     * Mthode utilitaire d'affichage de segment
     *
     * @param  ox oy   coordonnes initiales du segment
     * @param  x y   coordonnes finales du segment
     */
    public void afficherSegment(int ox, int oy, int x, int y)
    {
        System.out.println("segment (" + ox + "," + oy + "),(" +
                            x + "," + y + ")" );
       
    }
    
    /**
     * Premire implmnetation : paramtrer avancer
     *
     * @param  v   vitesse de la tortue (par dfaut 1)
     */
    public void avancer(int v)
    {
        int ox, oy;
        ox=x;
        oy=y;
        switch (direction) {
            case 0: x+=v; break;
            case 1: y+=v; break;
            case 2: x-=v; break;
            case 3: y-=v;
        } 
        afficherEtat();
        if (trace) afficherSegment(ox,oy,x,y);
    }
    
    /**
     * Deuxime implmentation : changer la vitesse
     *
     * @param  v   nouvelle vitesse
     */
    public void setVitesse(int v)
    {
         vitesse = v;
         afficherEtat();
    }
    
    public void accelerer()
    {
        vitesse++;
    }
    
    public void ralentir()
    {
        if (vitesse>0) vitesse--;
    }
    
}
