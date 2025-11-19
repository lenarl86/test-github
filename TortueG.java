
/**
* La tortue du programme LOGO. Graphique !
*
* @author PG
* @version 9/09/2007
*/
public class TortueG {
    // Position de la tortue
    protected int x;
    protected int y;

    // Direction de la tortue
    protected int direction;

    // Mode de la tortue
    protected boolean trace;

    /**
    * Constructor for objects of class Tortue
    */
    public TortueG() {
        // initialise uniquement la direction et la trace
        // Par défaut, elle est en (0,0)
        direction = 3;
        trace = true;
    }

    /**
     * Accesseur de la direction
     *
     * @return     la valeur de la direction
     */
    protected int getDirection() {
        return direction;
    }
     protected int getPositionX() {
        return x;
    }
    protected int getPositionY() {
        return y;
    }

    /**
     * Méthode permettant à la tortue d'avancer dans la direction fixée
     */
    protected void avancer() {
        switch(direction) {
            case 0:
                if (trace) CanvasTortue.ecrisHorizontal(x, y, "black");
                x++;
                break;
            case 1:
                if (trace) CanvasTortue.ecrisVertical(x, y, "black");
                y++;
                break;
            case 2:
                x--;
                if (trace) CanvasTortue.ecrisHorizontal(x, y, "black");
                break;
            case 3:
                y--;
                if (trace) CanvasTortue.ecrisVertical(x, y, "black");
        }
        afficherTortue();
    }

    /**
     * Méthode permettant de tourner, dans le sens des aiguilles d'une montre
     */
    protected void tourner() {
        direction++;
        if(direction == 4)
            direction = 0;
        afficherTortue();
    }

    /**
     * Méthode permettant de tracer ou non
     * Remarque : cette implémentation n'est pas correcte : elle ne garantit pas
     * un appel correct des méthodes ; on peut appeler deux fois de suite
     * tracer(true) par exemple
     *
     * @param  mode   booléen représentant le mode de trace (vrai ou faux)
     */
    protected void tracer(boolean mode) {
        trace = mode;
        afficherTortue();
    }

    /**
     * Affichage de la tortue
     */
    protected void afficherTortue() {
        if(trace)
            System.out.println("La tortue trace");
        else
            System.out.println("La tortue ne trace pas");
        switch(direction) {
            case 0:
                CanvasTortue.tortueEst(x, y);
                break;
            case 1:
                CanvasTortue.tortueSud(x, y);
                break;
            case 2:
                CanvasTortue.tortueOuest(x, y);
                 break;
            case 3:
                CanvasTortue.tortueNord(x, y);
        }
    }
}
